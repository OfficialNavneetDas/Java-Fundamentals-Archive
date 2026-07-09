import java.awt.Frame;
import java.awt.event.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.TextField;

class Action_listener extends Frame implements ActionListener{

	Button b1;
	Button b2;
	TextField t;
	Action_listener(){

		setSize(600,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setLocation(1320,30);
		setBackground(Color.GRAY);

		b1 = new Button("button 1");
		b1.setPreferredSize(new Dimension(50,30));
		b1.addActionListener(this);
		add(b1);

		b2 = new Button("button 2");
		b2.setPreferredSize(new Dimension(50,30));
		b2.addActionListener(this);
		add(b2);

		t = new TextField("this is text");
		t.setBounds(200,200,100,100);
		t.setText("write something");
		add(t);

		
	}
	public static void main(String[] a){
		Action_listener f = new Action_listener();
	}
	public void actionPerformed(ActionEvent e){
		//System.out.println("click huaa h");
		String name="";
		Object source = e.getSource();

		if(source == b1){
			System.out.println("button1 clicked");
			name = t.getText();
		}
		else if(source == b2){
			System.out.println("button2 clicked");
			System.out.println(t.getText());
		}
	}
}