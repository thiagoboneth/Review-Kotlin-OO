package servico

import model.ContaCorrente
import model.ContaPoupanca

class TestaContasDiferentes {
    fun testaContas() {
        val contaCorrente = ContaCorrente(
            "Thiago",
            1020
        )
        val contaPoupanca = ContaPoupanca(
            "Luis",
            3040
        )

        contaCorrente.deposito(1000.00)
        contaPoupanca.deposito(1000.00)

        println(contaPoupanca.saldo)
        println(contaCorrente.saldo)

        contaPoupanca.saque(100.00)
        contaCorrente.saque(100.00)

        println(contaPoupanca.saldo)
        println(contaCorrente.saldo)

        contaCorrente.transferir(100.00, contaPoupanca)
        println(contaCorrente.saldo)
        println(contaPoupanca.saldo)

        contaPoupanca.transferir(100.00, contaCorrente)
        println(contaCorrente.saldo)
        println(contaPoupanca.saldo)
    }
}
