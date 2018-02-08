package com.hpk.solutions.starwarscharacters.di.components;

import com.hpk.solutions.starwarscharacters.di.modules.ActivityModule;
import com.hpk.solutions.starwarscharacters.view.StarWarsCharactersActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jgugala on 2018-02-01.
 */

@Singleton
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(StarWarsCharactersActivity activity);
}
