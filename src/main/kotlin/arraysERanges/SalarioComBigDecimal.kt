import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    // array de bigdecimals, com 5 espaços alocados, todos inicializados como zero
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    // O map retorna lista, então colocamos o .toTypedArray pra nos mantermos com array
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)


    val meses = 6.toBigDecimal()

    // calcula o gasto com funcionários no primeiro mês (gastoInicial) e nos próximos 6 meses
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)

    val mediaMaioresSalarios = salariosComAumento.sorted() // ordena
        .takeLast(3)
        .toTypedArray() // pega os últimos n elementos, nesse caso, 3.
        .media()

    println(mediaMaioresSalarios)

    val mediaMenoresSalarios = salariosComAumento.sorted()
        .take(3)
        .toTypedArray()
        .media()

    println(mediaMenoresSalarios)

}