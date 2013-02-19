String.metaClass.add = {String... args ->
	args.inject(delegate) {result,item->"${result}${item}"}
}

println "java".add(" is"," cool")
println "Groovy ".add(" is ","agile ","and ","dynamic")


