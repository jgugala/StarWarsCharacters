package com.hpk.solutions.starwarscharacters.view;

import com.hpk.solutions.starwarscharacters.model.Character;

/**
 * Created by jgugala on 2018-01-09.
 */

public class StarWarsCharactersListItemViewModel {

    private Character character;

    public StarWarsCharactersListItemViewModel(Character character) {
        this.character = character;
    }

    public String getName() {
        return character.getName();
    }
}
