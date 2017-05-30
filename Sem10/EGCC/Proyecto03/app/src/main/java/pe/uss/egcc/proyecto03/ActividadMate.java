package pe.uss.egcc.proyecto03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActividadMate extends AppCompatActivity {

    // Variables
    private TextView tvFactorial;
    private TextView tvMcd;
    private EditText etNumero;
    private EditText etNumero1;
    private EditText etNumero2;
    private RadioGroup rgOpciones;
    private RadioButton rbActual;
    private LinearLayout layoutFactorial;
    private LinearLayout layoutMcd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_mate);
        initInterfaz();
        progRadioGroupOpciones();
    }


    private void progRadioGroupOpciones() {
        rgOpciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbFactorial) {
                    layoutFactorial.setVisibility(View.VISIBLE);
                    layoutMcd.setVisibility(View.GONE);
                } else if (checkedId == R.id.rbMcd) {
                    layoutFactorial.setVisibility(View.GONE);
                    layoutMcd.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void initInterfaz() {
        // Referencia a los elementos de la interfaz
        tvFactorial = (TextView) findViewById(R.id.tvFactorial);
        tvMcd = (TextView) findViewById(R.id.tvMcd);
        etNumero = (EditText) findViewById(R.id.etNumero);
        etNumero1 = (EditText) findViewById(R.id.etNumero1);
        etNumero2 = (EditText) findViewById(R.id.etNumero2);
        rgOpciones = (RadioGroup) findViewById(R.id.rgOpciones);
        layoutFactorial = (LinearLayout) findViewById(R.id.layoutFactorial);
        layoutMcd = (LinearLayout) findViewById(R.id.layoutMcd);
        // Estableciendo propiedades
        tvFactorial.setText("Ingrese un número.");
        tvMcd.setText("Ingrese dos números");
        layoutFactorial.setVisibility(View.GONE);
        layoutMcd.setVisibility(View.GONE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_mate, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
