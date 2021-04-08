package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    boolean isProvola = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pulsanteProvola = findViewById(R.id.button2); //definisco il pulsante, tipo javascript
        TextView scritta= (TextView) findViewById(R.id.text2);

        pulsanteProvola.setOnClickListener(new View.OnClickListener() {
            public void onClick (View pulsanteProvola) {
                // Code here executes on main thread after user presses button
                if (!isProvola) {
                    scritta.setText("sei una provola");
                    isProvola = true;
                } else {
                    scritta.setText("non sei una provola");
                    isProvola = false;
                }
            }
        });

    }

}