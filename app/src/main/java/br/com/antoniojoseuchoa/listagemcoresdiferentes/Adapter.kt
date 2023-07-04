package br.com.antoniojoseuchoa.listagemcoresdiferentes

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.antoniojoseuchoa.listagemcoresdiferentes.databinding.ItemEstadoBinding

class AdapterEstados(val list: List<Estado>): RecyclerView.Adapter<AdapterEstados.ViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemEstadoBinding.inflate(layoutInflater, parent, false)
        return ViewHolder( binding )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val estado = list[position]
         holder.bind( estado, position )
    }

    override fun getItemCount() = list.size

    inner class ViewHolder(val binding: ItemEstadoBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(item: Estado, posicao: Int){

            if(posicao % 2 == 1){
                binding.root.setCardBackgroundColor(Color.parseColor("#ECE7E7"))
            }

            binding.tvTitulo.text = item.nomeEstado
        }
    }
}