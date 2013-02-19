package com.lab01

class GameController {

	def play(){
		int guess = -1
		try{
			guess = params.guess.toInteger()
		}
		catch(ex){
			flash.error = "Invalid input"
			redirect(action:"index")
			return
		}
		def guessingGame = session.guessingGame
		if(!guessingGame){
			guessingGame = new GuessingGame()
			session.guessingGame = guessingGame
		}
		guessingGame.play(guess)
		flash.message = guessingGame.message
		flash.attempts = "Attempts: ${guessingGame.attempts}"
		flash.gameOver = guessingGame.gameOver
		redirect(action:"index")
	}
    def index() {
		
	}
}
