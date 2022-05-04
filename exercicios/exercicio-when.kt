/*
exercicio when
monte um programa que leia a idade de uma e diga qual a sua categoria
0 a 12 infantil
13 a 17 infanto juvenil
18 a 24 juvenil
24 a 59 adulto
60 em diante idoso
 */
import java.util.*

fun main(){
    println("Digite sua idade")
    val reader = Scanner(System.`in`)
    var idade = idadewhen(reader.nextInt())
}

fun idadewhen(idade: Int){
    println(" Sua categoria é:")
    when(idade){
        in 1..12 -> println("infantil")
        in 13..17 -> println("infanto juvenil")
        in 18..24 -> println("juvenil")
        in 15..59 -> println("adulto")
        in 60..120 -> println("idoso")

    }
}