/* inheritance is a important feature through which we can copy the feature of parent class  
into chlid class

class A    // parent class

class B extends class A // child class here B copies feature of A */

/*class Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1,int n2)
    {
        return n1 - n2;
    }
    
}

class Advcalc extends Calc
{
    public int multi(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}

class Inheritance 
{
    public static void main ( String args[])
    {
        Advcalc obj = new Advcalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(5,3);
        int r3 = obj.add(6,3);
        System.out.println( r1 + " " + r2 +" " +r3);
    }
}*/

/* types of inheritance 
singlr and multilevel inheritance

class veryAdvCalc extends Advcal   // here veryAdv class copies features of Advclass and
 Advclass copies features of Calc class in indirect form this is called  multilevel inheritance */




 // method overriding

// first preference will be given to the child or own class and then it will searchin parent class

class Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2 ;
    }
}

class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1 + n2 + 1 ;
    } 
}


public class Inheritance
{
    public static void main ( String args[])
    {
        AdvCalc obj = new AdvCalc();
        int out = obj.add(3,6);
        System.out.println(out);
        
    }
}

//here add method of advcalc overrides add method of calc class



//polymorphism - many behaviour

//2 types
    // run time -- method overloding 
    // compile time -- method  overriding


// dynamic method dispatch 

class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A 
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A 
{
    public void show()
    {
        System.out.println("in C show");
    }
}


class Inheritance
{
    public static void main (String args[])
    {
        A obj = new A();
        obj.show();                           // here A obj = new B(); possible

        obj = new B();    // reference is A(we can use reference of parents) and create object of B and 
        obj.show();        // assign to parent reference variabe

        obj = new C();
        obj.show();
    }
}