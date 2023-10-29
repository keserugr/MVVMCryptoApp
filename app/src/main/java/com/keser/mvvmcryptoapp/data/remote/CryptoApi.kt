package com.keser.mvvmcryptoapp.data.remote

import com.keser.mvvmcryptoapp.data.remote.dto.CoinDetailDto
import com.keser.mvvmcryptoapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptoApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}