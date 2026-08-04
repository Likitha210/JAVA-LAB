public class Variable{
    int instanceVar = 10;
    static String staticVar = "I am static";
    public void showVariables()
    {
        int localVar = 5;
        System.out.println("Instance Variable :"+instanceVar);
        System.out.println("Static Variable :"+staticVar);
        System.out.println("Local Variable :"+localVar);
    }
    public static void main(String[] args)
    {
        Variable obj1 = new Variable();
        obj1.showVariables
        ();
        System.out.println("Accessing Static Variable via class :"+Variable.staticVar);
    }
}
