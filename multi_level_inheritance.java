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
    int b=5;
    void ch_dis()
    {
        System.out.println("child");
    }
}
class child2 extends child{
    int z=22;
    void ch2(){
        System.out.println("child__2");
    }
}
public class Main
{
    int c=6;
	public static void main(String[] args) {
	    Main obj2=new Main();
	    System.out.println(obj2.c);
		child obj=new child();
		obj.ch_dis();
		System.out.println(obj.b);
		obj.dis();
		System.out.println(obj.a);
		child2 obj3 = new child2();
		obj3.dis();
	}
}
