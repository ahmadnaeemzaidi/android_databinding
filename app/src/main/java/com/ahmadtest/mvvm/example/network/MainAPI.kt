package com.ahmadtest.mvvm.example.network

import com.ahmadtest.mvvm.example.model.DataItem
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.*

interface MainAPI {
    @GET("list")
    fun getList(): Observable<List<DataItem>>
}