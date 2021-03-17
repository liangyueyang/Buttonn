

public class LoginForm
{
    public static void main(String args[])
    {
        AbstractButton button1 =new CircleButton();
        button1.display();
        AbstractButton button2=new RectangleButton();
        button2.display();
    }
}
abstract class AbstractButton
{
    public void display()
    {
    }
}
class CircleButton extends AbstractButton
{
    public void display()
    {
        System.out.println("耶~输出了圆形按钮！");
    }
}
class RectangleButton extends AbstractButton
{
    public void display()
    {
        System.out.println("耶~输出了方形按钮！");
    }
}