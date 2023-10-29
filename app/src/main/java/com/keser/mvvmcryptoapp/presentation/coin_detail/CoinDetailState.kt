package com.keser.mvvmcryptoapp.presentation.coin_detail

import com.keser.mvvmcryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
