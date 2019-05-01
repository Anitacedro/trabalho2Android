package br.com.tc1.trabalho2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends Activity {

    private ArrayAdapter<Disciplina> adapterDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Toast.makeText(this, "Hello From ListView", Toast.LENGTH_SHORT).show();

        ArrayList<Disciplina> listaDisciplinas = getIntent()
                .getParcelableArrayListExtra("disciplinas");

        adapterDisciplinas = new ArrayAdapter<Disciplina>(this,
                android.R.layout.simple_list_item_1, listaDisciplinas);

        ListView listViewDisciplinas = findViewById(R.id.lst_disciplinas);
        listViewDisciplinas.setAdapter(adapterDisciplinas);
    }
}
