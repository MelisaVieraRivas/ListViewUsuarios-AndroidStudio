package com.melisavierarivas.listviewusuarios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;


import android.content.SharedPreferences;
import android.os.Bundle;

public class AjustesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorAjuste, new AjustesFragment()).commit();
    }
}