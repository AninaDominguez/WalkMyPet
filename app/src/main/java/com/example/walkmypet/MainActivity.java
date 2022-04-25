package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



EditText userLogin, passwordLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;


        userLogin = findViewById(R.id.editTextEmailLogin);
        passwordLogin = findViewById(R.id.editTextPasswordLogin);



    }

    public void goToRegister(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }

    public void login (View view) {

        //Verificacion user y password, se cambia cuando la bbdd este implementada llamando a los metodos necesarios.
/*
        String user = userLogin.getText().toString();
        String password = passwordLogin.getText().toString();

        if (user.equals("") || password.equals("")) {
            Toast.makeText(MainActivity.this, "Los datos son incorrectos, vuelva a intentarlo gracias. ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Login correcto " + user + ", gracias.  ", Toast.LENGTH_SHORT).show();
        }

        //Metodo provisional, se tendria que verificar con los datos de bbdd
        if (user == dueño) {
            Intent intentLoginDueño = new Intent(this, SignUpActivity.class);
            startActivity(intentLoginDueño);
        } else {
            Intent intentLoginCuidador = new Intent(this, SignUpActivity.class);
            startActivity(intentLoginCuidador);
        } */

    }

    //Intent a recuperar contraseña
    public void forgottenPassword (View view) {
            Toast.makeText(getApplicationContext(), "Forgotten password", Toast.LENGTH_LONG)
                    .show();
        Intent intentPassword = new Intent(this, ResetPasswordActivity.class);
        startActivity(intentPassword);



    }


}