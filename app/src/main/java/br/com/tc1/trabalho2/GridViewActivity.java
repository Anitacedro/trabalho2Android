package br.com.tc1.trabalho2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    private ArrayAdapter<Disciplina> adapterDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        Toast.makeText(this, "Hello From GridView", Toast.LENGTH_SHORT).show();

        ArrayList<Disciplina> listaDisciplinas = getIntent()
                .getParcelableArrayListExtra("disciplinas");

        adapterDisciplinas = new ArrayAdapter<Disciplina>(this,
                android.R.layout.simple_list_item_1, listaDisciplinas);

        GridView GridViewDisciplinas = findViewById(R.id.grid_disciplinas);
        GridViewDisciplinas.setAdapter(adapterDisciplinas);
    }
}
