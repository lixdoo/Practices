package REST;

import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class Main {
	//服務器路徑
	public static final String BASE_URI = "http://localhost:8080/Practices/";
	public static HttpServer startServer(){
	//加載資源
		final ResourceConfig rc = new ResourceConfig().packages("REST");
		
	}
}
