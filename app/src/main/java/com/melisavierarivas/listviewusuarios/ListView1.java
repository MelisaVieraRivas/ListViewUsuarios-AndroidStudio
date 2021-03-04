package com.melisavierarivas.listviewusuarios;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.Date;

public class ListView1 extends Activity {


    private ArrayList<ClaseUsuario>arrayEntidad;
    private AdaptadorUsuario adaptador;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        ListView listview = (ListView) findViewById(R.id.lista);
        Button btnAjustes= (Button)findViewById(R.id.btnAjustes);
        TextView tvPaisDispo =(TextView)findViewById(R.id.tvPaisDispo);
        TextView tvNombreDispo =(TextView)findViewById(R.id.tvNombreDipo);
        TextView tvModoDispo =(TextView)findViewById(R.id.tvModoDispo);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(ListView1.this);
        String NombreDispo = pref.getString("Dueño", "cero");
        String PaisDispo = pref.getString("Pais", "cero");
        Boolean ModoPantalla = pref.getBoolean("Osc",true);


        tvPaisDispo.setText(PaisDispo);
        tvNombreDispo.setText(NombreDispo);
        if (ModoPantalla==true){
            tvModoDispo.setText("Oscuro");
        }else{
            tvModoDispo.setText("Claro");
        }


        arrayEntidad=GetArrayItems();
        AdaptadorUsuario adaptador = new AdaptadorUsuario(this,GetArrayItems());
        listview.setAdapter(adaptador);


       listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent= new Intent(ListView1.this,VistaItems.class);
                intent.putExtra("ObjetoData",arrayEntidad.get(position));//Serialice la clase usuario para poder pasar los datos
                startActivity(intent);

            }
        });

       btnAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(ListView1.this,AjustesActivity.class);
                startActivity(i);
            }
        });

    }
    private ArrayList<ClaseUsuario>GetArrayItems(){
        ArrayList<ClaseUsuario> listaClaseUsuarios = new ArrayList<>();
        listaClaseUsuarios.add(new ClaseUsuario(R.drawable.hombre,"Juan","Lopez","625145878","email@com","10","Es un usuario"));
        listaClaseUsuarios.add(new ClaseUsuario(R.drawable.mujer,"Lorena","Rivas","625369874","email@com","10","Es una usuaria"));
        listaClaseUsuarios.add(new ClaseUsuario(R.drawable.hombre,"Ismael","Aguero","625145878","email@com","10","Es un usuario"));
        listaClaseUsuarios.add(new ClaseUsuario(R.drawable.mujer,"Mary","Vazquez","625369874","email@com","10","Es una usuaria"));
        listaClaseUsuarios.add(new ClaseUsuario(R.drawable.hombre,"David","Viera","625145878","email@com","10","Es un usuario"));
        listaClaseUsuarios.add(new ClaseUsuario(R.drawable.mujer,"Gabriela","Fernandez","625369874","email@com","10","Es una usuaria"));



        return listaClaseUsuarios;
    }


}