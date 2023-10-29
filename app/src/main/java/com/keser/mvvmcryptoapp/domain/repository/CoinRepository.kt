package com.keser.mvvmcryptoapp.domain.repository

import com.keser.mvvmcryptoapp.data.remote.dto.CoinDetailDto
import com.keser.mvvmcryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}