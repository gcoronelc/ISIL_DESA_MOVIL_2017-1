package pe.isil.sueldotrabajador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import pe.isil.sueldotrabajador.model.PagoModel;
import pe.isil.sueldotrabajador.service.PagoService;

public class MainActivity extends AppCompatActivity {

    private EditText etCanhoras;
    private EditText etCandias;
    private EditText etPahora;
    private TextView tvIntotal;
    private TextView tvRenta;
    private TextView tvNeto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etCanhoras = (EditText) findViewById(R.id.etCanhoras);
        etCandias = (EditText) findViewById(R.id.etCandias);
        etPahora = (EditText) findViewById(R.id.etPahora);
        tvIntotal = (TextView) findViewById(R.id.tvIntotal);
        tvRenta = (TextView) findViewById(R.id.tvRenta);
        tvNeto = (TextView) findViewById(R.id.tvNeto);
    }


    public void doPago(View v)
    {
        // Datos
        int horaDia = Integer.parseInt(etCanhoras.getText().toString());
        int dias = Integer.parseInt(etCandias.getText().toString());
        double pagoHora = Double.parseDouble(etPahora.getText().toString());
        PagoModel model = new PagoModel(horaDia,dias,pagoHora);

        // Proceso
        PagoService pagoService = new PagoService();
        model = pagoService.procesarPago(model);

        // Reporte
        tvIntotal.setText("Ingreso:" + model.getIngreso());
        tvRenta.setText("Renta :" + model.getRenta());
        tvNeto.setText("Neto :" + model.getNeto());

    }


    }

