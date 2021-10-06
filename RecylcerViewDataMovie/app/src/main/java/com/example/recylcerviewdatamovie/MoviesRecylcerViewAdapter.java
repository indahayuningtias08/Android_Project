package com.example.recylcerviewdatamovie;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecylcerViewAdapter extends RecyclerView.Adapter<MoviesRecylcerViewAdapter.MovieViewHolder> {
    ArrayList<Movies> arrayListMovies;

    // List untuk menampung data yang dikirim
    public MoviesRecylcerViewAdapter(ArrayList<Movies> arrayListMovies) {
        this.arrayListMovies = arrayListMovies;
    }

    @NonNull
    @Override
    public MoviesRecylcerViewAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // menempel layout adapter dengan template item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        final Movies movie = arrayListMovies.get(position);

        // menempel variable adapter dengan template item
        holder.textViewTitle.setText(movie.getTitle());
        holder.textViewRating.setText(String.valueOf(movie.getRating()));
        holder.textViewReleaseDate.setText(movie.getReleasedate());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMovieActivity.class);
                intent.putExtra("MOVIES", movie);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        // melakukan perulangan pada item
        return arrayListMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewRating, textViewReleaseDate;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            // set nilai yang dikirim dari model ke variable adapter
            textViewTitle = itemView.findViewById(R.id.tvTitle);
            textViewRating = itemView.findViewById(R.id.tvRating);
            textViewReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
        }
    }
}
