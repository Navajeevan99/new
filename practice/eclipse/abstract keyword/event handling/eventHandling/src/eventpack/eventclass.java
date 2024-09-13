package eventpack;
import java.awt.*;
public class eventclass extends Frame{

eventclass()
{
	Button b=new Button("click me");
	add(b);
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(1980,1080);
	setTitle("Converter");
}
/*without inheritance we can set title using Frame f=new Frame("Converter"); and we can acces other class 
using Frame.add(b);*/
public static void main(String[] args)
{
	new eventclass();
}

}
