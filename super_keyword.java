import java.util.*;
class parent
{
    int a=10;
    void dis()
    {
        System.out.println("Parent");
    }
    parent()
    {
        System.out.println("parent const");
    }
}
class child extends parent{
    int a=5;
    child()
    {
        System.out.println("child const");
    }
    void dis()
    {
        super.dis();
        System.out.println("child");
        System.out.println(super.a);
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
