/*constructor is similar as method which is used to contain the default values its syntac is similar qs of methof but return type 
 * is not mentioned
 * it doesnt return any value 
 * its name is same of class name
 * everytime when the object is created it calls the constructor*/

/*class human 
{
    private int age;
    private String name;
    
    public human()                  // default constructor
    {
        age = 12;
        name = "yadav";
    }

    public human(int a , String n)      // parameterised constructor
    {
        age = a;
        name = n;
    }
    public int getage()
    {
        return age;
    }
    
    public String getname()
    {
        return name;
    }

    public void setage(int a)
    {
        age = a ;
    }
     public void setname(String b)
     {
        name = b ;
     }

}


class constructor
{
    public static void main (String args[])
    {
        human obj = new human();
        human obj1 = new human(19,"heman");    //parameterised constructor call
        // obj.setage(11);
        // obj.setname("heman");

        System.out.println(obj.getname() + ":" + obj.getage());  // we can access the data like this 
        System.out.println(obj1.getname() + ":" + obj1.getage());
    
    }


} */



// super method 
/* this is a special method it will their in every constructor either you define or not */

/*import javax.swing.BoundedRangeModel;

class human()
{
    public human()
    {
        super();
        System.out.println("in human");
    }

    public human(int n)
    {
        super();
        System.out.println("in human int ");
    }
}

class demo extends human()
{
    public demo()
    {
        super();
        System.out.println("in b ");
    }
    
    public demo(int n)
    {
        super();
        System.out.println("in b int");
    }

}
class constructor
{
    public static void main( String args[] )
    [
        demo obj = new demo();
    ]
}*/




// camel casing
/*class and interface - Calc,Runable
variable and method - marks , show()
constants - PIE , BRAND 

showMyMarks()
MyData*/

// ananymous object : an object with no reference name 

class A 
{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in  a show");
    }
}

class constructor
{
    public static void main (String args[])
    {
        new A().show();      // ananymous object it cant be used twice or more
    }
}
