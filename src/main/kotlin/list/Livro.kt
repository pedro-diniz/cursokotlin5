package list

data class Livro( // cria equals, toString e hashCode em tempo de compilação, por isso o data class
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {

    // método obrigatoriamente implementado para compararmos e, consequentemente, ordenarmos uma lista de livros
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }

}