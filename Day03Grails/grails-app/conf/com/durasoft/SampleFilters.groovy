package com.durasoft

class SampleFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
				if(controllerName != "login"){
					if(!session.isLoggedIn)	
						redirect(controller:"login")
				}
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
