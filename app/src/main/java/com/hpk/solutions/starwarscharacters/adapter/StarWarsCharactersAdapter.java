package com.hpk.solutions.starwarscharacters.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.hpk.solutions.starwarscharacters.model.Character;

import java.util.List;

/**
 * Created by jgugala on 2017-10-31.
 */

public class StarWarsCharactersAdapter extends RecyclerView.Adapter<StarWarsCharactersAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(View view, Character item, int position);
    }

    private List<Character> characters;

    private OnItemClickListener onItemClickListener;

    public StarWarsCharactersAdapter(List<Character> characters){
        this.characters = characters;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
