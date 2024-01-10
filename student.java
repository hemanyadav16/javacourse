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

class student
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