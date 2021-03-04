package com.melisavierarivas.listviewusuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.widget.ImageView;
import android.widget.TextView;

public class VistaItems extends AppCompatActivity {

    private ClaseUsuario Item;
    private TextView VNombre,VApellido,VTelefono,VEmail,VFecha,VComentarios;
    private ImageView VImagen;
    private Intent imagenes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_items);

        Item= (ClaseUsuario) getIntent().getSerializableExtra("ObjetoData");

        VImagen=(ImageView)findViewById(R.id.Vimagen);
        VNombre=(TextView)findViewById(R.id.VNombre);
        VApellido=(TextView)findViewById(R.id.VApellido);
        VTelefono=(TextView)findViewById(R.id.VTelefono);
        VEmail=(TextView)findViewById(R.id.VEmail);
        VFecha=(TextView)findViewById(R.id.VFecha);
        VComentarios=(TextView)findViewById(R.id.VComentarios);


        VNombre.setText(Item.getNombre());
        VApellido.setText(Item.getApellido());
        VTelefono.setText(Item.getNumero());
        VEmail.setText(Item.getEmail());
        VFecha.setText(Item.getFechaNacimiento().toString());
        VComentarios.setText(Item.getComentarios());
        VImagen.setImageResource(Item.getImagen());
    }
}