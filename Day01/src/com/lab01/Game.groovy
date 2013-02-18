package com.lab01

class Game {
	int target,attempts
	String message
	boolean gameOver
	Game(){
		target = (int)(Math.random()*100)
	}
	def play(guess){
		attempts++
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
