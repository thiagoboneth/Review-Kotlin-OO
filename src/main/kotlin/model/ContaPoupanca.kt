package model

class ContaPoupanca(
    titular: String,
    numeroConta: Int
) :Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Saque no valor de $valor autorizado pela instituição")
        }
    }
}
