package com.hpk.solutions.starwarscharacters.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hpk.solutions.starwarscharacters.R;
import com.hpk.solutions.starwarscharacters.adapter.StarWarsCharactersAdapter;

public class StarWarsCharactersActivity extends AppCompatActivity {

    private StarWarsCharactersAdapter adapter;

    private StarWarsCharactersViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_star_wars_characters);
        viewModel = new StarWarsCharactersViewModel();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initRecyclerView();
    }

    private void initRecyclerView() {
        adapter = new StarWarsCharactersAdapter(viewModel.getCharacters());
    }
}
