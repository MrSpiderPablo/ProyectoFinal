package com.example.proyectojunio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JuegoActivity extends AppCompatActivity {

    //Declaramos los componentes y variables
    private TextView txt_IdPregunta, txt_Pregunta;
    private RadioButton rdb_Respuesta1, rdb_Respuesta2, rdb_Respuesta3;
    private Button btn_Siguiente, btn_Salir;
    int contador = 1;
    double puntosObtenidos = 0.0; //Guarda los puntos en cada pregunta
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        txt_IdPregunta = findViewById(R.id.txtIdPregunta);
        txt_Pregunta = findViewById(R.id.txtPregunta);

        rdb_Respuesta1 = findViewById(R.id.rdbRespuesta1);
        rdb_Respuesta2 = findViewById(R.id.rdbRespuesta2);
        rdb_Respuesta3 = findViewById(R.id.rdbRespuesta3);

        llenarPreguntas(contador);

        btn_Siguiente = findViewById(R.id.btnSiguiente);
        btn_Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rdb_Respuesta1.isChecked()){

                    verificarRespuesta(contador, rdb_Respuesta1.getText().toString());
                    check = true;

                } else if (rdb_Respuesta2.isChecked()) {

                    verificarRespuesta(contador, rdb_Respuesta2.getText().toString());
                    check = true;

                } else if (rdb_Respuesta3.isChecked()) {

                    verificarRespuesta(contador, rdb_Respuesta3.getText().toString());
                    check = true;

                }else {

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Selecciona una respuesta",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }

                if (check){

                    if (contador<15){

                        contador = contador + 1;
                        llenarPreguntas(contador);
                    }else {

                        mostrarResultado();
                    }
                }
            }
        });

        btn_Salir = findViewById(R.id.btnSalir);
        btn_Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                salir();
            }
        });
    }

    public void llenarPreguntas(int numeroPregunta){

        // Aquí se guarda el contenido del fichero JSON
        String jsonFileContent = null;
        Log.d("FICHERO", "--------------------Leyendo");
        try {
            jsonFileContent = Utilidades.leerJson(getApplicationContext(), "preguntas.json");
            Log.d("FICHERO", jsonFileContent);

            JSONObject jsonObject = new JSONObject(jsonFileContent);

            JSONArray jsonArray = jsonObject.getJSONArray("arrayPreguntas");

            for (int i=0; i< jsonArray.length(); i++){

                JSONObject JsonObject = jsonArray.getJSONObject(i);

                int id_Pregunta = JsonObject.getInt("id_pregunta");

                if (id_Pregunta == numeroPregunta){

                    String Pregunta = JsonObject.getString("Pregunta");
                    String respuestaCorrecta = JsonObject.getString("respuestaCorrecta");
                    String respuestaIncorrecta1 = JsonObject.getString("respuestaIncorrecta1");
                    String respuestaIncorrecta2 = JsonObject.getString("respuestaIncorrecta2");

                    txt_IdPregunta.setText("Pregunta: " + id_Pregunta);
                    txt_Pregunta.setText(Pregunta);

                    //Creamos una lista para las posibles respuestas
                    List<String> opciones = Arrays.asList(respuestaCorrecta, respuestaIncorrecta1, respuestaIncorrecta2);

                    //Le damos un orden aleatorio a las posibles respuestas
                    Collections.shuffle(opciones);

                    rdb_Respuesta1.setText(opciones.get(0));
                    rdb_Respuesta2.setText(opciones.get(1));
                    rdb_Respuesta3.setText(opciones.get(2));
                }
            }
        }catch (IOException | JSONException e){
            e.printStackTrace();
            Log.e("ERROR", e.getMessage());
        }
    }



    public void verificarRespuesta(int numeroPregunta, String respuestaDada){

        String jsonFileContent = null;

        try {
            jsonFileContent = Utilidades.leerJson(getApplicationContext(), "preguntas.json");

            JSONObject jsonObject = new JSONObject(jsonFileContent);

            JSONArray jsonArray = jsonObject.getJSONArray("arrayPreguntas");

            for (int i=0; i< jsonArray.length(); i++){

                JSONObject JsonObject = jsonArray.getJSONObject(i);

                int id_Pregunta = JsonObject.getInt("id_pregunta");

                if (id_Pregunta == numeroPregunta){

                    String respuesta = JsonObject.getString("respuestaCorrecta");

                    if (respuesta.equals(respuestaDada)){

                        puntosObtenidos = puntosObtenidos + 1;
                    }
                }
            }
        }catch (IOException | JSONException e){
            e.printStackTrace();
        }
    }

    public void mostrarResultado(){

        //Cambiamos los textos de los textViews
        txt_IdPregunta.setText("Puntuación obtenida: " + puntosObtenidos);

        if (puntosObtenidos >= 8){

            txt_Pregunta.setText("Excelsior!!!");
        }else {

            txt_Pregunta.setText("Este duelo no está perfectamente equilibrado");
        }

        rdb_Respuesta1.setVisibility(View.INVISIBLE);
        rdb_Respuesta2.setVisibility(View.INVISIBLE);
        rdb_Respuesta3.setVisibility(View.INVISIBLE);
        btn_Siguiente.setVisibility(View.INVISIBLE);
    }

    public void salir(){

        finish();
    }
}