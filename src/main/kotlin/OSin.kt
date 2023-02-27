import model.FuncionarioAdmin

class OSin {
    fun entra(admin: FuncionarioAdmin, senha: Int){
        if (admin.autentica(senha)) {
            println("Login com sucesso")
        } else {
            println("Login ou senha incorreto")
        }
    }
}
