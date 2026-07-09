import java.awt.*;
import java.awt.event.*;
import java.lang.*;

class panel extends Panel{
	panel(int x_axis,int y_axis,int R , int G , int B ,int A){
		setPreferredSize(new Dimension(x_axis,y_axis));
		setBackground(new Color(R,G,B,A));
	}
}

class mywl implements WindowListener{
	public void windowActivated(WindowEvent ev){
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent ev){
		System.out.println("Deactivated");
	}
	public void windowOpened(WindowEvent ev){
		System.out.println("Opened");
	}
	public void windowIconified(WindowEvent ev){
		System.out.println("Iconified");
	}
	public void windowDeiconified(WindowEvent ev){
		System.out.println("Deiconified");
	}
	public void windowClosed(WindowEvent ev){
		System.out.println("Closed");
	}
	public void windowClosing(WindowEvent ev){
		System.out.println("Closing");
		ev.getWindow().dispose();
	}
}

class App extends Frame implements ActionListener{
	Label display,history;
	Font font1 , font2 ,font3;
	Panel p1,p2;
	int i,arr,restart=0,num1,num2,final_ans;
	String symbol;
	StringBuilder sb = new StringBuilder();
	App(){
		
		String lab[]={"7","8","9","*","4","5","6","-","1","2","3","+","C","0","=","/"};
		font1 = new Font("serif",Font.BOLD,20);
		font2 = new Font("serif",Font.BOLD,50);
		font3 = new Font("serif",Font.BOLD,20);

		setSize(405,625);
		setVisible(true);
		setLayout(new BorderLayout());
		
		p1 = new panel(400,150,178,225,225,225);
		p1.setLayout(null);
		display = new Label("0");
		display.setBounds(350,40,50,110);
		display.setFont(font2);
		p1.add(display);

		history = new Label("");
		history.setBounds(350,0,0,50);
		history.setFont(font3);
		p1.add(history);


		p2 = new panel(400,430,55,55,55,210);
		p2.setLayout(new GridLayout(4,4));
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		
		Button b[] = new Button[16];
		for(int i =0;i<16;i++){
			b[i] = new Button();
			b[i].setLabel(lab[i]);
			b[i].setFont(font1);
			b[i].setBackground(new Color(211,211,211,225));
			b[i].setPreferredSize(new Dimension(8,10));
			b[i].addActionListener(this);
			p2.add(b[i]);
		}
		
	}

	public void actionPerformed(ActionEvent e){
		if(restart==1){
			display.setText("0");
			display.setBounds(350,40,50,110);
			i=0;
			restart=0;
			history.setText(String.valueOf(sb.append(symbol)));
		}
		i=i+24;
		display.setBounds(350-i,40,50+i,110);


		if(e.getActionCommand()=="+" || e.getActionCommand()=="-" || e.getActionCommand()=="*" || e.getActionCommand()=="/"){
			System.out.print("operation  ");
			if(e.getActionCommand()=="+"){
				System.out.println("+");
				symbol="+";
			}
			else if(e.getActionCommand()=="-"){
				System.out.println("-");
				symbol="-";
			}
			else if(e.getActionCommand()=="*"){
				System.out.println("*");
				symbol="*";
			}
			else if (e.getActionCommand()=="/"){
				System.out.println("/");
				symbol="/";
			}
			else{
				System.out.println("invalid");
			}
		num1 = arr;
		System.out.println(num1);
		arr=0;
		display.setBounds(350,40,50,110);
		display.setText(symbol);
		restart=1;
		final_ans=0;

		history.setBounds(350-i,0,50+i,50);
		history.setText(String.valueOf(sb.append(String.valueOf(num1))));
		}
		else if(e.getActionCommand()=="C"){
			System.out.println("clear");
			num1=0;
			num2=0;
			display.setBounds(350,40,50,110);
			display.setText("0");
			restart=0;
			i=0;
			history.setBounds(350,0,0,50);
			history.setText("");
			sb.delete(0,sb.length());
		}
		else if(e.getActionCommand()=="="){
			System.out.println("ans");
			num2 =arr;
			final_ans = cal(num1,num2,symbol);
			history.setBounds(350-i,0,50+i,50);
			history.setText(String.valueOf(sb.append(String.valueOf(num2))));
			display.setBounds(0,40,400,110);
			display.setText(String.valueOf(final_ans));
			
		}
		else{
			int num=0;
			if(e.getActionCommand()=="1"){
				num=1;
			}
			else if(e.getActionCommand()=="2"){
				num=2;
			}
			else if(e.getActionCommand()=="3"){
				num=3;
			}
			else if(e.getActionCommand()=="4"){
				num=4;
			}
			else if(e.getActionCommand()=="5"){
				num=5;
			}
			else if(e.getActionCommand()=="6"){
				num=6;
			}
			else if(e.getActionCommand()=="7"){
				num=7;
			}
			else if(e.getActionCommand()=="8"){
				num=8;
			}
			else if(e.getActionCommand()=="9"){
				num=9;
			}
			else{
				num=0;
			}
		arr =cal(num,display.getText());
		display.setText(String.valueOf(arr));
		System.out.println(arr);
		}
	
	}
	
	public int cal(int num , String pre){
		int sum = Integer.parseInt(pre);
		sum = (sum*10)+num;
		return(sum);	
	}
	
	public int cal(int num1 ,int num2 ,String symbol){
		int f_ans;
		if(symbol=="+"){
			f_ans=num1+num2;
		}
		else if(symbol=="-"){
			f_ans=num1-num2;
		}
		else if(symbol=="*"){
			f_ans=num1*num2;
		}
		else{
			f_ans=num1/num2;
		}
	return(f_ans);
	}
}


class Calc{
	public static void main(String a[]){
		App c = new App();

		mywl window = new mywl();
		c.addWindowListener(window);
	}
}