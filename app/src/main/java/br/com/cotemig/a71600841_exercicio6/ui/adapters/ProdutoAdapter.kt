package br.com.cotemig.a71600841_exercicio6.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.cotemig.a71600841_exercicio6.R
import br.com.cotemig.a71600841_exercicio6.model.Produto
import com.bumptech.glide.Glide


class ProdutoAdapter (var context: Context, var lista : List<Produto>) : BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_lista_produto, null)

        var imagem = view.findViewById<ImageView>(R.id.imagem)
        Glide.with(context).load(lista[p0].imagem).into(imagem)

        var valor = view.findViewById<TextView>(R.id.valor)
        valor.text = lista[p0].valor.toString()

        var nome = view.findViewById<TextView>(R.id.nome)
        nome.text = lista[p0].nome

        return view
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return lista.size
    }
}