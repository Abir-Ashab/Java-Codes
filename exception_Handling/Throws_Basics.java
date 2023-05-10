package exception_Handling;

public class Throws_Basics {
	static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println(e.getMessage() + " caught in main.");
        }
    }
}
