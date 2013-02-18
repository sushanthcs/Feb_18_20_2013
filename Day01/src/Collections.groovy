food = [:]
food += ["Combo1":"Roti, Pulav"]
food += ["Combo2":"Naan, Mushroom"]

food.each {println it.key + ", " + it.value}

langs = [:]
langs += ["1":"Java"]
langs += [2:"C#"]
langs += ["3":"Ruby"]

langs.each {println it.key + ": " + it.value}

/*HashMap<String,String> langs = new HashMap<String,String>()
langs.put("1","Java");
langs.put("2","C#");
langs.put("3","Ruby");
*/

countries = []
countries << "India"
countries << "USA"
countries << "UK"
countries.each {println it}
println countries.class.name

/*ArrayList<String> countries = new ArrayList<String>();
countries.add("India");
countries.add("USA");
countries.add("UK");
for(int i=0;i<countries.size();i++){
	System.out.println(countries.get(i));
}
System.out.println(countries.class.name);*/