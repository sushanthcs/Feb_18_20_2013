add = {i,j->i+j}
println add(1,2)

square = {i->i*i}
println square(10)



println  "********************************************"

block = {}

code1 = {println "Post lunch"}
code1()

code2 = {
	println "Feeling sleepy"
	int i = 0
	i++
	println i
}
code2()
