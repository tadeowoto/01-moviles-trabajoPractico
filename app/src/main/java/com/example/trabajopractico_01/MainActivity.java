package com.example.trabajopractico_01;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;







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