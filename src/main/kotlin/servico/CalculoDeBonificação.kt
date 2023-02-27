package servico

import model.Funcionario

class CalculoDeBonificação {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

}
