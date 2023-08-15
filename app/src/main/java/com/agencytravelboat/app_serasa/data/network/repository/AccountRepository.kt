package com.agencytravelboat.app_serasa.data.network.repository

import com.agencytravelboat.app_serasa.data.network.service.AccountService
import javax.inject.Inject

class AccountRepository @Inject constructor(
    private val accountService: AccountService,
) {
    suspend fun getAccount() = accountService.getAccount()
}