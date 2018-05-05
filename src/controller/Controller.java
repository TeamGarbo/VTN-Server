package controller;

import message.Message;
import server.Server;


public class Controller {
	
	Server server;
	private Controller() {
		initServer();
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
	
	public void setServer(Server server) {
		this.server = server;
	}

	///TODO: add player registration (name)
	public void processMessage(Message message) {
		//use instace of etc 
	}
	
	public Server getServer() {
		return this.server;
	}
}
