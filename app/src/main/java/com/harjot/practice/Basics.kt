package com.harjot.practice

fun main(){
    println("Enter a Name=")

    when (readln()) {
        "helloworld", "HelloWorld", "hello world", "Hello World" -> {
            println("Hello world")
            val a = readln()
            println("a is $a")
        }
        "Rock Paper Scissors", "RockPaperScissors", "rock paper scissors", "rockpaperscissors" -> {

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
        else -> {
            println("Invalid Name")
        }
    }
}