package list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    // listas sempre trabalham com objetos, nunca tipos primitivos
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro2)

    livros.imprimeComMarcadores()

    // precisamos que Livro implemente Comparable para ter acesso a esse método
    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    // nos permite ordenar por um critério determinado
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val ordenadoPorAutor = livros.sortedBy { it.autor }
    ordenadoPorAutor.imprimeComMarcadores()

    livros.filter { it.autor == "João Guimarães Rosa" }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos: List<String> = livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)

}

fun List<Livro?>.imprimeComMarcadores() {
    val joinToString = this
        .filterNotNull() // filtra os nulos. Não preciso de safe call depois disso.
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println("\n #### Lista de Livros #### \n$joinToString")
}

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),

    null,

    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),

    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),

    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )
)

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),

    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),

    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),

    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )
)