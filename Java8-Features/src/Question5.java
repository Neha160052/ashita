// Q5 Implement multiple inheritance with default method inside interface.

interface Interface1
{
    default void display()
    {
        System.out.println("Interface1");
    }
}

interface Interface2
{
    default void display()
    {
        System.out.println("Interface2");
    }
}

public class Question5 implements  Interface1, Interface2{

    public static void main(String[] args) {
            Question5 d = new Question5();
            d.display();
    }

    @Override
    public void display() {
        System.out.println("Multiple Inheritance");
    }
}
