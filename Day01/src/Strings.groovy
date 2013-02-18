c2 = null

c2?.drive()//safe-navigation operator
	
/*if(c2 == null)
	println "Car is not initialized"
else
	c2.drive()*/
	
println "***************************************"		
c1 = new Car(model:"Micra")
c1.drive()
c1."drive"()

fn = "drive"
c1."${fn}"()

	/*if(fn == "drive")
		c1.drive();*/

str1 = "Sample String"
println str1.class.name

str2 = "This is ${str1}"
println str2.class.name

str3 = "Ruby on Rails"
println str3[0..2]
println str3[-1..-3]
println str3[-3..-1]

if(str3 == "Ruby on Rails")
	println "Equal"