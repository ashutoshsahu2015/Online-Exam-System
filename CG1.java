import java .awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class CG1 extends Frame implements ActionListener , ItemListener
{
    Button b1,b2;
    Label l1;
    TextField t1;
    Checkbox cb1,cb2,cb3,cb4;
    CheckboxGroup cbg;
    CG1()
    {
         setLayout(null);
         b2=new Button("Next");
         b1=new Button("Exit");
         t1=new  TextField("0",20);
         l1=new Label(" 1)Touch Panels are  ____________");
        cbg=new CheckboxGroup();
        cb1=new Checkbox("a)display devices",cbg,false);
        cb2=new Checkbox("b)interactive devices",cbg,false);    //b)
        cb3=new Checkbox("c)data generating devices",cbg,false);
        cb4=new Checkbox("d)None of these",cbg,false);
        setBackground(Color.lightGray);
       
         add(b2);
         add(b1);
         add(t1);
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



         setTitle("CG1");
         setSize(1366,768);
         setVisible(true);
         b2.setBounds(250,450,100,30);
         b1.setBounds(380,450,100,30);
         l1.setBounds(80,100,400,40);
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
                  CG2 c=new CG2(a);
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
        CG1 f1=new CG1();
    } */ 
}