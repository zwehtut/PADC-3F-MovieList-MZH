package com.padcmyanmar.movielist.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.movielist.R;
import com.padcmyanmar.movielist.adapters.MovieReviewsAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ZWE on 15/12/2017.
 */

public class ItemsNewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movies_trailers)
    RecyclerView rvMoviesTrailers;

    private MovieReviewsAdapter nMovieReviewsAdapter = new MovieReviewsAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_news_details);
        ButterKnife.bind(this, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvMoviesTrailers.setLayoutManager(linearLayoutManager);
        rvMoviesTrailers.setAdapter(nMovieReviewsAdapter);




    }
}