fun main() {
    println(problema1(arrayOf(1,2,2,3),4))
    println(problema2("lero lore lore"))
}

fun problema1(lista: Array<Int>, objetivo: Int): String {
    for ((indice,item) in lista.withIndex()) {
        val otro = objetivo - item
        if (otro in lista) {
            return ("Los indices son $indice y ${lista.indexOf(otro)}")
        }
    }
    return "No hay números que sumen $objetivo"
}

fun problema2(texto: String): MutableMap<String, Int> {
    val textoSeparado = texto.split(" ")
    val cuantas = mutableMapOf<String,Int>()
    for (palabra in textoSeparado){
        val puto: (String) -> Boolean = {it == palabra}
        cuantas[palabra] = textoSeparado.count(puto)
    }
    return cuantas
}


