package com.example.bankaccountprogram

class BankAccount(var accountHolder: String,
                  var balance: Double) {

    private val transactionHistory= mutableListOf<String>()

    fun deposit(amount: Double) {
        balance+=amount
        transactionHistory.add("$accountHolder deposited $amount tp their account")

    }
    fun withdraw(amount: Double) {
        if (balance>=amount){
            //yes
            balance-=amount
            transactionHistory.add("$accountHolder withdrew $amount from their account")


        }else{
            println("you cannot withdraw money")
        }

    }
    fun displayTransaction(){
        println("Transaction history for $accountHolder:")
        for (transaction in transactionHistory){
            println(transaction)
        }

    }
    fun acctBalance():Double{
        return balance

    }
}