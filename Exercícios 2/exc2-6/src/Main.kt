package funcoes

import kotlin.math.sqrt
import kotlin.math.PI

    fun areaRetangulo(base: Double, altura: Double): Double {
        return (base * altura)
    }

    fun areaTrianguloEqui(lado: Double): Double {
        return (lado * lado * sqrt(3.0)) / 4
    }

    fun areaTrianguloIso(base: Double, altura: Double): Double {
        return (base * altura)/2
    }

    fun areaTrianguloEsca(base: Double, altura: Double): Double {
    return (base * altura)/2
    }

    fun areaCircuferencia(raio: Double): Double {
        return ((2 * PI) * raio)
    }

    fun areaTrapezio(basemaior: Double, basemenor: Double, altura: Double): Double {
        return (basemaior+basemenor*altura)/2
    }

    fun areaLosango(diagonalmaior: Double, diagonalmenor: Double): Double {
        return (diagonalmaior * diagonalmenor)/2
    }

fun main(args: Array<String>) {
    while (true) {
        println("Calculadora de área")
        println("Escolha a forma geométrica que deseja calcular a área:")
        println("1: Retângulo")
        println("2: Triângulo Equilátero")
        println("3: Triângulo Isósceles")
        println("4: Circunferência")
        println("5: Losango")
        println("6: Trapézio")
        print("Digite o número conforme a forma que deseja: ")
        val forma = readLine()?.toIntOrNull()

        when (forma) {
            1 -> {
                print("Digite o valor da base: ")
                var base = readLine()?.toDoubleOrNull() ?: return
                print("Digite o valor da altura: ")
                var altura = readLine()?.toDoubleOrNull() ?: return
                println("A área do Retângulo é: ${areaRetangulo(base, altura)}")
            }
            2 -> {
                print("Digite o valor do lado: ")
                var lado = readLine()?.toDoubleOrNull() ?: return
                println("A área do Triângulo Equilátero é: ${areaTrianguloEqui(lado)}")
            }
            3 -> {
                print("Digite o valor da base: ")
                var base = readLine()?.toDoubleOrNull() ?: return
                print("Digite o valor da altura: ")
                var altura = readLine()?.toDoubleOrNull() ?: return
                println("A área do Triângulo Isósceles é: ${areaTrianguloIso(base, altura)}")
            }
            3 -> {
                print("Digite o valor da base: ")
                var base = readLine()?.toDoubleOrNull() ?: return
                print("Digite o valor da altura: ")
                var altura = readLine()?.toDoubleOrNull() ?: return
                println("A área do Triângulo Escaleno é: ${areaTrianguloEsca(base, altura)}")
            }
            4 -> {
                print("Digite o valor do raio: ")
                var raio = readLine()?.toDoubleOrNull() ?: return
                println("A área da Circuferencia  é: ${areaCircuferencia(raio)}")
            }
            5 -> {
                print("Digite o valor da base maior: ")
                var basemaior = readLine()?.toDoubleOrNull() ?: return
                print("Digite o valor da base menor: ")
                var basemenor = readLine()?.toDoubleOrNull() ?: return
                print("Digite o valor da altura: ")
                var altura = readLine()?.toDoubleOrNull() ?: return
                println("A área do Trapezio é: ${areaTrapezio(basemaior, basemenor, altura)}")
            }
            6 -> {
                print("Digite o valor da diagonal maior: ")
                var diagonalmaior = readLine()?.toDoubleOrNull() ?: return
                print("Digite o valor da diagonal menor: ")
                var diagonalmenor = readLine()?.toDoubleOrNull() ?: return
                println("A área do Losango é: ${areaLosango(diagonalmaior, diagonalmenor)}")
            }

            else -> {
                println("Opção inválida. Digite um número válido.")
            }
        }

        println("Deseja reiniciar o programa? (S/N)")
        val resposta = readLine()?.toUpperCase()
        if (resposta != "S") {
            break
        }
    }

    println("Programa encerrado.")
}