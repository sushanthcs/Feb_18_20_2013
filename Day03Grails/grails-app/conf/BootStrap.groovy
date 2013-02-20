import grails.util.Environment;
import grails.util.GrailsUtil;

class BootStrap {

    def init = { servletContext ->
		switch(Environment.current){
			case "development" :
			break
			case "test" :
			
			break
			case "production":
			break
		}
    }
    def destroy = {
    }
}
