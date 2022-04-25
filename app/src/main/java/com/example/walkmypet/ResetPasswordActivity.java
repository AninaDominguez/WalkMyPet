package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);
    }


    public void goBackToLogIn2(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    //Cami: fslta implementar en el boton enviar contraseña el envio del correo.
}
