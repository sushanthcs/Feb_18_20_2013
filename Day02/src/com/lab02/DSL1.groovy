package com.lab02
order = [:]

def Pizza(block){
	block()
	def output = """
Thanks for the order!!! Your ${order["type"]} sized Pizza (${order["quantity"]} nos) 
with ${order["toppings"]} toppings will be delivered to ${order["street"]},${order["city"]},
${order["state"]} in 45 minutes
"""
	println output
}
def type(val){
	order["type"] = val
}
def quantity(val){
	order["quantity"] = val
}
def toppings(val){
	order["toppings"] = val
}
def address(block){
	block()
}
def street(val){
	order["street"] = val
}
def city(val){
	order["city"] = val
}
def state(val){
	order["state"] = val
}

Pizza {
	type "large"
	quantity 3
	toppings "mushroom,onions"
	address {
		street "InfoPark"
		city "Kochi"
		state "Kerala"
	}
}
//Thanks for the Order!!!Your large sized Pizza(3 nos) with 
//mushroom,onion toppings will be delivered to InfoPark, Kochi, Kerala in
//45 minutes
