package com.hpk.solutions.starwarscharacters.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hpk.solutions.starwarscharacters.R;
import com.hpk.solutions.starwarscharacters.databinding.ItemStarWarsCharactersListBinding;
import com.hpk.solutions.starwarscharacters.model.Character;
import com.hpk.solutions.starwarscharacters.view.StarWarsCharactersListItemViewModel;

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

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final  ItemStarWarsCharactersListBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.item_star_wars_characters_list, parent, false
        );
        return new StarWarsCharactersAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final  Character character = characters.get(position);
        final StarWarsCharactersListItemViewModel itemViewModel =
                new StarWarsCharactersListItemViewModel(character);

        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(v, character, position);
            }
        });
        holder.bind(itemViewModel);
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ItemStarWarsCharactersListBinding binding;

        ViewHolder(ItemStarWarsCharactersListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(StarWarsCharactersListItemViewModel itemViewModel) {
            binding.setStarWarsCharactersListItemViewModel(itemViewModel);
            binding.executePendingBindings();
        }
    }
}
