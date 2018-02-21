package com.hpk.solutions.starwarscharacters.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.hpk.solutions.starwarscharacters.R;
import com.hpk.solutions.starwarscharacters.adapter.StarWarsCharactersAdapter;
import com.hpk.solutions.starwarscharacters.databinding.ActivityStarWarsCharactersBinding;
import com.hpk.solutions.starwarscharacters.model.Character;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class StarWarsCharactersActivity extends AppCompatActivity implements StarWarsCharactersAdapter.OnItemClickListener {

    private StarWarsCharactersAdapter adapter;

    @Inject
    StarWarsCharactersViewModel viewModel;

    private ActivityStarWarsCharactersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_star_wars_characters);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initRecyclerView();
    }

    private void initRecyclerView() {
        adapter = new StarWarsCharactersAdapter(viewModel.getCharacters());
        adapter.setOnItemClickListener(this);
        binding.starWarsCharactersList.setLayoutManager(new LinearLayoutManager(this));
        binding.starWarsCharactersList.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, Character item, int position) {

    }
}
