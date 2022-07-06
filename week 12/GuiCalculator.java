//Step 1: import packages;
	import javax.swing.*; 
	import java.awt.*; 
	
	public class GuiCalculator {
		JFrame fCalc; 
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
		JButton bPlus, bMinus, bMul, bPoint, bEqual, bClear;
		JPanel panel;
		JTextField tfAnswer; 
		JLabel lMyCalc; 
		
		public void initGUI ( ) { 
			//Step 2: setup the top level container 
			fCalc = new JFrame();
			
			//Step 3: Get the component area of top-level container 
			 Container con = fCalc.getContentPane(); 
			 
			//Step 4: Apply layouts
			 con.setLayout(new BorderLayout());
			 
			//Step 5: create & add components 
			 b0 = new JButton("0"); 
			 b1 = new JButton("1"); 
			 b2 = new JButton("2"); 
			 b3 = new JButton("3"); 
			 b4 = new JButton("4"); 
			 b5 = new JButton("5"); 
			 b6 = new JButton("6"); 
			 b7 = new JButton("7"); 
			 b8 = new JButton("8"); 
			 b9 = new JButton("9");
			 bPlus = new JButton("+"); 
			 bMinus = new JButton("-"); 
			 bMul = new JButton("*"); 
			 bPoint = new JButton("."); 
			 bEqual = new JButton("="); 
			 bClear = new JButton("C"); 
			 //-----------------------------
			 tfAnswer = new JTextField();
			 lMyCalc = new JLabel("My Clacualator");
			 panel =  new JPanel (new GridLayout(4,4));
			 //--------------------------------------
			 panel.add(b1); 
			 panel.add(b2); 
			 panel.add(b3); 
			 panel.add(bClear); 
			 panel.add(b4); 
			 panel.add(b5); 
			 panel.add(b6); 
			 panel.add(bMul); 
			 panel.add(b7); 
			 panel.add(b8); 
			 panel.add(b9); 
			 panel.add(bMinus); 
			 panel.add(b0); 
			 panel.add(bPoint); 
			 panel.add(bPlus); 
			 panel.add(bEqual); 
			 //_________________________________
			 con.add(tfAnswer, BorderLayout.NORTH);
			 con.add(lMyCalc, BorderLayout.SOUTH);
			 con.add(panel, BorderLayout.CENTER);
			//Step 6: set size of frame and make it visible 
			 fCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 fCalc.setSize(300, 300); 
			 fCalc.setVisible(true); 
		}
	//*********************************************************
}
