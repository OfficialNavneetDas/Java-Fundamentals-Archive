import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.*;

class home extends Frame{
	home(){
	//setting the page layout----------------------
		setVisible(true);
		setSize(600,300);
		setLayout(new FlowLayout());
		setBackground(Color.cyan);
	// components----------------------------------
		Button b1 = new Button("click me");
		Button b2 = new Button("click me");

	//components propertyes------------------------
		b1.setPreferredSize(new Dimension(100,50));
		al al1 = new al();
		b1.addActionListener(al1);
		b2.setPreferredSize(new Dimension(100,50));
		al al2 = new al();
		b2.addActionListener(al2);

	// adding components---------------------------
		add(b1);
		add(b2);
	}
}

class al implements ActionListener{
	public void actionPerformed(ActionEvent e){
		//System.out.println(e.getSource());
		//System.out.println("ho raha h click");
		Object source = e.getSource();
	}
}

class Action_Listener{
	public static void main(String[] a){
		home f = new home();
	}
}