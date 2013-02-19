package com.durasoft

class SampleController {
	def login(){
		String userName = params.username
		String password = params["password"]
		if(userName != password){
			flash.msg = "Invalid credentials" 
			redirect(action:"index")
		}
		else{
			session.username = userName
			redirect(controller:"home",action:"index")
		}	
	}
	def somethingelse(){
		render "SampleController somethingelse called"
	}
	def something(){
		println "SampleController something called"
	}
    def index() {
		println "SampleController index called"
	}
}
