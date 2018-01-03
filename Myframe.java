
import java .awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class Myframe extends Frame implements ActionListener,ItemListener
{
    String msg="   ";
    Checkbox  CG,MA,PPL,ADS;
    CheckboxGroup cbg;
    Button b1,b2;
    Label a,a1,a2;     
    Myframe()
    {
         setLayout(null);
         cbg=new CheckboxGroup();
         CG=new Checkbox("CG",cbg,false);
         MA=new Checkbox("MA",cbg,false);
         ADS=new Checkbox("ADS",cbg,false);
         PPL=new Checkbox("PPL",cbg,false);         
         b1=new Button("Select");
         b2=new Button("Logout");
         a=new Label("Welcome Ashutosh Sahu ");
         a1=new Label("Computer Department");
         a2=new Label("Select Subject:");
         setBackground(Color.lightGray);

	Font f1=new Font("Algebric",Font.ITALIC,20);
	a.setFont(f1);
	Font f2=new Font("Algebric",Font.BOLD,19);
	a1.setFont(f2);
	Font f3=new Font("Algebric",Font.BOLD,15);
	a2.setFont(f3);


         add(b1);
         add(b2);
         add(a1);
         add(a);
         add(a2);
         add(CG);
         add(MA);
         add(ADS);
         add(PPL);
         setTitle("Myframe");
         setSize(1366,768);
         setVisible(true);
         b1.setBounds(150,400,100,30);
         b2.setBounds(280,400,100,30);
         a.setBounds(50,50,300,30);
         a1.setBounds(50,100,300,30);
         a2.setBounds(50,150,200,30);
        CG.setBounds(150,200,100,30);
         ADS.setBounds(150,250,100,30);
        MA.setBounds(150,300,100,30);
         PPL.setBounds(150,350,100,30);
  
     
         b1.addActionListener(this);             
         CG.addItemListener(this);             
         ADS.addItemListener(this);             
        MA.addItemListener(this);             
         PPL.addItemListener(this);    
   }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
             if(CG.getState()==true)
             {
	String S;
                  S=JOptionPane.showInputDialog(null,"Enter the password:");
	if(S.equals("CG"))
	{	                  
                  	   CG1 f1=new CG1();
                 	  setVisible(false);
                   }
                    else
                   {
      	  JOptionPane.showMessageDialog(null,"Password  is Wrong.");
                   }
             }
             else
             {
                   if(ADS.getState()==true)
                   {
                    	String a;
                       a=JOptionPane.showInputDialog(null,"Enter the password:");
	   if(a.equals("ADS"))
	   {	                  
                  	      ADS1 f1=new ADS1();
                 	      setVisible(false);
                       }
	   else
                       {
      	      JOptionPane.showMessageDialog(null,"Password  is Wrong.");
                        }
                    }
                    else
                    {
	      if(MA.getState()==true)
                   	      {
                    	String b;
                              b=JOptionPane.showInputDialog(null,"Enter the password:");
	           if(b.equals("MA"))
	          {	                  
                  	             MA1 f1=new MA1();
                 	            setVisible(false);
                             }
	         else
                            {
      	            JOptionPane.showMessageDialog(null,"Password  is Wrong.");
                             }
                          } 
	      else
                          {
                                     if(PPL.getState()==true)
                  		 {
                    		String m;
                     	  	m=JOptionPane.showInputDialog(null,"Enter the password:");
	   		if(m.equals("PPL"))
			   {	                  
                  	      			PPL1 f1=new PPL1();
                 	      			setVisible(false);
                       		   }
	   		else
                       		{
      	     		     JOptionPane.showMessageDialog(null,"Password  is Wrong.");
                        		}
       	                  }                   
                            }           
                    }
               }
        }

        if(ae.getSource()==b2)
        {
            System.exit(0);
        }

        repaint();
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }

/*   public static void main(String args[])
    {
       new Myframe();
    } */
}