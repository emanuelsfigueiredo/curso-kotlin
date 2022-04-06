//import java.util.Collections.max
import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    println(
        "qual o seu cargo ?" + "1 para gerente " + "2 para coordenador" + "3 para engenheiro de software" + "4 para estagiario "
    )

    cargo(reader.nextInt())

}

fun cargo(escolha: Int) {
    val reader = Scanner(System.`in`)
    var experiencia: Int
    if (escolha == 1) {
        println("quantos anos de experiencia vc tem ")
        experiencia = reader.nextInt()

    if (experiencia <= 2)
        println("seu bônus será de R$2.000,00")
     else if (experiencia > 2)
        println("seu bônus será de R$3.000,00")
    } else if (escolha == 2) {
        println("quantos anos de experiencia vc tem ?")
        experiencia = reader.nextInt()

    if (experiencia <= 1)
        println("seu bônus será de R$1.500,00")
    else if (experiencia > 1)
        println("seu bônus será de R$1.800,00")
    } else if (escolha == 3) {
        println("seu bônus será de R$1.000,00")
    } else if (escolha == 4) {
        println("seu bônus será de R$500,00")
    } else {
        println("opção invalida!")
    }
}
