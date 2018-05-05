package main;


import controller.Controller;
import controller.QRCodeManager;

//HELLO
public class Main {

	public static void main(String[] args) {
		System.out.println("Server: starting...");
		Controller controller = Controller.getInstance();
		controller.init();
		
		QRCodeManager.testQR();
	}
}
