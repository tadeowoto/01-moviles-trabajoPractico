package com.example.trabajopractico_01;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


/*
Consigna
1. Crear una aplicación Android que:
o Implemente un BroadcastReceiver que escuche el evento del sistema correspondiente al cambio de Modo Avión (ACTION_AIRPLANE_MODE_CHANGED).
o Al detectar que el Modo Avión ha sido activado, la aplicación debe generar un Intent implícito para abrir la aplicación de llamadas con el número 2664553747.
2. Subir el proyecto a un repositorio público en GitHub.
3. Entregar el enlace al repositorio a través de esta tarea en el aula virtual.
 */




public class MainActivity extends AppCompatActivity {

    private ModoAvionReciver modoAvionReciver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modoAvionReciver = new ModoAvionReciver();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(modoAvionReciver, new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));
    }
}