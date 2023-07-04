package br.com.antoniojoseuchoa.listagemcoresdiferentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.antoniojoseuchoa.listagemcoresdiferentes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        configurarListagem()

    }

    fun configurarListagem(){

        val estados = Database.getListaEstados()
        val adapterEstados = AdapterEstados(estados)

//        binding.rvEstados.layoutManager = LinearLayoutManager(this)
//        binding.rvEstados.adapter = adapterEstados
//        binding.rvEstados.setHasFixedSize(true)

         binding.rvEstados.apply {
             layoutManager = LinearLayoutManager(applicationContext)
             adapter = adapterEstados

         }

    }

}