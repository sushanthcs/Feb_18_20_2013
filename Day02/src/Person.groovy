class Person {
	String name
	int age
	def propertyMissing(String propName,args){
		println "*************"
		println "Property ${propName} is not found"
		println args
		println "**************"
	}
	def methodMissing(String methodName,args){
		println "Method ${methodName} not found"
	}
	
}
