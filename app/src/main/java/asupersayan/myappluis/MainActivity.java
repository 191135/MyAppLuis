package asupersayan.myappluis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario,etContraseña;
    private Button btnEnviarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = (EditText) findViewById (R.id.etUsuario);
        etContraseña = (EditText) findViewById(R.id.etContraseña);

        btnEnviarDatos = (Button) findViewById(R.id.btnEnviarDatos);
        btnEnviarDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("Datos", "Usuario " + etUsuario.getText());
                Log.i("Datos", "Clave " + etContraseña.getText());

            }


        });

    }

}
