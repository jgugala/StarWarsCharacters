package com.hpk.solutions.starwarscharacters.di.modules;

import com.hpk.solutions.starwarscharacters.view.StarWarsCharactersActivity;
import com.hpk.solutions.starwarscharacters.view.StarWarsCharactersViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by jgugala on 2018-01-29.
 */

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract StarWarsCharactersActivity contributeStarWarsCharactersActivity();
}
