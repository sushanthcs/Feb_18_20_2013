lst = [12,334,5,6,56,334,32,15,6,77]
//each,collect,find,findAll,inject

//print the sum of all squares of even numbers
println lst.findAll {it%2==0}.collect {it*it}.inject(0) {sum,item->sum+item}

println lst.findAll {it%2 != 0}
println "***************************"

println lst.collect {it+1}

println "***************************"
println lst.inject(0){sum,item->sum+item}
//sum=0,item=12
//sum=12,item=334
//sum=346,item=5
//sum=351,item6