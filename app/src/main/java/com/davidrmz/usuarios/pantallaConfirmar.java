package com.davidrmz.usuarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pantallaConfirmar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_confirmar);
        Bundle reciboParametros = getIntent().getExtras();
        String Nombre= reciboParametros.getString(getResources().getString(R.string.nombreParametro));
        String telefono = reciboParametros.getString(getResources().getString(R.string.telefonoParametro));
        String email = reciboParametros.getString(getResources().getString(R.string.emailParametro));
        String descrip = reciboParametros.getString(getResources().getString(R.string.descripParametro));
        TextView nombre= (TextView)findViewById(R.id.nombreConfirma);
        TextView Tel= (TextView)findViewById(R.id.telefonoConfirma);
        TextView mail= (TextView)findViewById(R.id.emailConfirma);
        TextView descripcion =(TextView)findViewById(R.id.descripConfirma);
        nombre.setText("Nombre:"+Nombre);
        Tel.setText("Telefono:"+telefono);
        mail.setText("email:"+email);
        descripcion.setText("Descripcion:"+descrip);



    }
}
