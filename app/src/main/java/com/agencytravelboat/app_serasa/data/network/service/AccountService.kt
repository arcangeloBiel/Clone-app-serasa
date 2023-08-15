package com.agencytravelboat.app_serasa.data.network.service



import com.agencytravelboat.app_serasa.data.model.Response
import retrofit2.http.GET

interface AccountService {
    @GET("/santander-dev-week-2023-api/mocks/find_one.json")
    suspend fun getAccount(): Response
}