package asupersayan.myappluis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {

    private Button btnCambiarActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnCambiarActividad =(Button) findViewById(R.id.btnCambiarActividad);
        btnCambiarActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loadActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(loadActivity);


            }
        });
    }



}
