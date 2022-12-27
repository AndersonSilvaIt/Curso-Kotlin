import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    // var nome: tipo.
    // var --> variável que pode ter o tipo mutável
    // val --> variável com o tipo imutável

        // Escrever no console
    println("Olá Mundo")


    var opcao: Int = 1
    //println(opcao)
    //print(" Oi")
    //print(opcao)

    when(opcao){
        1 -> println("Conta Corrente")
        1 -> println("Cartão de Crédito")
        1 -> println("Internet Banking")
        else -> {
            println("Nenhuma opção encontrada")
            println("Fale com um de nossos atendentes")
        }
    }

        // Laço for
        for (item in 1..20) {
            println(item)
        }

    // Array
    var array = arrayOf("SP", "RJ", "PR")
     array[0] = "RJ"
    array[1] = "SP"


    var mix = arrayOf("SP", 20, "RJ", 50)

    var inteiros = intArrayOf(30, 56, 21, 46, 70)

    for (  inteiro in inteiros){
        println(inteiro)
    }

    for (  (intex, inteiro ) in inteiros.withIndex()){
        // Pega o index também ...
        println(inteiro)
    }

    funcao01()
    println(getData())

    println(soma(4, 9))
}

fun funcao01(){
    println("Funcao 1")
}

fun getData() : Date {
    return Date()
}

fun soma(a: Int, b:Int) : Int {
   return a + b
}

