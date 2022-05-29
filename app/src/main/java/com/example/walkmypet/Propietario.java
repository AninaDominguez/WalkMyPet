package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private EditText edtNombre;
    private EditText edtPuesto;
    private EditText edtDepartamento;
    private Button btn;
    private ListView mListView;
    private List<String> lstNombres = new ArrayList<>();
    private List<String> lstPuestos = new ArrayList<>();
    private List<String> lstDepartamentos = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_dueno) ;
        edtNombre = findViewById(R.id.txtNombre);
        edtPuesto = findViewById(R.id.txtPuesto);
        edtDepartamento = findViewById(R.id.txtDepartamento);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        mListView = findViewById(R.id.mListView);
        mListView.setOnItemClickListener(this);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ubicación");
        builder.setMessage("¿Permites que esta app active tu ubicación?");

        builder.setPositiveButton("Aceptar", null);
        builder.setNegativeButton("Cancelar", null);
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                if(!edtNombre.getText().toString().trim().isEmpty() && !edtPuesto.getText().toString().trim().isEmpty() &&!edtDepartamento.getText().toString().trim().isEmpty()) {
                    lstDepartamentos.add(edtDepartamento.getText().toString().trim());
                    lstNombres.add(edtNombre.getText().toString().trim());
                    lstPuestos.add(edtPuesto.getText().toString().trim());
                    mListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lstDepartamentos));
                    edtNombre.getText().clear();
                    edtPuesto.getText().clear();
                    edtDepartamento.getText().clear();
                }else{
                    Toast.makeText(this,"Faltan campos por rellenar",Toast.LENGTH_SHORT).show();
                }
        }
    }


    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent= new Intent(this,Mascota.class);
        intent.putExtra("nombre",lstNombres.get(position));
        intent.putExtra("puesto",lstPuestos.get(position));
        intent.putExtra("departamento",lstDepartamentos.get(position));
        startActivity(intent);
    }


    public void goToBack(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
