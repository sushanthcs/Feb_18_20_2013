package com.lab01

class Car {
	String model
	int year
	def props = [:]
	def propertyMissing(String propName,args){
		//setting value
		if(args){
			props[propName] = args
		}
		props[propName]
	}
}
