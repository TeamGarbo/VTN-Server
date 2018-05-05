package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainView() {
		this.setTitle("MapApp - CityStats");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setSize(1920/2, 1080/2);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.repaint();
	}
	
	public void initView() {
		//Add QR code here
	}
}
