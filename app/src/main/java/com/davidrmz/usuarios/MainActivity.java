package com.davidrmz.usuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView prueba;
    public EditText ednombre, edtelefono, edemail,eddescripUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednombre= (EditText) findViewById(R.id.editTxtNombre);
        edtelefono = (EditText)findViewById(R.id.editTxtTelefono);
        edemail= (EditText)findViewById(R.id.editTxtEmail);
        eddescripUsuario = (EditText) findViewById(R.id.editTxtDescrip);
        Button botonSigAct =(Button)findViewById(R.id.botonSig);//leo item del view en este caso el boton sig
        botonSigAct.setOnClickListener(new View.OnClickListener() { //le asigno al boton un listener
            @Override
            public void onClick(View view) { //crea metodo alHacerClic y creo un nuevo intent NOTA CACHAR EL TEXTO DENTRO DEL INTENT SI ES FUERA LO IGNORA
                final String nombre = ednombre.getText().toString();
                final String telefono = edtelefono.getText().toString();
                final String email = edemail.getText().toString();
                final String usuariodescrip = eddescripUsuario.getText().toString();
                new DatosIngreso(nombre, telefono, email, usuariodescrip); //envio los parametros recibidos mediante editText de interfaz grafica
                Intent intent = new Intent(MainActivity.this,pantallaConfirmar.class); // clase actual.this, claseAIr.class
                intent.putExtra(getResources().getString(R.string.nombreParametro),nombre);//intent explicito enviando parametros
                intent.putExtra(getResources().getString(R.string.telefonoParametro),telefono);
                intent.putExtra(getResources().getString(R.string.emailParametro),email);
                intent.putExtra(getResources().getString(R.string.descripParametro),usuariodescrip);
                startActivity(intent);//finalmente inicio la actividad
            }
        });

    }
}
