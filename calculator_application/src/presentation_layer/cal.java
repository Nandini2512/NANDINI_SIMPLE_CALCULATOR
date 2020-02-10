package presentation_layer;
import java.awt.*;
import javax.swing.*;
import Business_layer.add;
import java.awt.event.*;

public class cal implements ActionListener{

	JFrame fr;
	JButton b1,b2,b3,b4,b5;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3,l4;
	public cal(){
		fr=new JFrame("CALCULATOR");
		b4=new JButton("ADDITION");
		b3=new JButton("SUSTRACTION");
		b2=new JButton("MULTIPLICATION");
		b1=new JButton("DIVISION");
		b5=new JButton("CANCEL");
		t1=new JTextField(8);
		t2=new JTextField(8);
		t3=new JTextField(8);
		l1=new JLabel("enter number a");
		l2=new JLabel("enter number b");
		l3=new JLabel("ANS");
		l4=new JLabel("");
		fr.setVisible(true);
		fr.setSize(1000,1000);
		fr.add(l4);
		l4.add(l1);
		l4.add(t1);
		l4.add(l2);
		l4.add(t2);
		l4.add(l3);
		l4.add(t3);
		l4.add(b4);
		l4.add(b3);
		l4.add(b2);
		l4.add(b1);
		l4.add(b5);
		l1.setBounds(200,100,200,70);
		t1.setBounds(300,100,200,70);
		l2.setBounds(200,200,200,70);
		t2.setBounds(300,200,200,70);
		b4.setBounds(50,300,200,70);
		b3.setBounds(250,300,200,70);
		b2.setBounds(450,300,200,70);
		b1.setBounds(350,370,200,70);
		b5.setBounds(200,370,200,70);
		l3.setBounds(200,450,200,70);
		t3.setBounds(350,450,200,70);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		
	}
	public void actionPerformed(ActionEvent ae){
		add ad=new add();
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		if(ae.getSource().equals(b4)){
			String v=String.valueOf((ad.addition(a,b)));
			t3.setText(v);
		}
		else if(ae.getSource().equals(b3)){
			String v=String.valueOf((ad.substraction(a,b)));
			t3.setText(v);
		}
		else if(ae.getSource().equals(b2)){
			String v=String.valueOf((ad.multi(a,b)));
			t3.setText(v);
		}
		else if(ae.getSource().equals(b1)){
			String va="";
			int k=ad.division(a,b);
			va=String.valueOf(k);
			t3.setText(va);
		}
		else if(ae.getSource().equals(b5)){
			fr.setVisible(false);
		}
		else
			fr.setVisible(false);
		
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new cal();

	}

}
