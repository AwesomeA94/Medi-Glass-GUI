import java.util.*;

import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JFrame;

public class Med_GUI_Maker extends JFrame {
	
	SubjectFiles sub;
	//Creating 2 panels which are lenses of the glasses
	public static JPanel Modes;
	public static JPanel Lens2;
	
	
	//Creates Textfields that shows the user information about the patient in front of him/her
	public static JTextField Name;
	public static JTextField Time;
	public static JTextField Temp;
	public static JTextField Condition;
	public static JTextField XraySynop;
	public static JTextField MedSynop;
	public static JTextField Info;
	public static JTextField Info2;
	public static JTextField Suggestion;
	public static JTextField Day;
	
	
	//Create Buttons
	public static JButton Normal;
	public static JButton Medical;
	public static JButton XRay;
	public static JButton On;
	public static JButton Off;
	
	//Create function to make the GUI
	public Med_GUI_Maker()
	{
		StartingGlasses();
	}
	
	//This is actually making the GUI
	private void StartingGlasses()
	{
		//Creates the whole window where we can show the lenses and the buttons
		Container Contents=getContentPane();
		Contents.setLayout( null );
		
		//first lense, making the size, the color of it when it is not in use
		Modes=new JPanel();
	    Modes.setBounds(100,20,350,300);
	    Modes.setBorder(null);
	    Modes.setLayout(null);
	    Modes.setBackground(Color.GRAY);
	    Contents.add(Modes);
	    
	    //Same thing as the first lense, reason I made two lenses was so it gives a more realistic feeling
	    Lens2=new JPanel();
	    Lens2.setBounds(500,20,350,300);
	    Lens2.setBorder(null);
	    Lens2.setLayout(null);
	    Lens2.setBackground(Color.GRAY);
	    Contents.add(Lens2);
	    
	    //now from here on out it is all text fields and buttons, so...be ready
	    
	    //Name label of the patient which will be on the left Lense (Mode)
	    Name=new JTextField();
	    Name.setBounds(0,0,125,20);
	    Name.setVisible(false);
		Name.setEditable(false);
		Name.setBorder(new LineBorder(new Color(0,150,200)));
		Name.setText("Jack");
		Name.setBackground(new Color(0,150,200));
	    Name.setHorizontalAlignment(JTextField.LEFT );
	    Name.setForeground(new Color(255,230,0));
	    Modes.add(Name);
	    
	    //Day label on the left lense as well, only used when glasses is turned on or goes to Normal mode
	    Day=new JTextField();
	    Day.setBounds(0,0,125,20);
	    Day.setVisible(false);
	    Day.setEditable(false);
	    Day.setBorder(new LineBorder(new Color(50,50,150)));
	    Day.setBackground(new Color(50,50,150));
	    Day.setHorizontalAlignment(JTextField.LEFT );
	    Day.setForeground(new Color(200,250,200));
	    Modes.add(Day);
	    
	    //Info and Info 2 are basically for the doctor to see what information the patient has, will be explained later down
	    //Info goes on the left lense and Info2 goes on the right lense
	    Info=new JTextField();
	    Info.setBounds(0,20,200,20);
	    Info.setVisible(false);
	    Info.setEditable(false);
	    Info.setBorder(new LineBorder(new Color(0,150,200)));
	    Info.setBackground(new Color(0,150,200));
	    Info.setHorizontalAlignment(JTextField.LEFT );
	    Info.setForeground(new Color(255,230,0));
	    Modes.add(Info);
	    
	    Info2=new JTextField();
	    Info2.setBounds(150,20,200,20);
	    Info2.setVisible(false);
	    Info2.setEditable(false);
	    Info2.setBorder(new LineBorder(new Color(0,150,200)));
	    Info2.setBackground(new Color(0,150,200));
	    Info2.setHorizontalAlignment(JTextField.RIGHT );
	    Info2.setForeground(new Color(255,230,0));
	    Lens2.add(Info2);
	    
	    //A label created to tell the time
	    Time=new JTextField();
	    Time.setBounds(225,0,125,20);
	    Time.setVisible(false);
	    Time.setEditable(false);
	    Time.setBorder(new LineBorder(new Color(50,50,150)));
	    Time.setText("Time");
	    Time.setBackground(new Color(50,50,150));
	    Time.setHorizontalAlignment(JTextField.RIGHT );
	    Time.setForeground(new Color(200,250,200));
	    Lens2.add(Time);
	    
	    //XRaySynops is basically what the XRay sees in the patient
	    XraySynop=new JTextField();
	    XraySynop.setBounds(225,0,125,20);
	    XraySynop.setVisible(false);
	    XraySynop.setEditable(false);
	    XraySynop.setBorder(new LineBorder(Color.BLACK));
	    XraySynop.setBackground(Color.BLACK);
	    XraySynop.setHorizontalAlignment(JTextField.RIGHT );
	    XraySynop.setForeground(new Color(250,250,250));
	    Lens2.add(XraySynop);
	    
	    //This follows the XRaySynops, suggesting what the doctor should do
	    Suggestion=new JTextField();
	    Suggestion.setBounds(150,20,200,40);
	    Suggestion.setVisible(false);
	    Suggestion.setEditable(false);
	    Suggestion.setBorder(new LineBorder(Color.BLACK));
	    Suggestion.setBackground(Color.BLACK);
	    Suggestion.setHorizontalAlignment(JTextField.RIGHT );
	    Suggestion.setForeground(new Color(250,250,250));
	    Lens2.add(Suggestion);
	    
	    //This is just for fun, telling the temperature of the weather in normal mode, similar to a menu
	    Temp=new JTextField();
	    Temp.setBounds(225,30,125,20);
	    Temp.setVisible(false);
	    Temp.setEditable(false);
	    Temp.setBorder(new LineBorder(new Color(50,50,150)));
	    Temp.setText("72 F");
	    Temp.setBackground(new Color(50,50,150));
	    Temp.setHorizontalAlignment(JTextField.RIGHT );
	    Temp.setForeground(new Color(200,250,200));
	    Lens2.add(Temp);
	    
	    //This tells the condition of the patient (Heart Rate, etc) But for demo use it will only show heart rate.
	    //because this is a 'prototype'
	    Condition=new JTextField();
	    Condition.setBounds(225,0,125,20);
	    Condition.setVisible(false);
	    Condition.setEditable(false);
	    Condition.setBorder(new LineBorder(new Color(0,150,200)));
	    Condition.setBackground(new Color(0,150,200));
	    Condition.setHorizontalAlignment(JTextField.CENTER );
	    Condition.setForeground(new Color(255,230,0));
	    Lens2.add(Condition);
	    
	    
	    //Here are the buttons, what font they will be, color of the font, size, etc.
	    Medical=new JButton();
	    Medical.setBounds(0,50,95,24);
	    Medical.setText("Medical");
	    Font font=new Font("Comic Sans MS", Font.BOLD,12);
	    Medical.setEnabled(false);
	    Medical.setFont(font);
	    add(Medical);
	    Medical.addActionListener( //each button calls an Action Listener which describes what the button will do
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	    				MedicalAction( pressed );
	                }
	    		});
	    
	    Normal=new JButton();
	    Normal.setBounds(0,110,95,24);
	    Normal.setText("Normal");
	    font=new Font("Comic Sans MS", Font.BOLD,12);
	    Normal.setEnabled(false);
	    Normal.setFont(font);
	    add(Normal);
	    Normal.addActionListener( 
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	    				NormalAction( pressed );
	                }
	    		});
	    
	    XRay=new JButton();
	    XRay.setBounds(0,80,95,24);
	    XRay.setText("X-Ray");
	    font=new Font("Comic Sans MS", Font.BOLD,12);
	    XRay.setEnabled(false);
	    XRay.setFont(font);
	    add(XRay);
	    XRay.addActionListener( 
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	    				XRayAction( pressed );
	                }
	    		});
	    
	    On=new JButton();
	    On.setBounds(0,200,60,24);
	    On.setText("On");
	    font=new Font("Comic Sans MS", Font.BOLD,12);
	    On.setEnabled(true);
	    On.setFont(font);
	    add(On);
	    On.addActionListener( 
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	    				OnAction( pressed );
	                }
	    		});
	    
	    Off=new JButton();
	    Off.setBounds(0,230,60,24);
	    Off.setText("Off");
	    font=new Font("Comic Sans MS", Font.BOLD,12);
	    Off.setEnabled(false);
	    Off.setFont(font);
	    add(Off);
	    Off.addActionListener( 
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	    				OffAction( pressed );
	                }
	    		});
	    
	    setSize( 900, 370 );     // set window size
		setVisible( true );      // display window
		setTitle("Medi-Glasses");
	}
	
	//What occurs when a button is pressed on Normal,XRay, and Medical
	private void NormalAction( ActionEvent event )  
	   {                                       
		 Normal.setEnabled(false);   //disables Normal Button
		 Day.setVisible(true);       //Shows the date
		 Name.setVisible(false);     //Hides name of patient, or label
		 Info.setVisible(false);     //hides info and info2
		 Info2.setVisible(false);
		 Date dNow = new Date( );
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("hh:mm a zzz");  
		 Time.setVisible(true);      //shows the time
		 Time.setText(ft.format(dNow));  //this actually writes the current time
		 Temp.setVisible(true);       //shows the temperature label
		 XRay.setEnabled(true);        //enables XRay button
		 Suggestion.setVisible(false);    //Hides suggestion label and XRay Synop
		 XraySynop.setVisible(false);
		 Medical.setEnabled(true);       //Enables Medical button
		 Modes.setBackground(new Color(50,50,150));  //Change colors of both lenses
		 Lens2.setBackground(new Color(50,50,150));
	   } 
	
	private void MedicalAction( ActionEvent event )  
	   {                                       
		 Medical.setEnabled(false);       //the rest of the buttons are more so how it is from above
		 Time.setVisible(false);
		 Temp.setVisible(false);
		 Normal.setEnabled(true);
		 Day.setVisible(false);
		 Name.setVisible(true);
		 Condition.setVisible(true);
		 XRay.setEnabled(true);
		 XraySynop.setVisible(false);
		 Suggestion.setVisible(false);
		 Modes.setBackground(new Color(0,150,200));
		 Lens2.setBackground(new Color(0,150,200));
		 Info.setVisible(true);
		 Info2.setVisible(true);
		 
		 int Cond=Randomizer.randInt(1,5);  //except this takes assessment of the patient,
		 sub.Condition(Cond);               //which goes to another class
	   } 
	private void XRayAction( ActionEvent event )  
	   {                                       
		 XRay.setEnabled(false); 
		 Day.setVisible(false);
		 Normal.setEnabled(true);
		 Medical.setEnabled(true);
		 Time.setVisible(false);
		 Temp.setVisible(false);
		 Name.setVisible(false);
		 Condition.setVisible(false);
		 XraySynop.setVisible(true);
		 Suggestion.setVisible(true);
		 Info.setVisible(false);
		 Info2.setVisible(false);
		 Modes.setBackground(Color.BLACK);
		 Lens2.setBackground(Color.BLACK);
		 
		 int XScen=Randomizer.randInt(1,5);    //this creates the event if the patient has something going on inside
		 sub.XRaySynop(XScen);                 //through the X-Ray
	   } 
	private void OnAction( ActionEvent event )  
	   {                                       
		 XRay.setEnabled(true); 
		 Medical.setEnabled(true);
		 Day.setVisible(true);
		 Date Num=new Date();
		 SimpleDateFormat form= new SimpleDateFormat ("EEE, MMM d, yyyy");
		 Day.setText(form.format(Num));
		 Date dNow = new Date( );
	     SimpleDateFormat ft = new SimpleDateFormat ("hh:mm a zzz");
		 Time.setVisible(true);
		 Time.setText(ft.format(dNow));
		 Temp.setVisible(true);
		 Condition.setVisible(false);
		 Normal.setEnabled(false);
		 Name.setVisible(false);
		 On.setEnabled(false);
		 Off.setEnabled(true);
		 Info.setVisible(false);
		 Info2.setVisible(false);
		 Modes.setBackground(new Color(50,50,150));
		 Lens2.setBackground(new Color(50,50,150));	
		
	   } 
	private void OffAction( ActionEvent event )  
	   {                                       
		 XRay.setEnabled(false); 
		 Time.setVisible(false);
		 Temp.setVisible(false);
		 Name.setVisible(false);
		 Day.setVisible(false);
		 Info.setVisible(false);
		 Info2.setVisible(false);
		 Condition.setVisible(false);
		 XraySynop.setVisible(false);
		 Suggestion.setVisible(false);
		 Normal.setEnabled(false);
		 Medical.setEnabled(false);
		 On.setEnabled(true);
		 Modes.setBackground(Color.GRAY);
		 Lens2.setBackground(Color.GRAY);		
		 Off.setEnabled(false);
		 
	   } 
	public static void main( String args[] )//Instantiates the Medi-Glass
	{
		Med_GUI_Maker Glasses= new Med_GUI_Maker();
		Glasses.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		
	} 

}
