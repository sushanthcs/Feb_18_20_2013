package com.durasoft

class PersonDetails {
	String address
	double salary
	static belongsTo = [person:Person]
	 
    static constraints = {
    }
	static mapping = {
		table "person_details"
		version false
	}
}
