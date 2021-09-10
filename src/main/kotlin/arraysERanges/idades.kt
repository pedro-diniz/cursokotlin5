fun main() {

    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()

    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média: $media")

    // Retorna um boolean se a condição é satisfeita
    val todosMaiores = idades.all { it >= 18 }
    println("Todos são 18+? $todosMaiores")

    // Retorna um boolean se a condição é satisfeita
    val existeMaior = idades.any { it >= 18 }
    println("Há algum maior de idade? $existeMaior")

    // Retorna uma lista dos elementos que satisfazem a condição
    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    // Retorna o primeiro que satisfaça a condição
    val busca = idades.find { it > 18 }
    println("Busca: $busca")

}