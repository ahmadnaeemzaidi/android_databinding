package com.ahmadtest.mvvm.example.repository

import com.ahmadtest.mvvm.example.network.MainAPI
import javax.inject.Inject

class MainRepository {
    @Inject
    lateinit var api: MainAPI
}