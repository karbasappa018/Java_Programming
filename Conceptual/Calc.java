import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator implements ActionListener

{
    JFrame fobj;
    JButton bobj1,bobj2,bobj3,bobj4;
    JTextField tobj1,tobj2;
    JLabel No1_label,No2_label,Reasultlable;

    public Calculator(String title,int width,int height)
    {
        fobj = new JFrame(title);
        fobj.setSize(width,height);

        No1_label = new JLabel("Number 1");
        No1_label.setBounds(30,30,120,30);

        

        tobj1 = new JTextField();
        tobj1.setBounds(160,30,70,30);

        No2_label  = new JLabel("Number 2");
        No2_label.setBounds(30,90,120,30);

        tobj2 = new JTextField();
        tobj2.setBounds(160,90,70,30);

        bobj1 = new JButton("+");
        bobj1.setBounds(60,150,50,40);

        bobj2 = new JButton("-");
        bobj2.setBounds(120,150,50,40);

        bobj3 = new JButton("*");
        bobj3.setBounds(180,150,50,40);

        bobj4 = new JButton("/");
        bobj4.setBounds(240,150,50,40);

        Reasultlable = new JLabel("");
        Reasultlable.setBounds(100,210,150,30);

        
        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(No1_label);
        fobj.add(No2_label);
        fobj.add(Reasultlable);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.getContentPane().setBackground(Color.YELLOW);

        fobj.setLayout(null);
        fobj.setSize(width,height);



        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void actionPerformed(ActionEvent aobj)
    {
        String Number1 = tobj1.getText();
        String Number2= tobj2.getText();


        if (Number1.isEmpty() || Number2.isEmpty())
         {
        JOptionPane.showMessageDialog(null, "Please enter numbers in both fields.");
        return;
        }


        int num1 = Integer.parseInt(Number1);
        int num2 = Integer.parseInt(Number2);

        int reasult = 0;

        if(aobj.getSource()==bobj1)
        {
            reasult = num1+num2;
            Reasultlable.setText("Addition is "+reasult);

        }
        else if(aobj.getSource()==bobj2)
        {
            reasult = num1-num2;
            Reasultlable.setText("Substraction "+reasult);
        }
        else if(aobj.getSource()==bobj3)
        {
            reasult = num1*num2;
            Reasultlable.setText("Multiplication is "+reasult);
        }
        else if(aobj.getSource()==bobj4)
        {
            reasult = num1/num2;
            Reasultlable.setText("Division is "+reasult);
        }
        
    }

}


class Calc
{
    public static void main(String a[])
    {
        Calculator cobj = new Calculator("calculator",500,300);

    }
}