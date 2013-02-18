package com.lab02

shapes = []
sc = new Scanner(System.in)
input = ""
while(input != "q"){
	try{
		switch (input){
			case "s":
				println "Enter the side of the square"
				side = sc.nextInt()
				shapes << new Square(side:side)
				break
			case "c":
				println "Enter the radius of the circle"
				radius = sc.nextInt()
				shapes << new Circle(radius:radius)
				break
			case "r":
				println "Enter the length and breadth of the rectangle(l,b)"
				lenAndBre = sc.next()
				length = lenAndBre.split(",")[0].toInteger()
				breadth = lenAndBre.split(",")[1].toInteger()
				shapes << new Rectangle(length:length,breadth:breadth)
				break
			case "d":
				shapes.each {println it}
				break
			default :
				break
		}
	}
	catch(ex){
		println "Invalid input: ${ex.message}"
	}
	println "Please enter 's' for square, 'c' for circle, 'r' for rectangle, 'd' to display the area and 'q' to quit."
	input = sc.next()

}