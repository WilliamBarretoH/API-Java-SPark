package backend;

import static spark.Spark.*;

import javax.servlet.http.HttpServletRequest;

import spark.staticfiles.StaticFiles;


public class ServerMain {
	
	final static Model model = new Model();
	
	public static void main(String[] args) {
		
		ProcessBuilder process = new ProcessBuilder();
		Integer port;
		if(process.environment().get("port") != null) {
			port = Integer.parseInt(process.environment().get("port"));
		} else { 
			port = 8080; 
		};
		port(port);
		
		staticFileLocation("frontEnd");
				
		Controller controller = new Controller(model);
		
		controller.buscarAtomo();
		
	}
	
	

}
