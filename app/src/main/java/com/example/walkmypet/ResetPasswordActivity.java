package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetPasswordActivity extends AppCompatActivity {
    EditText edtResetEmail;
    Button btnRecuperar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);

        edtResetEmail=findViewById(R.id.editTextEmailReset);
        btnRecuperar=findViewById(R.id.recuperarContrasenaButton);

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });
    }


    public void goBackToLogIn2(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    //Cami: fslta implementar en el boton enviar contraseña el envio del correo.
    public void validate(){
        String email = edtResetEmail.getText().toString().trim();
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edtResetEmail.setError("Correo inválido");
            return;
        }

        sendEmail(email);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(ResetPasswordActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void sendEmail(String email){
        FirebaseAuth auth= FirebaseAuth.getInstance();
        String emailAdress = email;

        auth.sendPasswordResetEmail(emailAdress)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(ResetPasswordActivity.this, "Correo enviado!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ResetPasswordActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }else {
                            Toast.makeText(ResetPasswordActivity.this, "Correo inválido!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}

