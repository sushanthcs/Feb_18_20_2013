package com.durasoft

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(AuthenticationService)
@Mock(SpockUser)
class AuthenticationServiceSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "test valid authentication"() {
		setup:
			def spockUser1 = new SpockUser(userName:"admin",password:"admin",role:"Customer")
			mockDomain(SpockUser,[spockUser1])
		expect:
			service.authenticate("admin","admin") != null
			service.authenticate("admin","admin").role == "Customer"
	}
}
