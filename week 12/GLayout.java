//Step 1: import packages;
	import javax.swing.*; 
	import java.awt.*; 
	public class GLayout {

		JFrame myFrame ; 
		JButton b1, b2, b3, b4, b5, b6;
	
		public void initGUI ( ) { 
		//Step 2: setup the top level container 
		myFrame = new JFrame();
		
		//Step 3: Get the component area of top-level container 
		Container c = myFrame.getContentPane(); 
		
		//Step 4: Apply layouts
			c.setLayout( new GridLayout( 3 , 2 ) );
		//c.setLayout( new GridLayout( 3 , 2 , 10 , 20) );
		
		//Step 5: create & add components 
		 b1 = new JButton("Next Slide");
		 b2 = new JButton("Previous Slide"); 
		 b3 = new JButton("Back to Start"); 
		 b4 = new JButton("Last Slide"); 
		 b5 = new JButton("Exit"); 
		 b6 = new JButton("Ahmad"); 
		 
		 c.add(b1); 
		 c.add(b2); 
		 c.add(b3); 
		 c.add(b4); 
		 c.add(b5);
		 c.add(b6);
		 
		 
		 //Step 6: set size of frame and make it visible 
		 myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 myFrame.setSize(300,150); 
		 myFrame.setVisible(true); 
		 }
	//**************************************
	
}
