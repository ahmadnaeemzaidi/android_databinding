package com.ahmadtest.mvvm.example.di

import com.ahmadtest.mvvm.example.repository.MainRepository
import com.ahmadtest.mvvm.example.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MainModule::class])
@Singleton
interface MainComponent {
    fun inject(activity: MainActivity)
    fun inject(repository: MainRepository)

    @Component.Builder
    interface Builder {
        fun networkModule(module: MainModule) : Builder
        fun build() : MainComponent
    }
}