//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nota3 = 3
    when(nota3) {
        10, 9 -> println("Fanstástico")
        8, 7 -> println("Parabéns")
        6, 5, 4 -> println("Tem como recuperar")
        in 3..0 -> println("Te vejo próximo semestre")
        else -> println("Nota invalida")
    }

}