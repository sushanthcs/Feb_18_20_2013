package com.durasoft

class Gorm1Controller {

	def list(){
		Person.all.each {render it.name + "<br/>"}
	}
	//gorm1/load/10
	def load(int id){
		def p1 = Person.get(id)
		render "Person: ${p1?.name} ${p1?.age}"
	}
    def index() {
		Person p1 = new Person(name:params.name,age:params.age.toInteger())
		p1.save(failOnError:true)
		render "Person with id ${p1.id} created"
	}
}
