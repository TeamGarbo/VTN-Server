package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import message.Message;
import server.Server;
import ui.MainView;


public class Controller {
	
	Server server;
	String IP;
	MainView mainView;
	
	private Controller() {
		System.out.println("Controller: ready!");
		mainView = new MainView();
	}
	
	public void init() {
		initServer();
		initIP();
	}
	
	private static Controller instance;
	
	public static Controller getInstance() {
		if(instance == null) {
			instance = new Controller();
		}
		return instance;
	}	

	public void initServer() {
		new Thread()
        {
            public void run() {
            	Controller.getInstance().setServer(new Server());
            }
        }.start();
	}
	
	public void initIP() {
		
		new Thread()
        {
            public void run() {
        		try {
        			URL whatismyip = new URL("http://checkip.amazonaws.com");
        			BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
        			
        			String ip = in.readLine(); //you get the IP as a String
        			System.out.println(ip);
        			IP = ip;
        			QRCodeManager.createIPQR(ip, 250, 250);
        			mainView.initView();
        		}catch(Exception e) {
        			System.err.println(e.getMessage());;
        		}
            }
        }.start();
	}
	
	public void setServer(Server server) {
		this.server = server;
	}

	///TODO: add player registration (name)
	public void processMessage(Message message) {
		//use instance of etc 
		System.out.println("Received Message!");
	}
	
	public Server getServer() {
		return this.server;
	}
	
	public String getIP() {
		return this.IP;
	}
}
