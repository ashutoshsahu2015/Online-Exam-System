import java .awt.*;
import java.awt.event.*;
import javax.swing.*;

public  class CG3 extends Frame implements ActionListener , ItemListener
{
    Button b1,b2;
    Label l1;
    TextField t1;
    Checkbox cb1,cb2,cb3,cb4;
    CheckboxGroup cbg;
    CG3( int n)
    {
         setLayout(null);
         b2=new Button("Next");
         b1=new Button("Exit");
         t1=new  TextField(20);
         l1=new Label(" 3)Which of the following is a data generating device ?");
        cbg=new CheckboxGroup();
        cb1=new Checkbox("a)Keyboard",cbg,false);
        cb2=new Checkbox("b)Scannner",cbg,false);    //b)
        cb3=new Checkbox("c)Plotter",cbg,false);
        cb4=new Checkbox("d)Plasma Panels",cbg,false);
        setBackground(Color.lightGray);
         t1.setText(Integer.toString(n)); 
         add(b2);
         add(b1);
         add(l1);
         add(cb1);
         add(cb2);
         add(cb3);
         add(cb4);
         Font f1=new Font("Algebric",Font.BOLD,20);
         l1.setFont(f1);
        Font f2=new Font("Algebric",Font.BOLD,16);
         cb1.setFont(f2);
        Font f3=new Font("Algebric",Font.BOLD,16);
         cb2.setFont(f3);
        Font f4=new Font("Algebric",Font.BOLD,16);
         cb3.setFont(f4);
        Font f5=new Font("Algebric",Font.BOLD,16);
         cb4.setFont(f5);


         setTitle("CG3");
         setSize(1366,768);
         setVisible(true);
         b2.setBounds(250,450,100,30);
         b1.setBounds(380,450,100,30);
         l1.setBounds(80,100,600,40);
         cb1.setBounds(100,180,400,30);
         cb2.setBounds(100,230,400,30);
         cb3.setBounds(100,280,400,30);
         cb4.setBounds(100,330,400,30);
         b1.addActionListener(this);             
         b2.addActionListener(this);
         cb1.addItemListener(this);
         cb2.addItemListener(this);
         cb3.addItemListener(this);
         cb4.addItemListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
          int a=Integer.parseInt(t1.getText());
        if(ae.getSource()==b2)
        {
             if(cb2.getState()==true)
                  {
	  a++;
                  }
                 CG4 c=new CG4(a);
                  setVisible(false);             
        }

        if(ae.getSource()==b1)
        {
            System.exit(0);
        }
        repaint();
    }
    public void itemStateChanged(ItemEvent ie)
    {
          repaint();
    }
/*    public static void main(String args[])
    {
        CG3 f1=new CG3();
    } */ 
}