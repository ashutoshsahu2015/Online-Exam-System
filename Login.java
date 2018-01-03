
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2;

	public Login()
	{
setLayout(new BorderLayout());
JLabel background =new JLabel(new ImageIcon("login.jpg"));
		l1=new Label("Username");
		l2=new Label("Password");
		l3=new Label("Welcome to Sinhgad Educational Society,Lonavala");
		t1=new TextField(30);
		t2=new TextField(30);
		b1=new Button("Login");
		b2=new Button("Exit");
		b2.setBackground(Color.lightGray);
		b1.setBackground(Color.lightGray);
		t2.setEchoChar('*');

		Font f1=new Font("Algebric",Font.ITALIC,15);
		l3.setFont(f1);

		l1.setBounds(50,100,100,30);
		t1.setBounds(200,100,100,30);
		l2.setBounds(50,150,100,30);
		t2.setBounds(200,150,100,30);
		b1.setBounds(80,200,100,30);
		b2.setBounds(190,200,100,30);
		l3.setBounds(50,20,350,30);
		setTitle("Login screen");
		
		add(background);
		background.add(l1);
		background.add(t1);
		background.add(l3);
		background.add(l2);
		background.add(t2);
		background.add(b1);
		background.add(b2);

		setSize(1366,768);
		
		setVisible(true);
		t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String aa=t1.getText();
		String bb=t2.getText();
		
		if(ae.getSource()==b1)
		{
		if(aa.equals("Ashutosh") && bb.equals("Ashutosh"))
			{
				JOptionPane.showMessageDialog(null,"Login successful");
				Myframe s= new Myframe();
				setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Login not successful");
			}
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	repaint();
	}
public static void main(String args[])
{
Login l=new Login();
}
}