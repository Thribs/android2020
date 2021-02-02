package digitalhouse.com.br.aula8

class Check(val amount: Double, val bank: String, val dueDate: Date, val beneficiary: Client) {
    init {
        println("Cheque para depósito:\nValor: RS$$amount; Banco emissor: $bank; Beneficiário: ${beneficiary.surname}; Vencimento: ${dueDate.day}/${dueDate.month}/${dueDate.year}")
    }
}