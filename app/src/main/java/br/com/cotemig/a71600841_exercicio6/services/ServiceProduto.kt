package br.com.cotemig.a71600841_exercicio6.services

import br.com.cotemig.a71600841_exercicio6.model.ListaProduto
import retrofit2.Call
import retrofit2.http.GET

interface ServiceProduto {

    @GET("produto")
    fun obterListaProdutos() : Call<ListaProduto>
}