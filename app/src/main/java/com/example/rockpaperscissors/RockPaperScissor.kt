package com.example.rockpaperscissors

fun main(){
    var computerchoice=""
    var playerchoice=""
    println("Rock Paper Scissors? Enter your choice:")
    playerchoice=readln()
    val random=(1..3).random()
    if(random==1){
        computerchoice="rock"
    }else if(random==2){
        computerchoice="paper"
    }else{
        computerchoice="scissors"
    }
    if(playerchoice==computerchoice){
        println("draw")
    }else if(playerchoice=="rock"&&computerchoice=="scissors"){
        println("you win")
    }else if(playerchoice=="rock"&&computerchoice=="paper"){
        println("you lose")
    }else if(playerchoice=="paper"&&computerchoice=="rock"){
        println("you win")
    }else if(playerchoice=="paper"&&computerchoice=="scissors"){
        println("you lose")
    }else if(playerchoice=="scissors"&&computerchoice=="paper"){
        println("you win")
    }else{
        println("you lose")
    }
}