package REST;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Main {
	//服務器路徑
	public static final String BASE_URI = "http://localhost:8080/Practices/";
	public static HttpServer startServer(){
	//加載資源
//		final ResourceConfig rc = new ResourceConfig().packages("REST");
		return new HttpServer() {
			
			@Override
			public void stop(int arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setExecutor(Executor arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeContext(HttpContext arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeContext(String arg0) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Executor getExecutor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InetSocketAddress getAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HttpContext createContext(String arg0, HttpHandler arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HttpContext createContext(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void bind(InetSocketAddress arg0, int arg1) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
