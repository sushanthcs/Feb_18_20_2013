class Person {
	String name
	int age
	def gender,address
	
	def eat(){
		 name + " is eating";
	}
	def work(hours){
		//name + " works " + hours + " hours a day"
		"${name} works ${hours} hours a day"
	}
}
