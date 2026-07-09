import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;

class Component_textfield{
	public static void main(String[] a){

	//making the frame---------------------
		Frame f =new Frame();
		f.setVisible(true);
		f.setSize(600,400);
		//RIGHT,LEFT,CENTER,LEADING,TRAILING
		FlowLayout fl = new FlowLayout(FlowLayout.LEADING);
		f.setLayout(fl);

	//TextField---------------------------
		TextField t1 = new TextField("TRY TO CHANGE IT");
		t1.setEditable(false);

		TextField t2 = new TextField();
		t2.setText("this was a empty textfield");

		TextField t3 = new TextField("this is text field 3");
		System.out.println(t3.isEditable());

		TextField t4 = new TextField("this is text field 4");
		System.out.println(t4.getText());
		
	//setting the components--------------
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);

	}
}
