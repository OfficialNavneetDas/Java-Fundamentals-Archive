import java.awt.*;
class Layout extends Frame{

	Layout(){
		setVisible(true);
		setSize(600,600);
		FlowLayout l = new FlowLayout(FlowLayout.RIGHT); 
		setLayout(l);
		
		Button b[]=new Button[10];
		for(int count = 0;count<10;count++){
			b[count]= new Button(String.valueOf(count));
			b[count].setPreferredSize(new Dimension(100,100));
			add(b[count]);
		}
		
	}
}
class Flow_layout{
	public static void main(String[] a){
		Layout f = new Layout();
	}
}