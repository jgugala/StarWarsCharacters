package com.hpk.solutions.starwarscharacters.di.components;

import android.app.Application;

import com.hpk.solutions.starwarscharacters.StarWarsCharactersApp;
import com.hpk.solutions.starwarscharacters.di.modules.ActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by jgugala on 2018-02-21.
 */

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(StarWarsCharactersApp app);
}
