package week2_book1;
import java.awt.*;

public class Butt extends Frame {
	public static void main(String[] args) {
		Butt MyBut =new Butt();
	}
	Butt(){
		Button HelloBut=new Button("Hello");
		Button ByeBut=new Button("Bye");
		add(HelloBut);
		add(ByeBut);
		setSize(300,300);
		setVisible(true);
	}
}
