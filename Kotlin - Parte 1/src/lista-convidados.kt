fun main() {
    println("Favor informar o nome do convidado: ")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("Nome informado inválido!")
        return
    }
    println("Favor informar a idade do convidado: ")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0) {
        println("A idade informada inválida!")
        return
    }
    var  estaConvidado = false
    when(nome) {
        "Sônia" -> estaConvidado = true
        "Agata" -> estaConvidado = true
        "Adan" -> estaConvidado  = true
        "Marcia" -> estaConvidado = true
        "Alan" -> estaConvidado = true
    }
    if (estaConvidado && idade >= 18) {
        println("Bem vindo a festa!")
    }
    else if (!estaConvidado) {
        println("Você não esta convidado!")
    }
    else {
        println("Você não tem 18 anos para entrar na festa!")
    }
}