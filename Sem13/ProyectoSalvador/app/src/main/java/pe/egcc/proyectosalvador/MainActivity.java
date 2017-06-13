package pe.egcc.proyectosalvador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1;
    private EditText etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Controles
        etNum1 = (EditText) findViewById(R.id.etAct1Num1);
        etNum2 = (EditText) findViewById(R.id.etAct1Num2);

    }


    public void onClickEnviar(View view){

        // Agregar datos
        Datos.nota1 = Integer.parseInt(etNum1.getText().toString());
        Datos.nota2 = Integer.parseInt(etNum2.getText().toString());

        Toast msg = Toast.makeText(getApplicationContext(),
                "Todo bien", Toast.LENGTH_LONG);
        msg.show();

        // Cargar la actividad 2
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
        // Finalizar la actividad actual
        this.finish();

    }


}
