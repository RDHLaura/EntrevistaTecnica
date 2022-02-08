fun main(args: Array<String>) {

    var miLista= listOf<Int>(1,2,1,2)
    println(primer_ejer(3, miLista))
    var cadena="numeros numeros la la la hola"
    println(ejercicio2(cadena))
    var cadenaSignos="[({}){}[([])]]"
    println(ejercicio3_2(cadenaSignos))

}
fun primer_ejer(num_Obejtivo:Int, miLista:List<Int>):MutableMap<Int, Int> {
    var parejas:MutableMap<Int, Int> = mutableMapOf()

    for ((indice, valor) in miLista.withIndex()) {
        var posible=num_Obejtivo-valor

        if ((posible) in miLista) {
            if(indice!=miLista.indexOf(posible) && miLista.indexOf(posible)<indice)
                parejas[indice]=miLista.indexOf(posible)


        }
    }
    return parejas
}

fun ejercicio2(texto:String):MutableMap<String, Int>{
    var palabras=texto.split(" ")
    var repeticiocionesPalabras:MutableMap<String, Int> = mutableMapOf()
    for (palabra in palabras)
    {
        repeticiocionesPalabras[palabra]=palabras.filter { it==palabra }.count()
    }
    return repeticiocionesPalabras
}

fun ejercicio3_2(cadena:String):Boolean{
    var abiertos=mutableListOf<Char>()
    var cade=cadena.toCharArray()
    var aperturas=listOf<Char>('(','[','{')
    var cierres= listOf<Char>(')',']','}')

    for (caracter in cade){
        if(caracter in aperturas){
            abiertos.add(cierres[aperturas.indexOf(caracter)])
        }else{
            if(abiertos.isEmpty() || (caracter in abiertos && abiertos.last()!=caracter )){
                return false
            }else {
                abiertos.removeLast()
            }
        }
    }
    if(abiertos.isEmpty())
        return true
    else
        return false

}


