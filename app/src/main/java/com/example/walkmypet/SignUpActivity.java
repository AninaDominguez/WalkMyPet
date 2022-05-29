package com.example.walkmypet;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class SignUpActivity extends AppCompatActivity {
    EditText edtNombre,edtPassword;
    Button btnRegister;
    Button btnRegisterCuidador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtNombre = findViewById(R.id.editTextEmailRegistro);
        edtPassword = findViewById(R.id.editTextPasswordRegistro);
        btnRegister = findViewById(R.id.registroButton);
        btnRegisterCuidador = findViewById(R.id.registroButtonCuidador);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarDatosPropietario();
               // crearPropietario("http://192.168.1.107/v1/propietarios");
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarDatosCuidador();

            }
        });
    }

    public void goBackToLogIn(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    private void insertarDatosPropietario(){
        final String nombre = edtNombre.getText().toString().trim();
        final String Password=edtPassword.getText().toString().trim();

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Espere por favor");

        if (nombre.isEmpty()){
            edtNombre.setError("Complete los campos");
            return;
        }else if (Password.isEmpty()){
            edtPassword.setError("Complete los campos");
            return;
        }else{
            progressDialog.show();
            StringRequest request= new StringRequest(Request.Method.POST,"http://192.168.1.48/walkmypet/developeru/insertar_propietario.php", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equalsIgnoreCase("registro correctamente")) {
                        Toast.makeText(SignUpActivity.this, "datos insertados", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(SignUpActivity.this, response, Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        Toast.makeText(SignUpActivity.this, "No se pudo insertar", Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                  Toast.makeText(SignUpActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                  progressDialog.dismiss();
                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
                    parametros.put("nombre", nombre);
                    parametros.put("Password", Password);
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(SignUpActivity.this);
            requestQueue.add(request);
        }

    }



    private void insertarDatosCuidador(){
        final String nombre = edtNombre.getText().toString().trim();
        final String Password=edtPassword.getText().toString().trim();

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Espere por favor");

        if (nombre.isEmpty()){
            edtNombre.setError("Complete los campos");
            return;
        }else if (Password.isEmpty()){
            edtPassword.setError("Complete los campos");
            return;
        }else{
            progressDialog.show();
            StringRequest request= new StringRequest(Request.Method.POST,"http://192.168.1.48/walkmypet/developeru/insertar_propietario.php", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equalsIgnoreCase("registro correctamente")) {
                        Toast.makeText(SignUpActivity.this, "datos insertados", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(SignUpActivity.this, response, Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        Toast.makeText(SignUpActivity.this, "No se pudo insertar", Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(SignUpActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> parametros = new HashMap<>();
                    parametros.put("nombre", nombre);
                    parametros.put("Password", Password);
                    return parametros;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(SignUpActivity.this);
            requestQueue.add(request);
        }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}