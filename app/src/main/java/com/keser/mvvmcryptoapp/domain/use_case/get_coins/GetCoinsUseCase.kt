package com.keser.mvvmcryptoapp.domain.use_case.get_coins

import com.keser.mvvmcryptoapp.common.Constants.UNKNOWN_ERROR
import com.keser.mvvmcryptoapp.common.Resource
import com.keser.mvvmcryptoapp.data.remote.dto.toCoin
import com.keser.mvvmcryptoapp.domain.model.Coin
import com.keser.mvvmcryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: UNKNOWN_ERROR))
        } catch (e: IOException) {
            emit(Resource.Error(e.message ?: UNKNOWN_ERROR))
        }
    }
}