import java.math.BigDecimal
import java.math.RoundingMode

// BigDecimal não é um tipo primitivo, não existe bigDecimalArrayOf da linguagem
fun bigDecimalArrayOf(vararg valores:String): Array<BigDecimal> { // vararg pode receber N valores
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) : BigDecimal {
    if (salario < "5000.00".toBigDecimal()) {
        return salario + "500".toBigDecimal()
    }
    else {
        // setScale define as casas decimais e o tipo de arredondamento
        return (salario * aumento).setScale(2, RoundingMode.UP)
    }

}

// extension function, utilizável por todos os objetos dessa classe
// acumula todos os salários no acumulador, que começa zerado
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media() : BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    }
    else {
        this.somatoria() / this.size.toBigDecimal()
    }
}