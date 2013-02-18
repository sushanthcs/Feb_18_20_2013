package com.lab01

game = new Game()
sc = new Scanner(System.in)
println "Enter a number between 1 and 100"

while(!game.gameOver){
	int guess = sc.nextInt()
	game.play(guess)
	println game.message		
}