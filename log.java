package bankmanagementsystemm;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class log extends JFrame implements ActionListener {	
	private static final long serialVersionUID = 1L;
	JButton b1,b2,b3;
	JLabel j1,j2,j3;
	JTextField t;
	JPasswordField p; 
	log() {
        super("Bank Management System");
        setSize(700, 450);
        setLocation(450, 250);
        // Get image from the same package
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystemm/bank.png"));//create an object of the image
        Image scaledImage1 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
        JLabel label1 = new JLabel(scaledIcon1);
        label1.setBounds(285, 10, 100, 100);
        //load the image from the memory to the system
        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystemm/backbg.png"));
        Image si2=i2.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        ImageIcon ii2=new ImageIcon(si2);
        JLabel label2=new JLabel(ii2);
        label2.setBounds(0,0,700,450);
       ImageIcon i3 = new ImageIcon (ClassLoader.getSystemResource("bankmanagementsystemm/card.png"));
       Image si3= i3.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon s =new ImageIcon(si3);
       JLabel j=new JLabel(s);
       j.setBounds(500,315,100,100);
       JLabel j1=new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM");
       j1.setFont(new Font("Calibri",Font.ITALIC,30));
       j1.setForeground(Color.RED);
       j1.setBounds(50, 100, 600,100);
        j2=new JLabel("CARD NUMBER");
       j2.setBounds(50,150,100,100);
       j2.setForeground(Color.WHITE);
       j2.setFont(new Font("Calibri",Font.BOLD,15));
       
        j3 =new JLabel ("PIN");
       j3.setBounds(50, 200, 100, 100);
       j3.setForeground(Color.WHITE);
       j3.setFont(new Font("Calibri",Font.BOLD,15));
       t =new JTextField();
        p=new JPasswordField();
       t.setBounds(300, 190, 150, 20);
       p.setBounds(300, 240, 150, 20); 
      b1 =new JButton ("LOG IN");
      b1.setBounds(100, 275, 100,20);
      b2 =new JButton ("CLEAR");
      b2.setBounds(250,275,100,20);
      b2.addActionListener(this);
       b3 =new JButton ("SIGN IN");
      b3.setBounds(100,320 , 250, 20);
      b3.addActionListener(this);
       setLayout(null);
        add(label1);
        add(j);
        add(j1);
        add(j2);
        add(j3);
        add(t);
        add(p);
        add(b1);
        add(b2);
        add(b3);
        add(label2);
        setVisible(true);
    }
    public static void main(String[] args) {
    	new log();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
       if(e.getSource()==b1) {
    	   
       }
       else if(e.getSource()==b2) {
    	  t.setText(" ");
    	  p.setText(" ");
       }
       else if (e.getSource()==b3) {
    	  new signin();
    	  setVisible(false);
       }
       }catch (Exception E) {
    	   E.printStackTrace();
       }
	}   
    }
class signin extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JDateChooser datechooser;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b10;
	signin(){
		super("APPLICATION FORM ");
		ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystemm/bank.png"));
		Image si=a.getImage().getScaledInstance(80, 50, Image.SCALE_DEFAULT);
		ImageIcon sia=new ImageIcon(si);
		JLabel ji=new JLabel(sia);
	    ji.setBounds(20, 20, 100, 50);	
		j1 =new JLabel("APPLICATION FORM NO. "+ ((int)(Math.random()*10000)+1));
		j1.setBounds(170,10,600,100);
		j1.setFont(new Font("Calibri",Font.BOLD,30));
		j2=new JLabel ("page 1");
		j2.setBounds(350,50,100,50);
		j3=new JLabel("Personal Details");
		j3.setBounds(320,65,100,50);
		j4=new JLabel("Name");
		j4.setBounds(150,100,100,50);
		t1=new JTextField();
		t1.setBounds(300,110,300,20);
		j5=new JLabel("Father's Name ");
		j5.setBounds(150,125,150,50);
		t2=new JTextField();
		t2.setBounds(300,135,300,20);
		j6=new JLabel("Date Of Birth");
		j6.setBounds(150,150,100,50);
		datechooser =new JDateChooser();
		datechooser.setForeground(new Color(105,105,105));
		datechooser.setBounds(300,165,300,20);
		j7=new JLabel("Gender");
		j7.setBounds(150,175,50,50);
		//object of radio buttons
		r1=new JRadioButton("Male ");
		r2 =new JRadioButton("Female");
		r1.setBounds(320, 190, 100, 20);
		r2.setBounds(520, 190, 100, 20);
		// grouping two buttons so u cannot select both the buttons at the same same time 
		ButtonGroup b1=new ButtonGroup();
		b1.add(r1);
		b1.add(r2);
		j8=new JLabel("Email Address");
		j8.setBounds(150,195,200,50);
		t3=new JTextField();
		t3.setBounds(300,210,300,20);
		j9=new JLabel("Marital Status " );
		j9.setBounds(150,220,200,50);
		r3=new JRadioButton("Married");
		r4=new JRadioButton("UnMarried");
		r5=new JRadioButton("Other");
		r3.setBounds(320,235,100,20);
		r4.setBounds(430,235,100,20);
		r5.setBounds(540,235,100,20);
		ButtonGroup b3=new ButtonGroup();
		b3.add(r3);
		b3.add(r4);
		b3.add(r5);
		j10 = new JLabel("State");
		j10.setBounds(150,245,100,50);
		t5 =new JTextField();
		t5.setBounds(300,260,300, 20);
		j11 = new JLabel("City");
		j11.setBounds(150,265,100,50);
		t6=new JTextField();
		t6.setBounds(300,290,300,20);
		b10=new JButton("NEXT");
		b10.setBounds(500,400,100,50);
		b10.addActionListener(this);
		setLayout(null);
		add(ji);
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5); 
		add(j6);
		add(t1);
		add(t2);
		add(datechooser);
		add(j7);
		add(r1);
		add(r2);
		add(j8);
		add(t3);
		add(j9);
		add(r3);
		add(r4);
		add(r5);
		add(j10);
		add(t5);
		add(j11);
		add(t6);
		add(b10);
		//to set background colour
		getContentPane().setBackground(new Color(222,255,228));
		setSize(700,500);
		setLocation(100,100);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//extracting the text from the text field 
	 String name=t1.getText();
	 String fname=t2.getText();
	 String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
	 String gender=null;
	if(r1.isSelected()) {
		 gender=r1.getText();
	 }
	else
	{
		gender=r2.getText();
	}
	String email=t3.getText();
	String marital=null;
	if(r3.isSelected()) {
		marital=r3.getText();
	}
	else if(r4.isSelected()) {
		marital=r4.getText();
	}
	else {
		marital=r5.getText();
	}
	String state=t5.getText();
	String city=t6.getText();
    // passing the values to database 
	conn con=new conn();
	try {

		//con.st.execute("insert into bank values('"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+state+"','"+city+"')");
		String query = String.format(
				"insert into bank values('%s','%s','%s','%s','%s','%s','%s','%s')",
				name, fname, dob, gender, email, marital, state, city
		);
		con.st.executeUpdate(query); // use executeUpdate for insert queries

		new signup2();
		setVisible(false);
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	}
}
class conn {
	Connection con;
	Statement st;
	public conn() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","admin");
			 st = con.createStatement();
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}
class
signup2 extends JFrame implements ActionListener {
	JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12;
	JComboBox jc, jc1, jc2, jc3, jc4, jc5, jc6;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JRadioButton r1, r2, r3, r4;
	JButton b1;

	signup2() {

		ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystemm/bank.png"));
		Image a1 = a.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon a11 = new ImageIcon(a1);
		JLabel j = new JLabel(a11);
		j.setBounds(50, 10, 100, 100);

		j1 = new JLabel("Page 2 :-");
		j1.setBounds(200, 30, 200, 50);
		Font f = new Font("Callibri", Font.BOLD, 28);
		j1.setFont(f);
		j2 = new JLabel("Additional Details");
		j2.setBounds(200, 65, 200, 50);
		j3 = new JLabel("RELEGION ");
		j3.setBounds(50, 85, 200, 100);
		Font f11 = new Font("Callibri", Font.BOLD, 14);
		j3.setFont(f11);
		t1 = new JTextField();
		t1.setBounds(200, 120, 300, 30);
		Font f1 = new Font("Callibri", Font.BOLD, 20);
		String r[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
		jc = new JComboBox(r);
		jc.setFont(new Font("Callibri", Font.BOLD, 15));
		jc.setBounds(200, 120, 320, 30);
		j4 = new JLabel("CATEGORY ");
		j4.setBounds(50, 130, 100, 100);
		j4.setFont(f11);
		t2 = new JTextField();
		t2.setBounds(200, 170, 300, 30);
		String category[] = {"General", "OBC", "SC", "ST"};
		jc1 = new JComboBox(category);
		jc1.setFont(new Font("Callibri", Font.BOLD, 15));
		jc1.setBounds(200, 170, 320, 30);
		jc1.setBackground(Color.WHITE);
		j5 = new JLabel("INCOME");
		j5.setBounds(50, 180, 100, 100);
		j5.setFont(f11);
		t3 = new JTextField();
		t3.setBounds(200, 220, 300, 30);
		String income[] = {"Less than 500000", "More than 500000", "More than 1000000", "More than 1500000"};
		jc2 = new JComboBox(income);
		jc2.setFont(new Font("Callibri", Font.BOLD, 15));
		jc2.setBounds(200, 220, 320, 30);
		jc2.setBackground(Color.WHITE);
		j6 = new JLabel("EDUCATION");
		j6.setBounds(50, 230, 100, 100);
		j6.setFont(f11);
		t4 = new JTextField();
		t4.setBounds(200, 260, 300, 30);
		String education[] = {"Graduate", "Non-Graduate", "Post Graduate",};
		jc3 = new JComboBox(education);
		jc3.setFont(new Font("Callibri", Font.BOLD, 15));
		jc3.setBounds(200, 260, 320, 30);
		jc3.setBackground(Color.WHITE);
		j7 = new JLabel("OCCUPATION");
		j7.setBounds(50, 270, 100, 100);
		j7.setFont(f11);
		t5 = new JTextField();
		t5.setBounds(200, 300, 300, 30);
		String occupation[] = {"Bussiness", "Job", "House Wife", "Other"};
		jc4 = new JComboBox(occupation);
		jc4.setFont(new Font("Callibri", Font.BOLD, 15));
		jc4.setBounds(200, 300, 320, 30);
		jc4.setBackground(Color.WHITE);
		j8 = new JLabel("PAN NUMBER");
		j8.setBounds(50, 340, 150, 30);
		j8.setFont(f11);
		t6 = new JTextField();
		t6.setBounds(200, 340, 320, 30);
		j9 = new JLabel("AADHAR NUMBER");
		j9.setBounds(50, 380, 150, 30);
		j9.setFont(f11);
		t7 = new JTextField();
		t7.setBounds(200, 380, 320, 30);
		j10 = new JLabel("SENIOR CITIZEN");
		j10.setBounds(50, 430, 150, 30);
		j10.setFont(f11);
		r1 = new JRadioButton("YES");
		r2 = new JRadioButton("NO");
		r1.setBounds(250, 430, 100, 20);
		r2.setBounds(400, 430, 100, 20);
		r1.setBackground(new Color(200, 102, 102));
		r2.setBackground(new Color(200, 102, 102));
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		j11 = new JLabel("EXISTING ACCOUNT");
		j11.setBounds(50, 470, 150, 30);
		j11.setFont(f11);
		r3 = new JRadioButton("YES");
		r4 = new JRadioButton("NO");
		r3.setBackground(new Color(200, 102, 102));
		r4.setBackground(new Color(200, 102, 102));
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(r3);
		bg2.add(r4);
		r3.setBounds(250, 470, 100, 20);
		r4.setBounds(400, 470, 100, 20);
		b1 = new JButton("NEXT");
		b1.setBounds(550, 550, 100, 30);
		b1.setFont(new Font("Callibri", Font.BOLD, 22));
		b1.addActionListener(this);
		add(j);
		add(j1);
		add(j2);
		add(j3);
		add(jc);
		//add(t1);
		add(j4);
		add(jc1);
		//add(t2);
		add(j5);
		add(jc2);
		//add(t3);
		add(j6);
		add(jc3);
		//add(t4);
		add(j7);
		//add(t5);
		add(jc4);
		add(j8);
		add(t6);
		add(j9);
		add(t7);
		add(j10);
		add(r1);
		add(r2);
		add(j11);
		add(r3);
		add(r4);
		add(b1);
		setLayout(null);
		setSize(700, 650);
		getContentPane().setBackground(new Color(200, 102, 102));
		setVisible(true);
		setLocation(450, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	  String r=(String) jc.getSelectedItem();
      String c=(String) jc1.getSelectedItem();
	  String i=(String) jc2.getSelectedItem();
	  String e1=(String) jc3.getSelectedItem();
	  String o=(String) jc4.getSelectedItem();
	  String p=t6.getText();
	  String a=t7.getText();
	  String sc=null;
	  if(r1.isSelected()){
		  sc=r1.getText();
	  }else{
		  sc=r2.getText();
	  }
    String ea=null;
	  if(r3.isSelected()){
		  ea=r3.getText();
	  }else{
		  ea=r4.getText();
	  }
	  try{
		  if(t6.getText().trim().equals("") || t7.getText().trim().equals("")) {
			  JOptionPane.showMessageDialog(null, "fill all the Details");
		  }

		  else{
			  conn c1=new conn();
			  String query=(String.format("insert into bank2 values ('%s','%s','%s', '%s', '%s', '%s', '%s', '%s', '%s')",r,c,i,e1,o,p,a,sc,ea));
			  c1.st.executeUpdate(query);
			 new signup3();
			 setVisible(false);
		  }
	  }catch(Exception  e2){
		  e2.printStackTrace();
	  }

	}
}
class signup3 extends JFrame implements ActionListener {
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11;
	JTextField t1,t2,t3,t4,t5;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
	JButton b1;
	  signup3() {
		  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankmanagementsystemm/bank.png"));
		  Image i11 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		  ImageIcon i111 = new ImageIcon(i11);
		  j1 = new JLabel(i111);
		  j1.setBounds(50,10,100,100);
		  j2=new JLabel("PAGE 3 :-");
		  j2.setFont(new Font("Callibri",Font.BOLD,28));
		  j2.setBounds(180, 30, 150, 30);
		  j3=new JLabel("Additional Details");
		  j3.setFont(new Font("Callibri",Font.BOLD,14));
		  j3.setBounds(180, 70, 200, 30);
		  j4=new JLabel("ACCOUNT TYPE");
		  Font f1=new Font("Callibri",Font.BOLD,18);
		  j4.setFont(f1);
		  j4.setBounds(50,120,200,20);
		  r1=new JRadioButton("Saving Account");
		  r2=new JRadioButton("Fixed Deposit Account");
		  r3=new JRadioButton("Current Account");
		  r4=new JRadioButton("Recurring Deposit Account");
		  r1.setBounds(50,150,200,20);
		  r2.setBounds(350,150,200,20);
		  r3.setBounds(50,180,200,20);
		  r4.setBounds(350,180,200,20);
		  r1.setBackground(new Color(215, 252, 252));
		  r2.setBackground(new Color(215, 252, 252));
		  r3.setBackground(new Color(215, 252, 252));
		  r4.setBackground(new Color(215, 252, 252));
		  ButtonGroup bg=new ButtonGroup();
		  bg.add(r1);
		  bg.add(r2);
		  bg.add(r3);
		  bg.add(r4);
		  j5 =new JLabel("CARD NUMBER");
		  j5.setFont(f1);
		  j5.setBounds(50,210,200,50);
		  j6 =new JLabel("XXXX-XXXX-XXXX-7585");
		  j6.setBounds(350,210,200,50);
		  j7=new JLabel("(Your 16 digit card Number)");
		  j7.setBounds(50,245,250,20);
		  j7.setFont(new Font("callibri",Font.PLAIN,10));
		  j8=new JLabel("(It will appear on ATM Card / Cheque Book)");
		  j8.setFont(new Font("callibri",Font.PLAIN,10));
		  j8.setBounds(350,245,250,20);
		  j9=new JLabel("PIN :");
		  j9.setFont(f1);
		  j9.setBounds(50,280,200,20);
		  j10=new JLabel("XXXX");
		  j10.setBounds(350,275,100,30);
          JLabel j11=new JLabel("Services Required:");
		  j11.setFont(f1);
		  j11.setBounds(50,320,200,20);
		  r5=new JRadioButton("ATM Card");
		  r6=new JRadioButton("Internet Banking");
		  r7=new JRadioButton("Mobile Bnaking");
		  r8=new JRadioButton("EMAIL Alerts");
		  r9=new JRadioButton("Cheque Book");
		  r10=new JRadioButton("E-Statement");
		  r5.setBounds(50,350,200,30);
		  r6.setBounds(400,350,200,30);
		  r7.setBounds(50,390,200,30);
		  r8.setBounds(400,390,200,30);
		  r9.setBounds(50,430,200,30);
		  r10.setBounds(400,430,200,30);
		  r5.setBackground(new Color(215, 252, 252));
		  r6.setBackground(new Color(215, 252, 252));
		  r7.setBackground(new Color(215, 252, 252));
		  r8.setBackground(new Color(215, 252, 252));
		  r9.setBackground(new Color(215, 252, 252));
		  r10.setBackground(new Color(215, 252, 252));
		  b1=new JButton("SUBMIT");
		  b1.setBounds(500,540,100,30);
		  setLayout(null);
		  add(j1);
		  add(j2);
		  add(j3);
		  add(j4);
		  add(r1);
		  add(r2);
		  add(r3);
		  add(r4);
		  add(j5);
		  add(j6);
		  add(j7);
		  add(j8);
		  add(j9);
		  add(j10);
		  add(j11);
		  add(r5);
		  add(r6);
		  add(r7);
		  add(r8);
		  add(r9);
		  add(r10);
		  add(b1);
		  b1.addActionListener(this);
		  setSize(700, 650);
		  setVisible(true);
		  setLocation(450, 100);
		  getContentPane().setBackground(new Color(215, 252, 252));
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
     String at=null;
	 if(r1.isSelected()){
		 at=r1.getText();
	 }else if(r2.isSelected()){
		 at=r2.getText();
	 }else if(r3.isSelected()){
		 at=r3.getText();
	 }else {
		 at=r4.getText();
	 }

	}
}
