package pe.isil.promedioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import pe.isil.promedioapp.service.PedidoService;

public class MainActivity extends AppCompatActivity {

    private EditText etImporte;
    private TextView tvImporte;
    private TextView tvImpuesto;
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Controles
        etImporte = (EditText) findViewById(R.id.etImporte);
        tvImporte = (TextView) findViewById(R.id.tvImporte);
        tvImpuesto = (TextView) findViewById(R.id.tvImpuesto);
        tvTotal = (TextView) findViewById(R.id.tvTotal);

        tvImporte.setText("Importe:");
        tvImpuesto.setText("Impuesto:");
        tvTotal.setText("Total:");
    }


    public void doProcesar(View v){
        // Input (Dato)
        double importe = Double.parseDouble(etImporte.getText().toString());
        // Proceso
        PedidoService service = new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        // Output (Reporte)
        tvImporte.setText("Importe: " + importe);
        tvImpuesto.setText("Impuesto: " + impuesto);
        tvTotal.setText("Total: " + total);

    }



}
