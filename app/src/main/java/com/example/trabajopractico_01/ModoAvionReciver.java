package com.example.trabajopractico_01;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class ModoAvionReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        //DEBE HACER UN INTENT QUE ABRA EL TELEFONO CON EL NUMERO ASIGNADO

        boolean estaConectado = intent.getBooleanExtra("state", false);
        String numeroTelefono = "2664553747";

        if (estaConectado) {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:" + numeroTelefono));
            context.startActivity(dialIntent);

        }else{
            Toast.makeText(context, "Modo avion desactivado", Toast.LENGTH_LONG).show();
        }

    }


}

