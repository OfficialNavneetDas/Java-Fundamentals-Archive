import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class mywl implements WindowListener{
	public void windowActivated(WindowEvent w){}
	public void windowDeactivated(WindowEvent w){}
	public void windowOpened(WindowEvent w){}
	public void windowIconified(WindowEvent w){}
	public void windowDeiconified(WindowEvent w){}
	public void windowClosed(WindowEvent w){}
	public void windowClosing(WindowEvent w){
		w.getWindow().dispose();
	}
}

class blackBar extends JPanel{
	blackBar(int width,Color x){
		setLayout(null);
		setPreferredSize(new Dimension(1400,width));
		setBackground(x);	
	}
}

class sc extends JFrame{
	blackBar panel1,panel2;
	String nav_elements[] ={"Home","Opps","DSA","decsret","Contact","Info","@ Navneet_das","@ kiran_saklani"};
	JButton nav[] = new JButton[6];
	int margen_left=50;
	JLabel copyRight[] = new JLabel[2];
	Color blue = new Color(204,229,255);
	Color blue2 = new Color(51,153,225);

	sc(){
		setSize(1400,800);
		setLayout(new BorderLayout(20,15));
		setLocation(-10,0);
		setVisible(true);

		panel1 = new blackBar(50,blue2);
		panel2 = new blackBar(100,Color.BLACK);

		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);


		for(int i=0;i<6;i++){
			nav[i] = new JButton(nav_elements[i]);
			nav[i].setBounds(margen_left,0,170,50);
			margen_left+=210;
			nav[i].setBackground(blue);
			panel1.add(nav[i]);
		}
		for(int i=0;i<2;i++){
			copyRight[i] = new JLabel(nav_elements[i+6]);
			copyRight[i].setFont(new Font("serif",Font.BOLD,15));
			copyRight[i].setForeground(Color.white);
			copyRight[i].setBounds(600,15*(i+1),200,50);
			panel2.add(copyRight[i]);
		}


	}
}
class Home{
	public static void main(String[] a){
		sc sc1 = new sc();
		sc1.addWindowListener(new mywl());
	}
}