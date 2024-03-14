/*1] What is an inner class in Java?
Inner Class:-
- We can also create a class inside another class.
 class A
 { 
  class B
  {
  }
 }
- You can call the method of class B by using the dot operator in between both classes A and B.
 A.B obj= new B();
-  A dollar sign will be introduced in a class name that has an inner class indicating two different classes.
 A$B. class
- You also need to create an object of the outer class, to call the methods of an inner class.


*Static inner classes in Java
Static Inner Class:-
- An inner class can also be declared as static.
- When an inner class is declared as static, then you do not need to create an object for it.
- But an outer class can not be made static.


* Advantages Of inner class
- Nested classes represent a particular type of relationship that is it can access all the members of the outer class, including private.
- Nested classes make the code more readable and maintainable.
- It makes the code more optimize.*/

/* 
class A 
{
    int age;
    public void show()
    {
        System.out.println("in show");

    }

     class B            // static class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class innerclass
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B(); 
        // for static inner class
        //A.B = new A.B();
        obj1.config();

    }
}*/


/*1]What is the meaning of Anonymous?
- Anonymous means something that does not have a name.
- In overriding, to provide a new implementation of a method, we need to create a new class and extend it with the parent class. After extending the class, we override the method.
- We can avoid the overriding and do not need to create a new class for this particular task.
- We can use the inner class concept to give a new implementation of a method.

*Anonymous inner class in Java
- We can create a new anonymous inner class after creating an object of a class that contains the method.
- We do not need to use a class keyword with an anonymous inner class.
- It just starts with braces and contains the method and its new implementation.
- Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.
e.g., A obj=new A()
  {
   public void show()
   {
    new statement;
   }
  };


*Syntax of an anonymous inner class
 Anonymous class used in the interface, functional interface, lambda expressions.
- Anonymous inner class can implement only one interface at s time.
- It can either extend a class or implement an interface at a time.
- We do not write a constructor for an anonymous inner class because it does not have any class name.
- An anonymous class has access to the members of its enclosing class.


- Important points related to anonymous class

 */

 class A 
 {
    public void show()
    {
        System.out.println("in A show");
    }
 }

 public class innerclass
 {
    public static void show(String args[])
    {
        A obj = new A()
        {
            public void show()                        // anonymous class
            {
                System.out.println("in A show");
            }
        };
        
    }
 }
