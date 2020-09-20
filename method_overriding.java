import java.util.*;
class parent
{
    int a=10;
    void dis()
    {
        System.out.println("Parent");
    }
}
class child extends parent{
    int a=5;
    void dis()
    {
        super.dis();
        System.out.println("child");
    }
}
public class Main
{
    int a=44;
	public static void main(String[] args) {
	    child obj=new child();  
	    obj.dis();
	}
}
