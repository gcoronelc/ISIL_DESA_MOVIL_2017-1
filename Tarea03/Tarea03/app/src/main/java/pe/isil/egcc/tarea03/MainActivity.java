package pe.isil.egcc.tarea03;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etRepo = (EditText) findViewById(R.id.etRepo);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        // return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_opciones_agregar) {
            Data.agregar(etNombre.getText().toString());
            etNombre.setText("");
        } else if (id == R.id.menu_opciones_listar) {
            listado();
        } else if (id == R. id.menu_opciones_eliminar) {
            Data.eliminar(etNombre.getText().toString());
            etNombre.setText("");
        }

        return super.onOptionsItemSelected(item);
    }

    private void listado() {
        String repo = "";
        for (String s : Data.nombres) {
            repo += s + "\n";
        }
        etRepo.setText(repo);
    }


    private void mostrarPagina(String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

}
