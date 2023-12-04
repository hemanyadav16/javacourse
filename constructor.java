/*constructor is similar as method which is used to contain the default values its syntac is similar qs of methof but return type 
 * is not mentioned
 * it doesnt return any value 
 * its name is same of class name
 * everytime when the object is created it calls the constructor*/

class human 
{
    private int age;
    private String name;
    
    public human()
    {
        age = 12;
        name = "yadav";
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
        // obj.setage(11);
        // obj.setname("heman");

        System.out.println(obj.getname() + ":" + obj.getage());  // we can access the data like this 
    }


}
