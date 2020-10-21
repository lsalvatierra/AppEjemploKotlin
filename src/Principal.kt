
fun main(args: Array<String>){
    //Definición de variables y constantes
    var titulo = "QBO Institute"
    var subtitulo: String = ""
    subtitulo = "Kotlin Expert for Android"
    //Definición de constantes
    val tema: String
    tema= "Fundamentos de Kotlin"
    //Enteros
    var numeroInt: Int = 5
    var numeroInt2: Int
    numeroInt2 = 10
    //Double
    var numeroDouble1: Double
    var numeroDouble2: Double
    numeroDouble1 = 4.5
    numeroDouble2 = 12.3
    //Char
    val dato: Char = '1'
    val dato2: Char = '2'
    //println("Resultado dato+dato2 = "+ dato+dato2)
    val mensaje: String = "Hola mundo Kotlin"
    val nombre: String = "Luis"
    val anioNac = 1990
    val anioAct = 2020
    println("Nombre $nombre tiene ${anioAct - anioNac} años")
    //Array
    val arrayNumeros :IntArray = intArrayOf(23,2,5,6)
    println(arrayNumeros[2])
    val arrayEdades : IntArray = IntArray(5)
    println(arrayEdades[4])
    val arrayVersiones : IntArray = IntArray(5){ 1 }
    println(arrayVersiones[4])
    //ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("Ajay")
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print ArrayList-String.......")
    println(arrayList.get(1))

    val arrayList2 = ArrayList<Int>(5)
    arrayList2.add(14)
    arrayList2.add(20)
    arrayList2.add(80)
    println("......print ArrayList2-Int......")
    println(arrayList2.get(1))
    for (i in arrayList2) {
        println(i)
    }

    obtenerLargoApellido2("Luis", "Maicol")
    println(calcularNumero(6))
    println(multiplicarNumeros(3,4))
    val objPersona = Persona("Luis", 30)
    val objAutomovil = Automovil()
    objAutomovil.propietario = "Marcos"
    objAutomovil.precio = 100000
    println(objAutomovil.esMuyCaro)

}

val calcularNumero = { num : Int -> num * 3 }

val multiplicarNumeros: (Int, Int) -> Int = {x,y -> x * y}


//Métodos y Funciones
fun imprimirMensaje(mensaje: String) : String {
    return "Retorno de mensaje $mensaje"
}
//Condicionales
fun obtenerLargoApellido2(ape: String, ape2: String){
    //var apellidoLargo = ""
    val apellidoLargo = if(ape.length > ape2.length){
        ape
    }else if (ape2.length > ape.length){
        ape2
    }else{
        "Apellidos IGUALES DE LONGITUD"
    }
    println("El apellido más extenso es $apellidoLargo")
}

fun logintudDeNombre(nombre: String){
    when(nombre.length){
        0 -> println("Nombre vacío")
        in 1..4 -> println("Nombre pequeño")
        in 5..7 -> println("Nombre mediano")
        else -> println("Nombre extenso")
    }
}
fun numeroPar(num: Int) = when (num % 2){
    0 -> println("El número es par")
    else->println("El número es impar")
}
fun bucleFor(){
    val edades = intArrayOf(25,24,30,39,50)
    for(edad: Int in edades){
        //println(edad.toString())
    }
    for((indice, valor) in edades.withIndex()){
        //println("Edad: $indice - $valor")
    }
    for(i in 5..15) println(i)
}
fun bucleWhile(){
    var i = 10
    /*while(i > 0){
        println(i)
        i--
    }*/
    i = 10
    do{
        println(i)
        i--
    }while(i > 0)

}
//
fun busquedaOrdenamiento(){
    for(i in 1..4){
        for(j in 1..4){
            if(i == 2 && j == 2){
                println("Ambas variables son IGUALES")
                break
            }else{
                println("i $i - j $j")
            }
        }
    }


}

class Persona(private var nombre: String, private var edad: Int){

    init {
        println("La persona $nombre, ha sido creada")
    }
}

class Automovil{
    val modelo = "Deportivo"
    var precio = 20000
    lateinit var propietario: String
    val esMuyCaro: Boolean
        get() = precio > 50000
}

