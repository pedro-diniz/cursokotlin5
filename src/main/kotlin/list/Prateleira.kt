package list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor() : List<Livro> {
        // sortedBy retorna uma NOVA lista.
        // sortBy ordena a lista atual
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao() : List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}