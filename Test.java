public class Foo
{
    publc void doFooStuff()
    {
        
    }
}
public class Bar extends Foo
{
    public void doBarStuff()
    {
        
    }
}
public class Test
{
    public static void main(String[] args) {
        Foo reallyABar = new Bar();
        Bar reallyAFoo = new Foo(); //Illegal Foo is not a subclass of Bar
    }
    
}
