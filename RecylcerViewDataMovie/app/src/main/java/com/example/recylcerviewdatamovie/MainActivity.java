package com.example.recylcerviewdatamovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //inisialisasi recyclerview, adapter, obj movies
    RecyclerView recyclerView;
    MoviesRecylcerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //akses recyclerview
        recyclerView = findViewById(R.id.recyclerView);

        //menambah data pada list
        objMovies.add(new Movies("The Suicide Squad", "Action, Adventure, Comedy", "James Gunn", 7.3, "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.","6 Agustus 2021"));
        objMovies.add(new Movies("Loki","Action, Adventure, Fantasy","Michael Waldron",8.4,"The mercurial villain Loki resumes his role as the God of Mischief in a new series that takes place after the events of “Avengers: Endgame.”","9 Juni 2021"));
        objMovies.add(new Movies("Logan","Action","James Mangold", 8.2, "In a future where mutants are nearly extinct, an elderly and weary Logan leads a quiet life. But when Laura, a mutant child pursued by scientists, comes to him for help, he must get her to safety.","3 Maret 2017"));

        adapter = new MoviesRecylcerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}