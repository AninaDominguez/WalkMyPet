package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class CancelService extends AppCompatActivity{
    ImageButton PerfilImageButttonIB;
    ImageButton SalirImageButtonIB;

    TextView perfilTextViewTV;
    TextView salirTextViewTV;

    ListView serviciosListViewLV;

    Button cancelarServicioButton;
    Button atrasButton;

    CustomAdapter customAdapter;
    private Object EditarMascotaActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PerfilImageButttonIB = findViewById(R.id.PerfilImageButttonIB);
        SalirImageButtonIB = findViewById(R.id.SalirImageButtonIB);

        perfilTextViewTV = findViewById(R.id.perfilTextViewTV);
        salirTextViewTV = findViewById(R.id.salirTextViewTV);

        serviciosListViewLV = findViewById(R.id.serviciosListViewLV);

        cancelarServicioButton = findViewById(R.id.cancelarServicioButton);
        atrasButton = findViewById(R.id.atrasButton);


        // Create Services
        Service service1 = new Service("Paseo");
        Service service2 = new Service("Peluquería");
        Service service3 = new Service("Veterinario");
        Service service4 = new Service("Guardería");
        Service service5 = new Service("Otros");

        // ArrayList
        ArrayList<Service> servicesList = new ArrayList<>();
        servicesList.add(service1);
        servicesList.add(service2);
        servicesList.add(service3);
        servicesList.add(service4);
        servicesList.add(service5);

        // Adapter
        CustomAdapterRecyclerView customAdapterRecyclerView = new CustomAdapterRecyclerView(this, R.layout.list_item, servicesList);
        serviciosListViewLV.setAdapter(customAdapter);
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
}
