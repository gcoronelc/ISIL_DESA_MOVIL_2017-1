package isil.com.pe.practica03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.LinearLayout;

import isil.com.pe.practica03.service.Operacion;

public class MainActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main);
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
        tvFactorial = (TextView) findViewById(R.id.tvFactorial);
        tvMcd = (TextView) findViewById(R.id.tvMcd);
        etNumero = (EditText) findViewById(R.id.etNumero);
        etNumero1 = (EditText) findViewById(R.id.etNumero1);
        etNumero2 = (EditText) findViewById(R.id.etNumero2);
        rgOpciones = (RadioGroup) findViewById(R.id.rgOpciones);
        layoutFactorial = (LinearLayout) findViewById(R.id.layoutFactorial);
        layoutMcd = (LinearLayout) findViewById(R.id.layoutMcd);

        tvFactorial.setText("Ingrese un número.");
        tvMcd.setText("Ingrese dos números");
        layoutFactorial.setVisibility(View.GONE);
        layoutMcd.setVisibility(View.GONE);
    }



    public void doProFactorial(View v) {
        int numero = Integer.parseInt(etNumero.getText().toString());
        Operacion service = new Operacion();

        double total = service.factorial(numero);

        tvFactorial.setText("Factorial " + total);
    }
    public void  doProMcd (View v) {
        int numero1 = Integer.parseInt(etNumero1.getText().toString());
        int numero2 = Integer.parseInt(etNumero2.getText().toString());
        Operacion service = new Operacion();

        double mcd = service.mcd(numero1, numero2);

        tvMcd.setText("MCD " + mcd);
    }
}
