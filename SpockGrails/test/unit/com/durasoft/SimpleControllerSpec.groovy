package com.durasoft

import grails.test.mixin.TestFor
import spock.lang.Specification


@TestFor(SimpleController)
class SimpleControllerSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}
	
	def "invalid login"() {
		when:
			params.username = "admin"
			params.password = "dfgffadmin"
			controller.login()
		then:
			flash.error == "Invalid credentials"
			response.redirectedUrl == "/simple/index"
	}
	
	def "valid login"() {
		when:
			params.username = "admin"
			params.password = "admin"
			controller.login()
		then:
			response.redirectedUrl == "/home/index"	
	}

	void "test Index"() {
		when:
			controller.index()
		then:
			response.text == "hello world"	
	}
}