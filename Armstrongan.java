import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="Armstrongan" width=500 height=500> </applet> */
public class Armstrongan extends Applet implements ActionListener
{
  Label l1;
  TextField t1,t2;
  Button b1;
  public void init()
  {
      l1=new Label("Enter a number: ");
      t1=new TextField(10);
      t2=new TextField(10);
      b1=new Button("Check");
      setLayout(null);
      t2.setBounds(130,50,200,20);
add(t2);

      t1.setBounds(230,100,120,20);
add(t1);
l1.setBounds(100,100,120,20);
add(l1);
b1.setBounds(100,120,40,20);
add(b1);
      b1.addActionListener(this);
     
  }
  public void actionPerformed(ActionEvent ae)
  {
       String num1=t1.getText();
int num,r,s=0,temp;
String str1="Armstrong number";
String str2="Not armstrong number";
num=Integer.parseInt(num1);
for(temp=num;num!=0;num=num/10)
{
r=num%10;
s=s+(r*r*r);
}
if(ae.getSource()==b1)
{
if(s==temp)
{
t2.setText(str1);
}
else
{
t2.setText(str2);
}
}
}
} 