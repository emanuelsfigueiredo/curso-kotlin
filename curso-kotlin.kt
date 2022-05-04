import java.util.Scanner

/*
exercicio 4

 */
fun main() {
    println("diga para qual exercicio vc quem ir:")
    var reader = Scanner(System.`in`)
    var exercicio = reader.nextInt()
    when (exercicio) {
        1 -> ex1(exercicio)
        2 -> ex2(exercicio)
        3 -> ex3(exercicio)
        3 -> ex4(exercicio)
    }
}

fun ex1(exercicio: Int) {
    var reader = Scanner(System.`in`)
    println("digite um lado da figura")
    var n1 = reader.nextInt()
    println("digite um lado da figura")
    var n2 = reader.nextInt()

    if (n1 == n2) println("o quadrado é equilatero ")
    else println("o quadrado nao é equilatero")
}

fun ex2(exercicio: Int) {
    var reader = Scanner(System.`in`)
    println("digite um lado da figura")
    var n1 = reader.nextInt()
    println("digite um lado da figura")
    var n2 = reader.nextInt()
    println("digite um lado da figura")
    var n3 = reader.nextInt()

    if (n1 == n2 || n1 == n3 || n2 == n3) println("o triangulo é equilatero")
    else println("o triangulo não é equilatero ")
}

fun ex3(exercicio: Int) {

}

fun ex4(exercicio: Int) {
    var reader = Scanner(System.`in`)
    println("informe sua idade")
    var idade = reader.nextInt()
    if (idade < 18) println("acesso negado")
    println("qual o tipo do seu convite:")
    var convite = readln()
    if (convite != null && convite != "") {
        convite = convite.lowercase()
       if (convite == "comum" || convite == "premium" || convite == "luxo"){
           println("digite o codigo do convite")
       } else return
    } else return
}
