package SortingAlgorithms;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Window (int width, int height, String title) {
		
		JFrame f = new JFrame(title);
		f.setPreferredSize(new Dimension(width, height));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
	
	
}
