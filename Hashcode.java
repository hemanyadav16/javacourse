class Laptop
{
    int prize;
    String name;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + prize;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (prize != other.prize)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}

class Hashcode
{
    public static void main (String args[])
    {
        Laptop obj1 = new Laptop();
        obj1.prize=1000;
        obj1.name= "lenova";

        Laptop obj2 = new Laptop();
        obj2.prize=1000;
        obj2.name= "lenova";
        
        System.out.println(obj1.equals(obj2));       
        

    }
}




// upcasting and downcasting

class A 
{
    public void show1()
    {
        System.out.println("in A show");
    }

}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }

}
 class Hashcode
 {
    public static void main (String args[])
    {
        A obj = new B();  // upcasting
        obj.show1();
        // obj.show2(); not possible
        B obj1 = (B) obj;
        obj1.show2();
    }
 }