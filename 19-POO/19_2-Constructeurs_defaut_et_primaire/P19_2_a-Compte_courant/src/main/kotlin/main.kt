class BankAccount(depositedv: Long, withdrawn: Long) {
    val deposited: Long = depositedv
    val withdrawn: Long = withdrawn
    val balance: Long = deposited - withdrawn
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}