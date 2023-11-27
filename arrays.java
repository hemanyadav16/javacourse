// class arrays 
// {
//     public static void main (String args[])
//     {
//         int num[]={0,3,5,9,};
//         for (int i=0;i<4;i++)
//         {
//             System.out.println(num[i]);
//         }

//     }
    
// }    


// multidimensional array

// class arrays
// {
//     public static void main (String args[])
//     {
//         int nums[][] = new int[3][4];
//         for (int i=0;i<3;i++)
//         {
//             for (int j= 0;j<4;j++)
//             {
//                 nums[i][j]= (int)(Math.random() *10);

//             }
//         }

//         for (int i=0;i<3;i++)
//         {
//             for (int j= 0;j<4;j++)
//             {
//                 System.out.print(nums[i][j] + " ");
                
//             }
//             System.out.println();
//         }
//     }
// }



//jagged arrays : no of columns not fixed 

// class arrays
//  {
//     public static void main (String args[])
//     {
//         int nums[][] = new int[3][];
//         nums[0]= new int [3];
//         nums[0]= new int [3];
//         nums[0]= new int [3]; 

//         for ( int i =0;i<nums.length;i++)
//         {
//             for (int j =0;j<nums[i].length; j++)
//             {
//                 nums[i][j] = (int)(Math.random() *10)
//             }
//         }

//         for (int n[]: nums)
//         {
//             for (m:n)
//             {
//                 System.out.print(n + " ")
//             }
//             System.out.println()
//         }
        
//     }
//  }



class student
{
    int rollno;
    String name;
    int marks;
}


class arrays
{

    public static void main (String args[])
    {
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "hemzz";
        s1.marks = 84;
    

        student s2 = new student();
        s2.rollno= 1;
        s2.name= "hemzz";
        s2.marks= 87;
    
        student s3 = new student();
        s3.rollno= 1;
        s3.name= "hemzz";
        s3.marks= 97;
    
        student students[] = new student[3];
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;

        for (int i =0 ; i<students.length; i++)
        {
            System.out.println(students[i].name + ":" + students[i].marks);
        }
        //or
        for (student stud: students)
        {
            System.out.println(stud.name + ":" + stud.marks);

        }
    

    }
}



//enhanced for loop only for array as if now

class arrays
{
    public static void main (String args[])
    {
        int nums[4] = {1,9,7,5}
        for (int n : nums)
        {
            System.out.println(n)
        }
    }
}

