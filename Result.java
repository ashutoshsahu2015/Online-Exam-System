import java.awt.event.*;
import java.awt.*;
public class Result extends Frame implements ActionListener 
{
       Label l1,l2,l3,l4;
       Button b1,b2;
       Result( int a)
       {
            setLayout(null);
            l1=new Label("Results:");
            l2=new Label("Total Marks:   5");
            l3=new Label("Marks Obtained:");
            l4=new Label(Integer.toString(a));
           b1=new Button("Home");
           b2=new Button("Exit");
          add(l1);
          add(l2);
         add(l3);
         add(l4);
         add(b1);
         add(b2);
           String s=Integer.toString(a);     
         Font f1=new Font("Algebric",Font.BOLD,25);
         l1.setFont(f1);	
        Font f2=new Font("Algebric",Font.BOLD,15);
        l2.setFont(f2);
        Font f3=new Font("Algebric",Font.BOLD,15);
        l3.setFont(f3);	
        Font f4=new Font("Algebric",Font.BOLD,15);
        l4.setFont(f4);	
	



            setTitle("Result");
            setSize(1366,768);
            setVisible(true);
            l1.setBounds(100,100,100,30);
            l2.setBounds(100,160,160,30);
            l3.setBounds(100,210,140,30);
            l4.setBounds(250,210,100,30);
            b1.setBounds(200,300,100,30);
            b2.setBounds(300,300,100,30);
            b1.addActionListener(this);
            b2.addActionListener(this);
       }
       public void actionPerformed(ActionEvent ae)
       {
            if(ae.getSource()==b1)
            {
                   Myframe f=new Myframe();
                  setVisible(false);
            }
            if(ae.getSource()==b2)
            {
	Login f1=new Login();
	    setVisible(false);
             }
               repaint();
       }
  /*     public static void main(String args[])
       {
             Login f1=new Login(); 
       } */ 
}	