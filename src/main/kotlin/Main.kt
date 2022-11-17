import model.Conta

fun main(args: Array<String>) {

    println("############################")
    println("###Bem vindo ao Byte-Bank###")
    println("############################")

    val contaThiago = Conta("Thiago", 1010)
    contaThiago.deposito(100.00)

    val contaLeticia = Conta("Leticia", 1111)
    contaLeticia.deposito(100.00)


    println("Titular da conta: ${contaThiago.titular}")
    println("Número de conta: ${contaThiago.numeroConta}")
    println("Saldo conta: ${contaThiago.statusSaldo()}")

    contaThiago.deposito(500.00)
    contaThiago.statusSaldo()
    //contaThiago.saque(600.00)
    contaThiago.transferir(600.00, contaLeticia)
    contaLeticia.statusSaldo()
    contaThiago.statusSaldo()

    println("#############################")

}
