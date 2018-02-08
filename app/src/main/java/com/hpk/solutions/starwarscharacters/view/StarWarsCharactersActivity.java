package com.hpk.solutions.starwarscharacters.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.hpk.solutions.starwarscharacters.R;
import com.hpk.solutions.starwarscharacters.adapter.StarWarsCharactersAdapter;
import com.hpk.solutions.starwarscharacters.databinding.ActivityStarWarsCharactersBinding;
import com.hpk.solutions.starwarscharacters.di.components.ActivityComponent;
import com.hpk.solutions.starwarscharacters.di.components.DaggerActivityComponent;
import com.hpk.solutions.starwarscharacters.di.modules.ActivityModule;
import com.hpk.solutions.starwarscharacters.model.Character;

import javax.inject.Inject;

public class StarWarsCharactersActivity extends AppCompatActivity implements StarWarsCharactersAdapter.OnItemClickListener {

    private StarWarsCharactersAdapter adapter;

    @Inject
    StarWarsCharactersViewModel viewModel;

    private ActivityStarWarsCharactersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_star_wars_characters);

        DaggerActivityComponent.builder()
                .build()
                .inject(this);
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
