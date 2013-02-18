package com.lab02

class Rectangle {
	int length,breadth
	def area(){
		length  * breadth
	}
	String toString(){
		"Area of rectangle with length ${length} and breadth ${breadth} is ${area()}"
	}
}
