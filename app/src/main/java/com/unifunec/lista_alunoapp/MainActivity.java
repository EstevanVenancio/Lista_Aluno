package com.unifunec.lista_alunoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");

        //Simulação de uma consulta de alunos cadastrados em um banco!
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Estevan", "Willian", "Mary Jane")
        );

        ListView lista_Alunos = findViewById(R.id.lst_Alunos);
        lista_Alunos.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, alunos));

    }
}