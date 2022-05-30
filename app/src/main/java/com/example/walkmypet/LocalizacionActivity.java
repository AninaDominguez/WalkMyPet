package com.example.walkmypet;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LocalizacionActivity extends AppCompatActivity {
    private ListView list;
    Adaptador adaptador;
    public static ArrayList<Cuidadores>cuidadores=new ArrayList<>();
    Cuidadores cuidadoresList;

    String url="http://192.168.1.48/walkmypet/developeru/mostrar_cuidadores.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacion);

        list=findViewById(R.id.lstView);
        adaptador= new Adaptador(this,cuidadores);
        list.setAdapter(adaptador);
        mostrarCuidadores();
    }
    public void mostrarCuidadores(){
        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                cuidadores.clear();
                try {
                    JSONObject jsonObject=new JSONObject(response);
                    String succes=jsonObject.getString("succes");

                    JSONArray jsonArray=jsonObject.getJSONArray("cuidadores");

                    if (succes.equals("1")){

                        for (int i=0;i<jsonArray.length();i++){

                            JSONObject object=jsonArray.getJSONObject(i);

                            String id=object.getString("id");
                            String Nombre=object.getString("Nombre");

                            cuidadoresList=new Cuidadores(id,Nombre);
                            cuidadores.add(cuidadoresList);
                            adaptador.notifyDataSetChanged();
                        }
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LocalizacionActivity.this,error.toString(),Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void btnAgg(View view){
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}