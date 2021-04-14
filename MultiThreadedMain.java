package server_attempt;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import server_attempt.Test.MyHandler;

public class MultiThreadedMain {

    public static void main(String[] args) throws Exception {
    	MultiThreadedServer server = new MultiThreadedServer(9000);
    	new Thread(server).start();
    	System.out.println("started now.");
    	try {
    		Thread.sleep(60 * 1000);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    	System.out.println("Stopping Server");
    	server.stop();
    	
    }
}
