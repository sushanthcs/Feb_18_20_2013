package com.lab02

class Circle {
	int radius
	def area(){
		3.14 * radius * radius
	}
	String toString(){
		"Area of circle with radius ${radius} is ${area()}"
	}
}
