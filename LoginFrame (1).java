import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;


class HomePage  implements ActionListener
{
	Frame fr;
	Button b1,b2,b3,b4,b5;
	
	HomePage()
	{ 
		MenuBar menuBar = new MenuBar();

        	// Create a menu and add items to it
        	Menu loginMenu = new Menu("Login");
		Menu aboutMenu = new Menu("About Us");
		Menu contactMenu = new Menu("Contact Us");
        
       		// Add the menu to the menu bar
        	menuBar.add(loginMenu);
		menuBar.add(aboutMenu);
		menuBar.add(contactMenu);

        // Set the menu bar for this frame
        //fr.setMenuBar(menuBar);
		fr=new Frame("HomePage");	
		b1=new Button("Create Ration Card");
		b1.setBounds(580,250,220,60);
		Color b = new Color(0, 51, 102);
		b1.setBackground(b);
        	b1.setForeground(Color.WHITE);
		fr.add(b1);
		
		b2=new Button("View Ration Card");
		b2.setBounds(580,320,220,60);

		b2.setBackground(b);
        	b2.setForeground(Color.WHITE);
		fr.add(b2);
		
		b3=new Button("Update Ration Card");
		b3.setBounds(580,390,220,60);
		b3.setBackground(b);
        	b3.setForeground(Color.WHITE);
		fr.add(b3);
		
		b4=new Button("Delete Ration Card");
		b4.setBounds(580,460,220,60);
		b4.setBackground(b);
        	b4.setForeground(Color.WHITE);
		fr.add(b4);
		
		b5=new Button("Exit");
		b5.setBounds(580,530,220,60);
		b5.setBackground(b);
        	b5.setForeground(Color.WHITE);
		fr.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		fr.setLayout(null);
		fr.setSize(1500,1500);
		fr.setVisible(true);
		fr.setMenuBar(menuBar);
		Color blue = new Color(173, 216, 230);
		fr.setBackground(blue); 
		

		
	}
	


	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			new CreateRationCard();
			fr.setVisible(false);
		}
		else if(e.getSource()==b2)
		{
			new ViewRationCard();
			fr.setVisible(false);
		}
		else if(e.getSource()==b3)
		{
			new UpdateRationCard();
			fr.setVisible(false);
		}
		else if(e.getSource()==b4)
		{
			new DeleteRationCard();
			fr.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
		
	}
	
	public static void main(String args[])
	{
		new HomePage();
		
	}
}


class LoginFrame extends Frame implements ActionListener {

    Label lblUsername, lblPassword;
    TextField txtUsername, txtPassword;
    Button btnLogin;

    LoginFrame() {
        super("Login Page");

        lblUsername = new Label("Username:");
        lblUsername.setBounds(50, 50, 100, 20);
        add(lblUsername);

        txtUsername = new TextField();
        txtUsername.setBounds(160, 50, 100, 20);
        add(txtUsername);

        lblPassword = new Label("Password:");
        lblPassword.setBounds(50, 80, 100, 20);
        add(lblPassword);

        txtPassword = new TextField();
        txtPassword.setEchoChar('*'); // to hide the password
        txtPassword.setBounds(160, 80, 100, 20);
        add(txtPassword);

        btnLogin = new Button("Login");
        btnLogin.setBounds(100, 120, 80, 20);
        btnLogin.addActionListener(this);
        add(btnLogin);

        setSize(1500, 1500);
        setLayout(null);
        setVisible(true);
    }

  public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==btnLogin)
			{
				new HomePage();
				System.out.println("\nLogged in successfully.");			
			
			}
			else
			{
				System.out.println("\n Try again");
			}
		}
    public static void main(String[] args) {
        new LoginFrame();
    }
}


class CreateRationCard implements ActionListener
{
	Frame f;
	Label l1,l2,l3,l4,l5,l6,l8,l9,l10;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf8,tf9;
	Button b1,b2;
	
	
	CreateRationCard()
	{
		f=new Frame("CreateRationCard");
		
		l1=new Label("Name :");
		l1.setBounds(50,50,100,20);
		f.add(l1);

		tf1=new TextField(50);
		tf1.setBounds(200,50,100,20);
		f.add(tf1);

		l2=new Label("Permanent Address :");
		l2.setBounds(50,90,150,20);
		f.add(l2);

		tf2=new TextField(50);
		tf2.setBounds(200,90,150,20);
		f.add(tf2);

		l3=new Label("City :");
		l3.setBounds(50,130,50,20);
		f.add(l3);

		tf3=new TextField(50);
		tf3.setBounds(200,130,50,20);
		f.add(tf3);

		l4=new Label("State :");
		l4.setBounds(50,170,50,20);
		f.add(l4);

		tf4=new TextField(50);
		tf4.setBounds(200,170,50,20);
		f.add(tf4);

		l5=new Label("Country :");
		l5.setBounds(50,210,100,20);
		f.add(l5);

		tf5=new TextField(50);
		tf5.setBounds(200,210,50,20);
		f.add(tf5);

		l6=new Label("Phone Number :");
		l6.setBounds(50,250,100,20);
		f.add(l6);

		tf6=new TextField(50);
		tf6.setBounds(200,250,50,20);
		f.add(tf6);

		l8=new Label("Family Members :");
		l8.setBounds(50,330,100,20);
		f.add(l8);

		tf8=new TextField(50);
		tf8.setBounds(200,330,50,20);
		f.add(tf8);

		l9=new Label("Monthly Income :");
		l9.setBounds(50,370,100,20);
		f.add(l9);

		tf9=new TextField(50);
		tf9.setBounds(200,370,50,20);
		f.add(tf9);

		
		
		
		b1=new Button("Submit");
		b1.setBounds(50,500,100,30);
		f.add(b1);
		b1.setBackground(Color.BLUE);
        	b1.setForeground(Color.WHITE);

		b2=new Button("Back");
		b2.setBounds(150,500,100,30);
		f.add(b2);
		b2.setBackground(Color.BLUE);
        	b2.setForeground(Color.WHITE);

		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setSize(1500,1500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				//code for creating ration card
				String name=tf1.getText();
				String address=tf2.getText();
				String city=tf3.getText();
				String state=tf4.getText();
				String country=tf5.getText();
				String phone=tf6.getText();
				String family=tf8.getText();
				String income=tf9.getText();
				

				System.out.println("Name : "+name);
				System.out.println("Permanent Address : "+address);
				System.out.println("City : "+city);
				System.out.println("State : "+state);
				System.out.println("Country : "+country);
				System.out.println("Phone Number : "+phone);
				System.out.println("Family Members : "+family);
				System.out.println("Monthly Income : "+income);

				System.out.println("\nThankyou for submitting the details.Your Ration Card is successfully created.");
				f.dispose();
			
			
			}
			else
			{
				new HomePage();
				f.setVisible(false);
			}
		}
		/*public void paint(Graphics g)
		{
      			Graphics2D g2 = (Graphics2D)g;        
		        Font plainFont = new Font("Serif", Font.PLAIN, 24);        
      			g2.setFont(plainFont);
      			g2.setColor(Color.red);
      			g2.drawString("Welcome to TutorialsPoint", 50, 70); 
      			g2.setColor(Color.GRAY);
      			g2.drawString("Welcome to TutorialsPoint", 50, 120);  
  		}*/


}


class ViewRationCard implements ActionListener
{
	Frame fr2;
	Label l1;
	TextField t1;
	Button b1,b2;
	
	ViewRationCard()
	{
		fr2=new Frame("View Ration Card");
		
		l1=new Label("Card No :");
		l1.setBounds(50,50,100,30);
		fr2.add(l1);
		
		t1=new TextField();
		t1.setBounds(150,50,100,30);
		fr2.add(t1);
		
		b1=new Button("View");
		b1.setBounds(50,150,100,30);
		fr2.add(b1);
		
		b2=new Button("Back");
		b2.setBounds(150,150,100,30);
		fr2.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		fr2.setSize(300,300);
		fr2.setLayout(null);
		fr2.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//code for viewing ration card
		}
		else
		{
			new HomePage();
			fr2.setVisible(false);
		}
	}
}

class UpdateRationCard implements ActionListener
{
	Frame fr3;
	Label l1;
	TextField t1;
	Button b1,b2;
	
	UpdateRationCard()
	{
		fr3=new Frame("Update Ration Card");
		
		l1=new Label("Card No :");
		l1.setBounds(50,50,100,30);
		fr3.add(l1);
		
		t1=new TextField();
		t1.setBounds(150,50,100,30);
		fr3.add(t1);
		
		b1=new Button("Update");
		b1.setBounds(50,150,100,30);
		fr3.add(b1);
		
		b2=new Button("Back");
		b2.setBounds(150,150,100,30);
		fr3.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		fr3.setSize(300,300);
		fr3.setLayout(null);
		fr3.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//code for updating ration card
		}
		else
		{
			new HomePage();
			fr3.setVisible(false);
		}
	}
}

class DeleteRationCard implements ActionListener
{
	Frame fr4;
	Label l1;
	TextField t1;
	Button b1,b2;
	
	DeleteRationCard()
	{
		fr4=new Frame("Delete Ration Card");
		
		l1=new Label("Card No :");
		l1.setBounds(50,50,100,30);
		fr4.add(l1);
		
		t1=new TextField();
		t1.setBounds(150,50,100,30);
		fr4.add(t1);
		
		b1=new Button("Delete");
		b1.setBounds(50,150,100,30);
		fr4.add(b1);
		
		b2=new Button("Back");
		b2.setBounds(150,150,100,30);
		fr4.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		fr4.setSize(300,300);
		fr4.setLayout(null);
		fr4.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			//code for deleting ration card
		}
		else
		{
			new HomePage();
			fr4.setVisible(false);
		}
	}
}