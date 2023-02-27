import model.Diretor
import model.Gerente
import servico.TestaContasDiferentes


fun main() {

    println("############################")
    println("###Bem vindo ao Byte-Bank###")
    println("############################")

    val teste = TestaContasDiferentes().testaContas()
    println(teste)

    val gerente = Gerente("Thiago","123.456.789.89",1000.00,123456)
    val diretor = Diretor("Luis","123.456.789-99",2000.00,123456,5000.00)

    val sistema = OSin()
    sistema.entra(gerente,123456)
    sistema.entra(diretor,12346)

}
