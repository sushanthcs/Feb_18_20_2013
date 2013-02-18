def code = {println "Hello World"}

def doSomething(block){
	block()
}

doSomething(code)
doSomething({println "Scratching my head"})
doSomething {println "Thoroughly confused"}

5.times {println "Hello World"}
5.times {doSomething {println "cool"}}