final class Stu
{
    final int ROLL_NO = 101;

    final void display()
    {
        System.out.println("Roll Number: " + ROLL_NO);
        System.out.println("This is a final method.");
    }
}

public class Final_Stu
{
    public static void main(String[] args)
    {
        Stu s = new Stu();
        s.display();
    }
}

    

