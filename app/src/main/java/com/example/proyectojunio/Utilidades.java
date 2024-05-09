package com.example.proyectojunio;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utilidades {

    public static String leerJson(Context context, String fileName) throws IOException{



        InputStream inputStream = context.getResources().openRawResource(R.raw.preguntas);
        String jsonString = new Scanner(inputStream).useDelimiter("\\A").next();



        return jsonString;
    }
}
