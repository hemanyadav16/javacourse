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

class arrays
 {
    public static void main (String args[])
    {
        int nums[][] = new int[3][];
        nums[0]= new int [3];
        nums[0]= new int [3];
        nums[0]= new int [3]; 

        for ( int i =0;i<nums.length;i++)
        {
            for (int j =0;j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() *10)
            }
        }

        for (int n[]: nums)
        {
            for (m:n)
            {
                System.out.print(n + " ")
            }
            System.out.println()
        }
        
    }
 }