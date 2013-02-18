package com.lab03

myColl = new MyCollectionUtil()
//Print all even numbers
myColl.compute {i-> if(i%2 == 0)println i }
println "---------------------------------------"

//Print all numbers greater than any number "x"
int x = 35
myColl.compute {i-> if(i > x)println i }
println "---------------------------------------"

//Print the maximum of all the numbers
int largest = 0
myColl.compute {i-> if(i > largest)largest = i }
println largest
