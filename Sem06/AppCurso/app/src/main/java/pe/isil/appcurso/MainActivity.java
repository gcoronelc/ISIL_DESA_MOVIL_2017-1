package pe.isil.appcurso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import pe.isil.appcurso.model.CursoModel;
import pe.isil.appcurso.service.CursoService;

public class MainActivity extends AppCompatActivity {

    private EditText etCurso;
    private EditText etNivel;
    private EditText etVacantes;
    private EditText etRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCurso = (EditText) findViewById(R.id.etCurso);
        etNivel = (EditText) findViewById(R.id.etNivel);
        etVacantes = (EditText) findViewById(R.id.etVacantes);
        etRepo = (EditText) findViewById(R.id.etRepo);
    }

    public void doProcesar(View v)
    {
        // Datos
        String curso = etCurso.getText().toString();
        String nivel = etNivel.getText().toString();
        int vacantes = Integer.parseInt(etVacantes.getText().toString());

        // Proceso
        CursoService cursoService = new CursoService();
        CursoModel model = cursoService.procesarCurso(curso,nivel,vacantes);


        // Reporte 2
        String repo = "";
        repo += "Curso: " + model.getCurso() + "\n";
        repo += "Nivel: " + model.getNivel() + "\n";
        repo += "Ingresos: " + model.getIngresos() + "\n";
        repo += "Gas. Publicidad: " + model.getGasPublicidad() + "\n";
        repo += "Gas. Logistica: " + model.getGasLogistica() + "\n";
        repo += "Gas. Materiales: " + model.getGasMateriales() + "\n";
        repo += "Pago Profesor: " + model.getPagoProfesor() + "\n";
        repo += "Utilidad: " + model.getUtilidad() + "\n";
        etRepo.setText(repo);

    }
}
