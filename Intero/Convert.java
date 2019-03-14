package Intero;

import javax.swing.*;

public class Convert {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run(){
				Frame Frame = new Frame();
				Frame.setVisible(true);
			}
		});
	}
}