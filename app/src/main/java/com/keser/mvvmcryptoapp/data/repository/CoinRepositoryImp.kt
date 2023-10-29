package com.keser.mvvmcryptoapp.data.repository

import com.keser.mvvmcryptoapp.data.remote.CryptoApi
import com.keser.mvvmcryptoapp.data.remote.dto.CoinDetailDto
import com.keser.mvvmcryptoapp.data.remote.dto.CoinDto
import com.keser.mvvmcryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CryptoApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}