package com.example.dani.appexadt2_danisabbagh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dani.appexadt2_danisabbagh.db.EventoDatasource;
import com.example.dani.appexadt2_danisabbagh.model.Eventos;

public class MainActivity extends AppCompatActivity {
    EditText nombre, municipio, descripcion, hora, fecha;
    Button Registar, Consultar, Borrar, Modificar;
    EventoDatasource eds;
    Eventos evento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registar = findViewById(R.id.btnRegistar);
        Consultar = findViewById(R.id.btnConsultar);
        Modificar = findViewById(R.id.btnModificar);
        Borrar = findViewById(R.id.btnBorrar);

        nombre = findViewById(R.id.etNombre);
        municipio = findViewById(R.id.etMunicipio);
        descripcion = findViewById(R.id.etDescripcion);
        hora = findViewById(R.id.etHora);
        fecha = findViewById(R.id.etFecha);

        eds = new EventoDatasource(this);


    }
    public void consultarEvento(View view){
        eds.ConsultarEventos(evento.getNombreEvento());

        }


    public void RegistrarEventos(View v){
        if(nombre.length()== 0){
            Toast.makeText(this, "Debe rellenar el campo Nombre", Toast.LENGTH_LONG).show();
        }else if(municipio.length() == 0){
            Toast.makeText(this, "Debe rellenar el campo Municipio", Toast.LENGTH_LONG).show();
        }else if(descripcion.length() == 0){
            Toast.makeText(this, "Debe rellenar el campo Descripcion", Toast.LENGTH_LONG).show();
        }else if(hora.length() == 0){
            Toast.makeText(this, "Debe rellenar el campo Hora", Toast.LENGTH_LONG).show();
        }else if(fecha.length() == 0){
            Toast.makeText(this, "Debe rellenar el campo Fecha", Toast.LENGTH_LONG).show();
        }else{
            Eventos evento = new Eventos(
                    nombre.getText().toString().trim(),
                    municipio.getText().toString().trim(),
                    descripcion.getText().toString().trim(),
                    fecha.getText().toString().trim(),
                    hora.getText().toString().trim());
            int id = (int) eds.insertarEvento(evento);

            if(id != -1){
                Toast.makeText(this, "Evento insertado correctamente", Toast.LENGTH_SHORT).show();
                limpiarCampos();
            }else{
                Toast.makeText(this, "Error en la inserccion", Toast.LENGTH_SHORT).show();
                limpiarCampos();
            }

        }
    }
    public void limpiarCampos(){
        nombre.setText("");
        municipio.setText("");
        descripcion.setText("");
        fecha.setText("");
        hora.setText("");
    }
    public void borrar(View view){

        eds.borrarEventos(evento.getNombreEvento());

        finish();
        Toast.makeText(this, "Se ha borrado correctamente", Toast.LENGTH_LONG).show();
    }
}
