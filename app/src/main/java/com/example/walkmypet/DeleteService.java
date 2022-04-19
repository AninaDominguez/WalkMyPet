package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeleteService extends AppCompatActivity{
    // Declare variables
    ImageButton PerfilImageButttonIB;
    ImageButton SalirImageButtonIB;

    TextView perfilTextViewTV;
    TextView salirTextViewTV;

    ListView serviciosListViewLV;

    Button eliminarServicioButton;
    Button atrasButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PerfilImageButttonIB = findViewById(R.id.PerfilImageButttonIB);
        SalirImageButtonIB = findViewById(R.id.SalirImageButtonIB);

        perfilTextViewTV = findViewById(R.id.perfilTextViewTV);
        salirTextViewTV = findViewById(R.id.salirTextViewTV);

        serviciosListViewLV = findViewById(R.id.serviciosListViewLV);

        eliminarServicioButton = findViewById(R.id.eliminarServicioButton);
        atrasButton = findViewById(R.id.atrasButton);


        // Create Services
        Service026 service0261 = new Service026("Paseo");
        Service026 service0262 = new Service026("Peluquería");
        Service026 service0263 = new Service026("Veterinario");
        Service026 service0264 = new Service026("Guardería");
        Service026 service0265 = new Service026("Otros");

        // ArrayList
        ArrayList<Service026> servicesList = new ArrayList<>();
        servicesList.add(service0261);
        servicesList.add(service0262);
        servicesList.add(service0263);
        servicesList.add(service0264);
        servicesList.add(service0265);

        // Adapter
        CustomAdapter026 customAdapter = new CustomAdapter026(this, R.layout.list_item026, servicesList);
        serviciosListViewLV.setAdapter(customAdapter);

        eliminarServicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eliminarServicio("http://192.168.1.48/v1/propietarios/3");
            }
        });
    }

    //Método para ir al perfil del propietario
    public void goToMyProfile(View view){
        Intent intent = new Intent(this,EditarMascotaActivity.class);
        startActivity(intent);


    }
    //Método para volver al inicio
    public void goToBack(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }
    private void eliminarServicio(String URL) {
        StringRequest stringRequest=new StringRequest(Request.Method.DELETE, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    Toast.makeText(DeleteService.this,"Resultado =" + response,Toast.LENGTH_LONG).show();
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String,String>();
                parametros.put("id",        serviciosListViewLV.toString());

                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

}
