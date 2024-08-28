import java.awt.*; 
import java.awt.event.*;
public class App implements MouseListener{ 
Label lbloutput;
TextField txtOne;
TextField txtTwo;
App()
{
Frame f=new Frame();
lbloutput = new Label();
lbloutput.setBounds(20,50,100,20);
txtOne=new TextField();
txtOne.setBounds(20,80,100,20);
txtTwo=new TextField();
txtTwo.setBounds(20,110,100, 20);
f.addMouseListener(this);
f.add(lbloutput);
f.add(txtOne);
f.add(txtTwo);

f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
public void mousePressed(MouseEvent e)  {
int a=Integer.parseInt(txtOne.getText());
int b=Integer.parseInt(txtTwo.getText());
int c=a+b;
lbloutput.setText(String.valueOf(c));
}
public void mouseReleased(MouseEvent e)  {
int a=Integer.parseInt(txtOne.getText());
int b=Integer.parseInt(txtTwo.getText());
int c=a-b;
lbloutput.setText(String.valueOf(c));
}
public void mouseClicked(MouseEvent e) {

}
public void mouseEntered(MouseEvent e) {

}
public void mouseExited(MouseEvent e) {

}

public static void main(String[] args) throws Exception {
new App();
}
}
