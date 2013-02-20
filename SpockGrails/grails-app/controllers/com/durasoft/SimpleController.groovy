package com.durasoft

class SimpleController {

	def login(){
		String userName = params.username
		String password = params.password
		println "--UserName: ${userName}, password: ${password}"
		if(userName == password)
			redirect(controller:"home",action:"index")
		else{
			flash.error = "Invalid credentials"
			redirect(action:"index")
		}	
	}
    def index() {
		render "hello world"
	}
}
