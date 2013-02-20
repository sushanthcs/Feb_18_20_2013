class Game {
	int target 
	int attempts
	String message
	boolean gameOver
	def history = [:]
	GameStore gameStore
	
	Game(){
		target = (int)(Math.random()*100) 
		message = ""
	}
	def storeResults(name){
		gameStore.store(name, attempts)	
	}
	def play(guess){
		check(guess)
		attempts++
		history["${attempts}"] = guess
		if(guess > target)
			message = "Aim Lower"
		else if(guess < target)
			message = "Aim Higher"
		else{
			message = "You have got it!!!"
			gameOver = true
		}	
	}

	def check(guess) {
		if(guess > 100 || guess < 0)
			throw new InvalidGuessException()
		if(gameOver)
			throw new GameOverException()
	}
}
