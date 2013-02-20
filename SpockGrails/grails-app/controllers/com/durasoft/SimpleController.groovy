package com.durasoft

class SimpleController {
	AuthenticationService authenticationService
	
	def login2(){
		String userName = params.username
		String password = params.password
		
		def user = authenticationService.authenticate(userName,password)
		if(user)
			redirect(action:"index",controller:"home")
		else{
			flash.error = "Invalid credentials"
			redirect(action:"index")
		}	
	}
	
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
