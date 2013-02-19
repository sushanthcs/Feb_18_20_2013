package com.lab01

class HistoryController {
	def defaultAction = "display"
	
    def display() { 
		flash.history = session.guessingGame.history
	}
}
