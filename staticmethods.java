// variables     static variables and static methods
class mobile 
{
    String  brand;     //instance variable 
    int price;
    String name;                    // if static keyword is used then it is know static variable/

    public void show()
    {
        System.out.println(brand +":"+price+":"+name);
    }

}

class arrays
{
    public static void main(String args[])
    {
        mobile obj1= new mobile();
        obj1.brand= "apple";                // if described inside main fun then it is called as local variable 
        obj1.price=1200;
        obj1.name ="smartphone";

        mobile obj2 = new mobile();
        obj2.brand ="samsung";
        obj2.price = 1000;
        obj2.name = "smartphone";
    

       obj1.show();
       obj2.show();


    }
    
}



//new one
// 28-11-2023
// static method : no need to create an object on an main method
class mobile 
{
    String  brand;     //instance variable 
    int price;
    String name;                    // if static keyword is used then it is know static variable/

    public void show()
    {
        System.out.println(brand +":"+price+":"+name);
    }
    public static void show1(mobile 0bj)
    {
        System.out.println(obj.brand +":"+obj.price+":"+obj.name);
    }

}

class arrays
{
    public static void main(String args[])
    {
        mobile obj1= new mobile();
        obj1.brand= "apple";                // if described inside main fun then it is called as local variable 
        obj1.price=1200;
        obj1.name ="smartphone";

        mobile obj2 = new mobile();
        obj2.brand ="samsung";
        obj2.price = 1000;
        obj2.name = "smartphone";
    

       obj1.show();
       obj2.show();

       mobile.show1(obj1);   // here method is called with the help of class name without creating the object


    }
    
}
