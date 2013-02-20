package com.durasoft

class AuthenticationService {

    def authenticate(userName,password) {
		SpockUser.findByUserNameAndPassword(userName,password)
    }
}
