class A implements Runnable
{
    public void run()
    {
        System.out.println("Thread");
        for(int i=0;i<6;i++)
        {
            System.out.println("Thread"+i);
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        A obj1=new A();
        Thread obj=new Thread(obj1);
        obj.start();
    }
}
