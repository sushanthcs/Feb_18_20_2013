package com.durasoft

class Gorm1Controller {

	def create(){
		String name = params.name
		def p1 = new Person(name:name,age:12)
		p1.personDetails = new PersonDetails(salary:132413,address:"Kochi")
		p1.addToDogs(new Dog(name:"Jimmy",breed:"Labrador"))
		p1.addToDogs(new Dog(name:"Rock",breed:"Alsatian"))
		p1.addToCars(new Car(model:"Santro",year:2012))
		p1.addToCars(new Car(model:"City",year:2013))
		p1.save(failOnError:true)
		render "Person with id ${p1.id} created"
	}
	def index() { 
		render "GORM"
	}
}
