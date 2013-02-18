package com.lab04

languages = ["Hindi","English","Tamil","Malayalam","Telugu"]

//Print the last letter of all the languages
println languages.collect {it[-1]}

//Print all the languages that begin with T
println languages.findAll {it[0] == "T"}

//Print all the languages whose length > 5 in lowercase
println languages.findAll {it.length() > 5} .collect {it.toLowerCase()}

//Print all the languages in comma separated format
println languages.join(",")
println languages.inject("") {csv,item->"${csv},${item}"}[1..-1]



