package com.lab01

class GuessingGame {
	int target,attempts
	String message
	boolean gameOver
	def history = [:]
	
	GuessingGame(){
		target = (int)(Math.random()*100)
	}
	def play(guess){
		attempts++
		history += ["${attempts}":guess]
		if(guess > target)
			message = "Aim Lower"
		else if(guess < target)
			message = "Aim Higher"
		else {
			message = "You have got it in ${attempts} attempts"
			gameOver = true
		}		
	}
}