package com.cornerjob.marvelheroes.di.modules

import android.app.Application
import android.content.Context
import com.cornerjob.marvelheroes.presentation.MainApp
import com.cornerjob.marvelheroes.presentation.util.Navigator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MainApp) {

    @Provides
    @Singleton
    fun provideApp(): Application = application

    @Provides
    @Singleton
    fun provideContext(): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideNavigator(): Navigator = Navigator()

}