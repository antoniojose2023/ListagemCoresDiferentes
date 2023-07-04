package br.com.antoniojoseuchoa.listagemcoresdiferentes

class Database {
    companion object{
        fun getListaEstados(): List<Estado> {
            return listOf(
                Estado(1, "Ceara"),
                Estado(2, "Bahia"),
                Estado(3, "Piaui"),
                Estado(4, "Pernambuco"),
                Estado(5, "Maranhão"),
                Estado(6, "Paraiba"),
                Estado(7, "Rio de Janeiro"),
                Estado(8, "São Paulo"),
                Estado(9, "Curitiba"),
                Estado(10, "Acre"),
            )
        }
    }
}