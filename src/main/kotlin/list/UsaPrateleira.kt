package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    // as 2 variáveis apontam pro mesmo objeto (listaDeLivros). Se minha lista for Mutable, as 2 impressões serão iguais
    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

}