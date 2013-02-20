package com.durasoft

class Dog {
	String name
	String breed
	
    static constraints = {
    }
	static mapping = {
		table "dogs"
		version false
	}
}
