package com.durasoft

class Person {
	String name
	int age
    static hasMany = [dogs:Dog,cars:Car]
	
	static constraints = {
		name nullable:false,maxLength:20,minLength:2
		age nullable:false
    }
	static mapping = {
		table "persons"
		name column:"person_name"	
		age column:"person_age"
		version false
	}	
}
