package br.com.cotemig.a71600841_exercicio6.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {


    private val retrofit = Retrofit.Builder().baseUrl("https://mockup.fluo.app/v1/").addConverterFactory(
        GsonConverterFactory.create()).build()

    fun serviceAmigos() : ServiceProduto{
        return retrofit.create(ServiceProduto::class.java)
    }
}