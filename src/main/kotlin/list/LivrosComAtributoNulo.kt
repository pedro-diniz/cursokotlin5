package list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" } // agrupa por editora, retorna "Editora desconhecida" se for nula
        .forEach { editora, livros -> // para cada editora, printa todos os livros que a pertence
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}