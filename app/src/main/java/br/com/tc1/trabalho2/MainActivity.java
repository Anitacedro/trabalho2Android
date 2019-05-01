package br.com.tc1.trabalho2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOp1 = findViewById(R.id.btn1);
        Button btnOp2 = findViewById(R.id.btn2);

        btnOp1.setOnClickListener(this);
        btnOp2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                opcao1Action();
                break;
            case R.id.btn2:
                opcao2Action();
                break;
        }
    }

    private void opcao1Action() {
        Intent i = new Intent(this, ListViewActivity.class);

        ArrayList<Disciplina> array = new ArrayList<Disciplina>();
        array = criarDisciplinas();
        i.putParcelableArrayListExtra("disciplinas", array);

        startActivity(i);
    }

    private void opcao2Action() {
        Intent i = new Intent(this, GridViewActivity.class);

        ArrayList<Disciplina> array = new ArrayList<Disciplina>();
        array = criarDisciplinas();
        i.putParcelableArrayListExtra("disciplinas", array);

        startActivity(i);
    }

    private ArrayList<Disciplina> criarDisciplinas() {
        ArrayList<Disciplina> array = new ArrayList<Disciplina>();

        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        Disciplina d3 = new Disciplina();
        Disciplina d4 = new Disciplina();
        Disciplina d5 = new Disciplina();
        Disciplina d6 = new Disciplina();

        d1.setCodigo(1);
        d1.setCargaHoraria(70);
        d1.setDescricao("Cálculo III");

        d2.setCodigo(2);
        d2.setCargaHoraria(70);
        d2.setDescricao("Análise de Algoritmos");

        d3.setCodigo(3);
        d3.setCargaHoraria(70);
        d3.setDescricao("Compiladores");

        d4.setCodigo(4);
        d4.setCargaHoraria(60);
        d4.setDescricao("Optativa 1");

        d5.setCodigo(5);
        d5.setCargaHoraria(60);
        d5.setDescricao("Bioinformática");

        d6.setCodigo(6);
        d6.setCargaHoraria(70);
        d6.setDescricao("PC2");

        array.add(d1);
        array.add(d2);
        array.add(d3);
        array.add(d4);
        array.add(d5);
        array.add(d6);

        return array;
    }
}
