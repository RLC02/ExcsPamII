inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no metodo $nomeFuncao...")
    try {
        return funcao()
    }finally {
        println("Método $nomeFuncao finalizado...")
    }
}
fun somar(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    val resultado = executarComLog("somar"){
        somar(4, 5)
    }
    println(resultado)
}