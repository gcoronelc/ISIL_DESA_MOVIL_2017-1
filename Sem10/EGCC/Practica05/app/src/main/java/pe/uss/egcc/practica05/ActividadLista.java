package pe.uss.egcc.practica05;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActividadLista extends AppCompatActivity {

  // Variables
  private ListView lvCiudades;
  private List<String> ciudades;
  private String mensaje;
  private int p;
  private String ciudad;
  private ArrayAdapter<String> adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.actividad_lista);
    llenarLista();
    mostrarLista();
  }

  private void mostrarLista() {
    lvCiudades = (ListView) findViewById(R.id.lvCiudades);
    adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_single_choice,
        android.R.id.text1, ciudades);
    lvCiudades.setAdapter(adapter);
    lvCiudades.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
  }

  private void llenarLista() {
    ciudades = new ArrayList<>();
    ciudades.add("Chiclayo");
    ciudades.add("Trujillo");
    ciudades.add("Cuzco");
    ciudades.add("Arequipa");
    ciudades.add("Huancayo");
    ciudades.add("Iquitos");
    ciudades.add("Piura");
    ciudades.add("Tumbes");
    ciudades.add("Tacna");
    ciudades.add("Puno");
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_actividad_lista, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.menu_lista_eliminar:
        eliminarElementoActual();
        break;
      case R.id.menu_lista_agregar:
        agregarNuevoElemento();
        break;
    }
    return super.onOptionsItemSelected(item);
  }

  private void agregarNuevoElemento() {
    LayoutInflater activador = LayoutInflater.from(this);
    final View entrada = activador.inflate(R.layout.actividad_dialogo, null);
    AlertDialog.Builder adb = new AlertDialog.Builder(this);
    adb.setTitle("NUEVA CIUDAD");
    adb.setView(entrada);
    adb.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {

      @Override
      public void onClick(DialogInterface p_dialog, int p_which) {
        EditText caja = (EditText) entrada.findViewById(R.id.etCiudad);
        ciudades.add(caja.getText().toString());
        adapter.notifyDataSetChanged();
      }

    });
    adb.setNegativeButton("No", null);
    adb.show();
  }

  private void eliminarElementoActual() {
    mensaje = "";
    if (ciudades.isEmpty()) {
      mensaje = "La lista está vacia.";
    } else if (lvCiudades.getCheckedItemCount() == 0) {
      mensaje = "Seleccione un elemento.";
    } else {
      p = lvCiudades.getCheckedItemPosition();
      ciudad = lvCiudades.getItemAtPosition(p).toString();
      AlertDialog.Builder adb = new AlertDialog.Builder(this);
      adb.setTitle("CONFIRMACION");
      adb.setMessage("¿Está seguro de eliminar " + ciudad + "?");
      adb.setCancelable(false);
      adb.setPositiveButton("Si", new DialogInterface.OnClickListener() {

        public void onClick(DialogInterface dialog, int which) {
          adapter.remove(adapter.getItem(p));
          mensaje = "Posición: " + p + "   Ciudad: " + ciudad + " fué eliminada.";
        }

      });
      adb.setNegativeButton("No", null);
      adb.show();
    }
    if (mensaje.length() > 0) {
      Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
    }
  }


}
