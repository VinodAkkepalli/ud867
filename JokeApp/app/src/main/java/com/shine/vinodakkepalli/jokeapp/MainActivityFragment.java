package com.shine.vinodakkepalli.jokeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.JokeFactoryAuto;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @BindView(R.id.textview1)
    TextView text1;
    @BindView(R.id.textview2)
    TextView text2;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);

        text1.setText(new JokeFactoryAuto().getJoke());
        text2.setText(new JokeFactoryAuto().getManualJoke());

        return rootView;
    }
}
