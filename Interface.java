/* 
- Methods in java
- What is an interface?
- Need for an interface


 #1
- We can also pass an object as a parameter in a method.
- When you build an application, you need to make it more flexible.
- We can create a reference of the parent class and an object of the sub-class.
- Passing reference and the reference of an object that you accept in a method, both should be the same.

#2 
Interface:-
- Interface in Java is used to achieve abstraction.
- Interface is used to design an application to make it loosely coupled.
- implements keyword is used with a class to extend it to an interface
 interface Computer
 {
 }
.........
 class Desktop implements Computer
 { 
  statement;
 }


#3
Need of an Interface:-
- It is used to implement abstraction.
- We can also achieve multiple inheritance in Java, by using the interface.
- Any class can extend only 1 class but can any class implement an infinite number of interface.
- It is also used to achieve loose coupling

*/


/* interface computer
{
    void code();
}

class laptop implements computer 
{
    public void code()
    {
        System.out.println("coding");
    }
}

class desktop implements computer 
{
    public void code()
    {
        System.out.println("coding ,faster");

    }
}

class developer
{
    public void devapp(computer lap)
    {
        lap.code();
    }
}

public class Interface{
    public static void main (String args[])
    {
        developer heman = new developer();
        computer lap = new laptop();
        computer desk = new desktop();

        heman.devapp(lap);
        heman.devapp(desk);
    }
}
*/

/* 
- What is an interface in java?
- Use of interface
- implements keyword in an interface
- Variables in an interface 

#1
Interface:-
In an abstract class, we can have both abstract methods as well as normal or concrete methods.
- If your class has only abstract methods then instead of using class, you can simply use an interface in place of it.
- Interface is not any class.
- Every method in an interface is public and abstract by default.
- Even if you do not use two keywords (public and abstract) with methods then also it will not give an error in an interface. By default, it will consider all methods as public and abstract.
- We cannot instantiate an interface.
- Interface only shows the design and it does not provide any implementation.
- To provide an implementation of methods, you need to create a class and instantiate it also.
e.g,
 interface A
 {
  methods()----
 }

#2
implements keyword:-
To implement an interface, we use the keyword - implements.
- If you use the implements keyword with class, then it is compulsory to give an implementation of all the methods that are defined in an interface.
- If you do not give an implementation of all methods then it will make your class an abstract class by default.
- So, to make a concrete class, you have to give the implementation of all methods present in an interface.
e.g., 
 class B implements A
 {
  methods() {
   statement;
  }
  ------
 }

#3
Variables in an interface:-
- We can call the methods of an interface by creating an object of the class that implements an interface.
- We can also declare variables in an interface.
- All the variables in an interface are final and static by default.
- So, we first have to initialize the variables in an interface.
- As a variable is static in an interface, then you do not need to create an object for it. You can directly call the variable by using the interface name.
e.g., A.area;    (here, area is a variable initialized in an interface)
- As the variable is final, you can not change the value of that variable after initializing it once.

-Interface does not have its own memory in the heap.
*/



interface A{
    void show();
    void config();

}

class B implements A 
{
    public void show()
    {
        System.out.println("showcase");
    }
    public void config()
    {
        System.out.println("configuring");
    }


}

public class Interface 
{
    public static void main (String args[])
    {
        A obj = new B();
        obj.show();
        obj.config();
    }
}