import spock.lang.Specification;

class GameSpec extends Specification{
	Game game

	def "game history values after game is over"(){
		when:
			game.target = 77
			game.play(50)
			game.play(75)
			game.play(77)
		then:
			game.history["1"] == 50
			game.history["2"] == 75
			game.history["3"] == 77
			game.history.containsValue(77)
	}
	
	def "game history count after game is over"(){
		when:
			game.target = 77
			game.play(50)
			game.play(75)
			game.play(77)
		then:
			3 == game.history.size()	
	}
	def "invalid guess"(){
		when:
			game.play(1212)
		then:
			thrown(InvalidGuessException)	
	}
	def "play game "(){
		given:
			game.target = 77
		expect:
			game.play(guess)
			false == game.gameOver	
		where:
			guess << [50,75,90]
	}
	
	def "play after the game is over"(){
		when:
			game.target = 77
			game.play(50)
			game.play(77)
			game.play(55)
		then:
			thrown(GameOverException)	
	}
	def "game over"(){
		when:
			game.target = 88
			game.play(88)
		then:
			game.gameOver	
	}
	
	def "attempts while playing"(){
		when:
			game.target = 77
			game.play(50)
			game.play(75)
		then:
			game.attempts == 2	
	}
	
	def "message is You have got it!!!"(){
		when:
			game.target = 77
			game.play(77)
		then:
			game.message == "You have got it!!!"
	}
	def "message is Aim Higher"(){
		when:
			game.target = 77
			game.play(50)
		then:
			game.message == "Aim Higher"
	}
	
	def "message is Aim Lower"(){
		when:
			game.target = 77
			game.play(80)
		then:
			game.message == "Aim Lower"	
	}
	def "message is blank in the beginning"(){
		expect:
			game.message == ""
	}
	def "attempts is 0 in the beginning"(){
		expect:
			game.attempts == 0
	}
	def "target is between 1 and 100"(){
		expect:
			game.target > 0 && game.target < 100
	}
	def setup(){
		game = new Game()
	}
	def cleanup(){
		game = null
	}
	def "game is not null"(){
		expect:
			game != null
	}
}
