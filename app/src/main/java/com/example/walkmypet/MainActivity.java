package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;



    }

    public void goToRegister(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }

    public void login (View view) {

        /* Hacer if diferenciando cuidador de dueño.
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
                 */
    }

}