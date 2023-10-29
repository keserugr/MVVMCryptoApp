package com.keser.mvvmcryptoapp.domain.use_case.get_coin

import com.keser.mvvmcryptoapp.common.Constants.UNKNOWN_ERROR
import com.keser.mvvmcryptoapp.common.Resource
import com.keser.mvvmcryptoapp.data.remote.dto.toCoinDetail
import com.keser.mvvmcryptoapp.domain.model.CoinDetail
import com.keser.mvvmcryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: UNKNOWN_ERROR))
        } catch (e: IOException) {
            emit(Resource.Error(e.message ?: UNKNOWN_ERROR))
        }
    }
}