fun main() {

    val serie = 1.rangeTo(10)
    println("Imprimindo range de 1 a 10")
    for (s in serie) {
        print("$s ")
    }

    val numerosPares = 0..100 step 2

    val numerosPares2 = 0.until(100) step 2

    val numerosPares3 = 100 downTo 0 step 2

    println("\n\nImprimindo range pelo For")
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()
    println() // usando o until
    println("Imprimindo range usando Until pelo For")
    for (numeroPar in numerosPares2) {
        print("$numeroPar ")
    }

    println()
    println()
    println("Imprimindo range usando downTo pelo For")
    for (numeroPar in numerosPares3) {
        print("$numeroPar ")
    }

    println()
    println()
    println("Imprimindo range pelo forEach")
    numerosPares.forEach { numero -> print("$numero ") }

    println()
    println()
    println("Verificando valor dentro de intervalo numérico")
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Valor dentro do intervalo")
    }
    else {
        println("Valor fora do intervalo")
    }

    println()
    println("Verificando letra dentro de intervalo alfabético")
    val alfabeto = 'a'..'z'
    val letra = 'k'
    val letraMaiuscula = 'K'
    println(letra in alfabeto)
    println(letraMaiuscula in alfabeto)

}