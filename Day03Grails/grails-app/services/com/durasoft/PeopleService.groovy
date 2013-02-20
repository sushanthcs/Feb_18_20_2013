package com.durasoft

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//Singleton
class PeopleService {
	static transactional = true
	static scope = "request"//session,request,singleton,prototype,globalSession
	
	@Transactional(propagation=Propagation.REQUIRED)
	def createAccount() {
		def acc = new Account(accountNumber:1212,balance:1000)
		acc.save()
		throw new PeopleException()
		acc.id
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	def createPerson(name,age) {
		def p = new Person(name:name,age:age)
		p.personDetails = new PersonDetails(salary:20000,address:"Munnar")
		p.save()
		//throw new Exception()
		throw new PeopleException()
		p.id
    }
}
