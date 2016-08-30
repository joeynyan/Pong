// file: EmptyFrame.java
	// Adapted from Core Java, vol.1, by Horstmann & Cornell
	
	import javax.swing.*;
	
	class jFrameTest extends JFrame {
	  public jFrameTest() {
		setTitle("My Empty Frame");
		setSize(300,200); // default size is 0,0
		setLocation(10,200); // default is 0,0 (top left corner)
	  }
	
	  public static void main(String[] args) {
	    JFrame f = new jFrameTest();
	    f.setVisible(true);
	  }
	}