class mobile 
{
    String  brand;
    int price;
    String name;

    public void show()
    {
        System.out.println(brand +":"+price+":"+name);
    }

}

class student
{
    public static void main(String args[])
    {
        mobile obj1= new mobile();
        obj1.brand= "apple";
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