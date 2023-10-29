package com.keser.mvvmcryptoapp.di

import com.keser.mvvmcryptoapp.common.Constants.BASE_URL
import com.keser.mvvmcryptoapp.data.remote.CryptoApi
import com.keser.mvvmcryptoapp.data.repository.CoinRepositoryImp
import com.keser.mvvmcryptoapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CryptoModule {

    @Singleton
    @Provides
    fun provideCryptoApi(): CryptoApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCryptoRepository(api: CryptoApi): CoinRepository {
        return CoinRepositoryImp(api)
    }
}