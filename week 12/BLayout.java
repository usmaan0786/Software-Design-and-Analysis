//Step 1: import packages 
	import java.awt.*; 
	import javax.swing.*; 
	
	public class BLayout {
		JFrame myFrame ;   
		JButton b1, b2, b3, b4, b5;
		
		public void initGUI ( ) { 
			//Step 2: setup the top level container 
			myFrame = new JFrame();
			
			//Step 3: Get the component area of top-level container 
			Container c = myFrame.getContentPane(); 
			//Step 4: Apply layouts      
			 c.setLayout( new BorderLayout() );
			 
			 //Step 5: create & add components     
			    b1 =  new JButton("Next Slide");      
			    b2 =  new JButton("Previous Slide");      
			    b3 =  new JButton("Back to Start");      
			    b4 =  new JButton("Last Slide");      
			    b5 =  new JButton("Exit"); 
			    c.add(b1, BorderLayout.NORTH);      
			    c.add(b2, BorderLayout.SOUTH);      
			    //c.add(b3, BorderLayout.EAST);      
			    //c.add(b4, BorderLayout.WEST);      
			    c.add(b5, BorderLayout.CENTER);

			 //Step 6: set size of frame and make it visible 
			    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
			    myFrame.setSize(300,150);     
			    myFrame.setVisible(true); 
		}
	//**********************************************************************
}
