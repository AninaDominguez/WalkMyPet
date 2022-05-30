package com.example.walkmypet;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {



EditText userLogin, passwordLogin;
Button btnLogin,btnCuidador;
String usuario,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;


        userLogin = findViewById(R.id.editTextEmailLogin);
        passwordLogin = findViewById(R.id.editTextPasswordLogin);
        btnLogin = findViewById(R.id.entrarButton);
        btnCuidador = findViewById(R.id.btnCuidador);

        btnCuidador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario=userLogin.getText().toString();
                password=passwordLogin.getText().toString();
                if(!usuario.isEmpty() && !password.isEmpty()){
                    ValidarCuidador("http://192.168.1.107/walkmypet/developeru/validar_cuidador.php");

                }else{
                    Toast.makeText(MainActivity.this, "No se permite campos vacíos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario=userLogin.getText().toString();
                password=passwordLogin.getText().toString();
                if(!usuario.isEmpty() && !password.isEmpty()){
                    ValidarUsuario("http://192.168.1.48/walkmypet/developeru/validar_usuario.php");

                }else{
                    Toast.makeText(MainActivity.this, "No se permite campos vacíos", Toast.LENGTH_SHORT).show();
                }

                //En esta parte del código lo que hace es mirar que los campos no esten vacíos, si estan rellenados ya esten bien o mal pasará por validar usuario de lo contrario aparecerá un mensaje.
            }
        });

    }

    public void goToRegister(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }
    //Intent a recuperar contraseña
    public void forgottenPassword (View view) {
            Toast.makeText(getApplicationContext(), "Forgotten password", Toast.LENGTH_LONG)
                    .show();
        Intent intentPassword = new Intent(this, ResetPasswordActivity.class);
        startActivity(intentPassword);
    }

    public  void ValidarUsuario (String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (!response.isEmpty()){
                    Intent intent= new Intent(getApplicationContext(), LocalizacionActivity.class );
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos",Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros=new HashMap<String,String>();
                parametros.put("nombre",userLogin.getText().toString());
                parametros.put("Password",passwordLogin.getText().toString());
                return parametros;
            }
        };


        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public  void ValidarCuidador (String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (!response.isEmpty()){
                    Intent intent= new Intent(getApplicationContext(), Cuidador.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos",Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros=new HashMap<String,String>();
                parametros.put("nombre",userLogin.getText().toString());
                parametros.put("Password",passwordLogin.getText().toString());
                return parametros;
            }
        };


        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

}