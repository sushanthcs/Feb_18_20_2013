String.metaClass.static.add = {val1,val2->
	"${val1} ${val2}"
}
println String.add("ruby","groovy")

String.metaClass.add = {val->
	"${delegate} ${val}"
}
ArrayList.metaClass.largest = {
	int large = 0
	delegate.each {if(it > large) large = it}
	large
}
Integer.metaClass.daysFromNow = {
	new Date() + delegate
}
println([1,2,3,4,5].largest())
println("java".add(" is").add(" cool"))
println 5.daysFromNow()

String.metaClass.lower = {
	delegate.toLowerCase()
}
Integer.metaClass.inc = {
	++delegate
}

str = "Java"
println str.lower()

println 5.inc()