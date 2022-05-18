package april8friday;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part2 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) new A());
	}
	public void actionPerformed(ActionEvent arg0)
	{
	t.setText("hello world");

}
class A implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
	t.setText("");
}
}
}
