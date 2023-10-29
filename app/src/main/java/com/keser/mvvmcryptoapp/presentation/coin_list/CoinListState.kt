package com.keser.mvvmcryptoapp.presentation.coin_list

import com.keser.mvvmcryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
