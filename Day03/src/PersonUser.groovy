Person.metaClass.invokeMethod = {methodName,args->
	def metaMethod = Person.metaClass.getMetaMethod(methodName, args)
	if(metaMethod)
		metaMethod.invoke(delegate, args)
	else	
		println "${methodName} is not available"	
}
Person.metaClass.static.invokeMethod = {methodName,args->
	
	println "${methodName} invoked"
}

p1 = new Person(name:"sam",age:12)
p1.save()
p1.eat()

p2 = new Person(name:"ram",age:32)
p2.save()
p2.eat()

Person.findByName("sam")
Person.findByNameAndAge("sam",12)
