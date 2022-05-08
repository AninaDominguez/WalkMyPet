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
Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;


        userLogin = findViewById(R.id.editTextEmailLogin);
        passwordLogin = findViewById(R.id.editTextPasswordLogin);
        btnLogin = findViewById(R.id.entrarButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValidarUsuario("http://192.168.1.48/walkmypet/developeru/validar_usuario.php");
            }
        });

    }

    public void goToRegister(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }
/*    public void login (View view) {

        Verificacion user y password, se cambia cuando la bbdd este implementada llamando a los metodos necesarios.

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
        }

    }*/
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
                    Intent intent= new Intent(getApplicationContext(),Propietario.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrecta",Toast.LENGTH_SHORT).show();
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