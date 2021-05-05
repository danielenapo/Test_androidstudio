package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    boolean isProvola = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pulsanteProvola =(Button) findViewById(R.id.button2); //definisco il pulsante, tipo javascript
        TextView scritta= (TextView) findViewById(R.id.text2);

        //METTO UN LISTENER PER IL PULSANTE DELLA PROVOLA CHE CAMBIA I TESTI
        pulsanteProvola.setOnClickListener(new View.OnClickListener() {
            public void onClick (View pulsanteProvola) { //OVERRIDE DI ONCLICK
                // Code here executes on main thread after user presses button
                Button pulsanteProvola2 =(Button) findViewById(R.id.button2);
                if (!isProvola) { //prima volta click
                    scritta.setText("Complimenti, adesso sei una provola!\n\nAspetta!! forse sei una mozzarella di bufala,\ndobbiamo fare un controllo");
                    pulsanteProvola2.setText("FATTI UNA FOTO PER VERIFICARE LA TUA PROVOLOSITA'");
                    isProvola=true;
                }
                else{
                    Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                    startActivity(intent);
                    scritta.setText("Ok sì, sei proprio una provola.\n\nSTATO:\nsei una provola");
                    pulsanteProvola2.setVisibility(View.GONE);
                }
            }
        });

    }

}