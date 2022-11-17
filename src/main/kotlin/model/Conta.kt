package model

class Conta constructor(
    val titular: String,
    val numeroConta: Int
) {
    var saldo: Double = 0.0
        private set


    fun statusSaldo() {
        when {
            this.saldo > 0.0 -> println("Saldo de ${this.titular} é positivo, disponivel ${this.saldo}")
            this.saldo == 0.0 -> println("Conta de ${this.titular} está sem saldo")
            else -> println("Conta no negativo")
        }
    }

    fun deposito(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor
            println("Deposito no valor de $valor")
        } else {
            println("Insira um valor maior que 00.0")
        }
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo += valor
            println("Saque no valor de $valor autorizado pela instituição")
        }
    }

    fun transferir(valor: Double, contaDestino: Conta) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.deposito(valor)
            println("Transferência no valor de $valor autorizado pela agência financeira. Para o cliente ${contaDestino.titular}")
            println("Processo concluido")
        } else {
            println("Transfercia no valor de $valor não está indisponivel, saldo atual da conta é de ${this.saldo}")
            println("## Tente Novamente ##")
        }
    }
}
