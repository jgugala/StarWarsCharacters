package com.hpk.solutions.starwarscharacters.di.modules;

import com.hpk.solutions.starwarscharacters.view.StarWarsCharactersViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jgugala on 2018-01-29.
 */

@Module
public class ActivityModule {

    @Provides
    @Singleton
    StarWarsCharactersViewModel provideStarWarsCharactersViewModel() {
        return new StarWarsCharactersViewModel();
    }
}
