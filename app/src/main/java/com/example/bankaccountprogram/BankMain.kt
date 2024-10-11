package com.example.bankaccountprogram

fun main(){
    val nithisBank=BankAccount("Nithis",1000.0)
    println("Account holder : ${nithisBank.accountHolder}")
    nithisBank.deposit(200.20)
    nithisBank.withdraw(50.50)
    nithisBank.deposit(2000.99)

    val sarah=BankAccount("Sarah",0.0)
    sarah.deposit(1000.0)
    sarah.withdraw(10.0)
    sarah.deposit(300.0)

    sarah.displayTransaction()
    println("Account balance: ${sarah.acctBalance()}")


}