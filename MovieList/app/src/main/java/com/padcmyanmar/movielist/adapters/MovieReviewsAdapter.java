package com.padcmyanmar.movielist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.viewholders.MovieReviewsVewHolder;
import com.padcmyanmar.movielist.viewholders.MyViewHolder;
/**
 * Created by ZWE on 15/12/2017.
 */

public class MovieReviewsAdapter extends RecyclerView.Adapter{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View moviesReviewsView = layoutInflater.inflate(R.layout.movie_reviews_items, parent, false);
        MovieReviewsVewHolder moviesReviewsViewHolder = new MovieReviewsVewHolder(moviesReviewsView);
        return moviesReviewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
