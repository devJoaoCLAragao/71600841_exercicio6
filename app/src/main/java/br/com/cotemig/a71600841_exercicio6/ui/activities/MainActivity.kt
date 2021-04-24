package br.com.cotemig.a71600841_exercicio6.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.cotemig.a71600841_exercicio6.R
import br.com.cotemig.a71600841_exercicio6.model.ListaProduto
import br.com.cotemig.a71600841_exercicio6.model.Produto
import br.com.cotemig.a71600841_exercicio6.services.RetrofitInitializer
import br.com.cotemig.a71600841_exercicio6.ui.adapters.ProdutoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getProdutos()
    }

    fun getProdutos() {
        var s = RetrofitInitializer().serviceAmigos()
        var call = s.obterListaProdutos()

        call.enqueue(object : Callback<ListaProduto> {
            override fun onFailure(call: Call<ListaProduto>, t: Throwable) {
            }

            override fun onResponse(call: Call<ListaProduto>, response: Response<ListaProduto>) {
                response.body()?.let {
                    mostraLista(it.lista)
                }
            }
        })
    }

    fun mostraLista(lista : List<Produto>){
        listView_produtos.adapter = ProdutoAdapter(this, lista)
    }

}