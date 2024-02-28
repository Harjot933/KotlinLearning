package com.harjot.practice

import android.util.Size

fun main(){
    println("Enter a Name=")

    when (readln()) {
        "helloworld", "HelloWorld", "hello world", "Hello World" -> {
            helloWorld()
        }
        "Rock Paper Scissors", "RockPaperScissors", "rock paper scissors", "rockpaperscissors" -> {
            rps()
        }



        else -> {
            println("Invalid Name")
        }
    }
}

fun helloWorld(){
    println("Hello world")
    val a = readln()
    println("a is $a")
}

fun rps(){
    var computerChoice = ""
    var playerChoice = ""
    println("Choose between Rock,Paper,Scissor=")


    playerChoice = readln()

    val randomNumber = (1..3).random()

    computerChoice = when (randomNumber) {
        1 -> {
            "Rock"
        }

        2 -> {
            "Paper"
        }

        else -> {
            "Scissors"
        }
    }
    println(computerChoice)

    var winner = ""


    winner = if (playerChoice == computerChoice) {
        "Tie"
    } else if (playerChoice == "Rock" && computerChoice == "Scissors") {
        "Player "
    } else if (playerChoice == "Paper" && computerChoice == "Rock") {
        "Player "
    } else if (playerChoice == "Scissors" && computerChoice == "Paper") {
        "Player "
    } else {
        "Computer"
    }

    if (playerChoice==computerChoice){
        println("It's a Tie")
    }else{
        println("$winner Won!")
    }
}


