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
    }

    //METODO CHE SI ATTIVA CON OnCLick SUL PULSANTE (scritto su XML)
    public void provolize(View v){
        Button pulsanteProvola =(Button) findViewById(R.id.button2);
        TextView scritta= (TextView) findViewById(R.id.text2);
        if (!isProvola) { //prima volta click
            scritta.setText("Complimenti, adesso sei una provola!\n\nAspetta!! forse sei una mozzarella di bufala,\ndobbiamo fare un controllo");
            pulsanteProvola.setText("FATTI UNA FOTO PER VERIFICARE LA TUA PROVOLOSITA'");
            isProvola=true;
        }
        else{
            Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
            startActivity(intent);
            scritta.setText("Ok sì, sei proprio una provola.\n\nSTATO:\nsei una provola");
            pulsanteProvola.setVisibility(View.GONE);
        }
    }

}