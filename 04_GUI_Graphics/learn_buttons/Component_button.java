import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

class home extends Frame{

	Button b1;
	Button b2;	

	home(){


	//home layout ------------------------
		setSize(600,300);
		setVisible(true);
		setLayout(new FlowLayout());

	//buttons-----------------------------
		b1 = new Button();
		b2 = new Button("string");
		Button b3 = new Button();

	//button_methods---------------------
		b3.setLabel("thid is a method");
		System.out.println(b2.getLabel());
		b1.setPreferredSize(new Dimension(200,50));
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.CYAN);
		b3.setEnabled(false);
		b1.setVisible(true);
		// b1.show(true);

	// setting components-----------------
		add(b1);
		add(b2);
		add(b3);
	}
}
class Component_button{
	public static void main(String[] a){
		home j = new home();

	}
}