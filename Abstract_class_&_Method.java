import java.util.*;
abstract class A{
    abstract void dis();  //declaration
}
abstract class B extends A{
    void dis()                          //definition
    {
        System.out.println("abs");
    }
    abstract void show();
}
class C extends B            //concrete class---->> does not contain any abstract methods.
{
    void show()
    {
        System.out.println("abs_b");
    }
}
public class Main
{
	public static void main(String[] args) {
		C obj=new C();                //obj cannot be created for abstract class
		obj.dis();
		obj.show();
	}
}
