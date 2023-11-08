// class calculator
// {
//     public int add(int n1,int n2)
//     {
//         int r = n1 + n2;
//         return r;

//     }
// }





// public class classes
// {
//     public static void main( String args[])
//     {
//         int num1 =9;
//         int num2 =8;
//         calculator calc = new calculator();
//         int result = calc.add(num1,num2);
//         System.out.println(result);

//     }
    
// }



//methods
// class computer
// {
//     public void playmusic()
//     {
//         System.out.println("bhupender jogi");
    
//     }

//     public String getmeapen()
//     {
//         return "pen";
//     }
// }


// public class classes
// {
//     public static void main (String args[])
//     {
//         computer obj = new computer();
//         obj.playmusic();
//         String str= obj.getmeapen();
//         System.out.println(str);
//     }
// }



//method overloading  :  multiple methods with same name but different task 
class calculator
{
    public int add (int n1,int n2,int n3)
    {
        return n1+n2+n3 ;
    }
    public int add (int n1,int n2)
    {
        return n1+n2 ;

    }
    public double add (double n1,int n2)
    {
        return n1+n2 ;
    }
}

public class classes
{
     public static void main( String args[])
     {
        int num1 =9;
         int num2 =8;
         calculator calc = new calculator();
         int result = calc.add(num1,num2);
         System.out.println(result);

     }
    }