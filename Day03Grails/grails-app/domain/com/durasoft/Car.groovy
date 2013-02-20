package com.durasoft

class Car {
	String model
	int year
	static belongsTo = [person:Person]
    static constraints = {
    }
	static mapping = {
		table "cars"
		version false
	}
}
