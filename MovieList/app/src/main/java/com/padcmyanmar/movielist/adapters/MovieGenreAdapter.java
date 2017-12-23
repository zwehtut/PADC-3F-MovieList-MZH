package com.padcmyanmar.movielist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.viewholders.MovieGenreViewHolder;

/**
 * Created by ZWE on 22/12/2017.
 */

public class MovieGenreAdapter extends Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View movieGenre = layoutInflater.inflate(R.layout.item_movie_genre, parent, false);
        MovieGenreViewHolder movieGenreViewHolder = new MovieGenreViewHolder(movieGenre);
        return movieGenreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
