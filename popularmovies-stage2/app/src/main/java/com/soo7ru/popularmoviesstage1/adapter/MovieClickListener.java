package com.soo7ru.popularmoviesstage1.adapter;

import android.widget.ImageView;

import com.soo7ru.popularmoviesstage1.model.Movie;

public interface MovieClickListener {
    void onMovieClick(int pos, Movie movie, ImageView shareImageView);
}