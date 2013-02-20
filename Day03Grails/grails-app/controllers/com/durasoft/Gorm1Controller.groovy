package com.durasoft

class Gorm1Controller {
	PeopleService peopleService
	
	def loggingex(){
		log.info("Logging example")
	}
	
	static defaultAction = "save"
	def sthg(){
		render "Controller: ${this}"
		render "PeopleService: ${peopleService}"
	}
	def sthg2(){
		render "Controller: ${this}"
		render "PeopleService: ${peopleService}"
	}
	def saveaccount(){
		
		def accountID = peopleService.createAccount()
		render "Person with ${accountID} is created"
	}
	def save(){
		String name = params.name
		int age = params.age.toInteger()
		def personId = peopleService.createPerson(name, age)
		render "Person with ${personId} is created"	
	}
	
	def criteria(){
		
		def cr = Person.createCriteria()
		def persons = cr.list{
							projections {
								property("name")
								property("age")
							}
							personDetails {
								gt("salary", 5000d)
							}
							cars {
								eq("year", 2013)
							}
							order("age")
					  }
		if(persons?.size() > 0){
			persons.each { render it}
		}
		
		/*def cr = Person.createCriteria()
		def persons = cr.list{
							projections {
								property("name")
							}
							sizeGt("dogs", 0)
							dogs {
								eq("name", "Jimmy")
						}
					  }
		if(persons){
			persons.each {render it}
		}*/
	}
	def finder(){
		/*Person p = Person.get(1)
		Dog d = p.dogs.first()
		p.dogs.remove(d)
		p.save()
		render "Size of dogs ${p.dogs.size()}"*/
		
	/*	Dog d = Dog.get(2)
		render "${d?.name}"
		d?.delete()
		render "Dog 1 deleted"*/
		
		/*def persons =
			Person.findAll("from Person p where p.dogs.size >= 1")
		
		if(persons?.size() > 0){
			persons.each {render it.name + ", " + it.personDetails.salary}
		}*/
		
		/*def persons =  
			Person.findAll("from Person p where p.personDetails.salary > 10000")
			
		if(persons?.size() > 0){
			persons.each {render it.name + ", " + it.personDetails.salary}
		}*/	
/*		def dog = Dog.findByBreed("Labrador")
		render "${dog?.name}"*/

/*		def dog = Dog.findByNameAndBreed("Jimmy","Labrador")
		render "${dog?.id}"*/
		
/*		def persons = Person.findAllWhere([name:"Ram",age:35])
		if(persons?.size() > 0){
			persons.each {render it.name }
		}*/
		
	}
	
	def create(){
		String name = params.name
		def p1 = new Person(name:name,age:55)
		p1.personDetails = new PersonDetails(salary:10000,address:"Mumbai")
		p1.addToDogs(new Dog(name:"Jimmy",breed:"Labrador"))
		p1.addToDogs(new Dog(name:"Lara",breed:"German Sheperd"))
		p1.addToCars(new Car(model:"Santro",year:2012))
		p1.addToCars(new Car(model:"Merc",year:2010))
		p1.save(failOnError:true)
		render "Person with id ${p1.id} created"
	}
	def index() { 
		render "GORM"
	}
}
