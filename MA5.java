import java .awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class MA5 extends Frame implements ActionListener , ItemListener
{
    Button b1,b2;
    Label l1;
    TextField t1;
    Checkbox cb1,cb2,cb3,cb4;
    CheckboxGroup cbg;
    MA5(int n)
    {
         setLayout(null);
         b2=new Button("Next");
         b1=new Button("Exit");
        t1=new  TextField(20);
         l1=new Label(" 5)The paging unit is enabled only in  ?");
        cbg=new CheckboxGroup();
        cb1=new Checkbox("a)virtual mode",cbg,false);
        cb2=new Checkbox("b)addressing mode",cbg,false);    
        cb3=new Checkbox("c)protected mode",cbg,false);	//Ans
        cb4=new Checkbox("d)none of the mentioned",cbg,false); 
       t1.setText(Integer.toString(n));  
      setBackground(Color.lightGray);
      
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


         setTitle("MA5");
         setSize(1366,768);
         setVisible(true);
         b2.setBounds(250,450,100,30);
         b1.setBounds(380,450,100,30);
         l1.setBounds(50,50,400,40);
         cb1.setBounds(50,150,400,30);
         cb2.setBounds(50,200,400,30);
         cb3.setBounds(50,250,400,30);
         cb4.setBounds(50,300,400,30);
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
	 if(cb3.getState()==true)
                  {
	a++;
                  }
	JOptionPane.showMessageDialog(null,"Test is Complete");                    
	Result c=new Result(a);
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
        MA5 f1=new MA5();
    } */
}