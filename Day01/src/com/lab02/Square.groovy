package com.lab02

class Square {
	int side
	def area(){
		side * side
	}
	String toString(){
		"Area of square with side ${side} is ${area()}"
	}
}
