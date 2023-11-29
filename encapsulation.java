class human 
{
    private int age;
    private String name;

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


class encapsulation 
{
    public static void main (String args[])
    {
        human obj = new human();
        obj.setage(11);
        obj.setname("heman");

        System.out.println(obj.getname() + ":" + obj.getage());
    }

}