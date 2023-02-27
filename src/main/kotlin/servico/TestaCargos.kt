package servico

import model.*

class TestaCargos {

    fun testaFun() {
        val alex = Gerente("Aléx", "123456789", 500.00, 4321)
        val amanda = Gerente(nome = "Amanda", cpf = "1234567489", salario = 600.00, senha = 1234)
        val gui = Diretor("Guilherme", "123456789", 700.00, senha = 1234, plr = 100.00)
        println("Nome ${alex.nome}")
        println("Bonificação ${alex.bonificacao}")
        println("Status de login ${amanda.nome} é de ${amanda.autentica(1234)}")
        println("A bonificação de ${amanda.nome} é de ${amanda.bonificacao}")

        val calculadora = CalculoDeBonificação()

        calculadora.registra(alex)
        calculadora.registra(amanda)
        calculadora.registra(gui)

        println("O total de bonificação é de ${calculadora.total}")
    }
}
