class hello
{
    public static void main (String args[])
    {
        int num =7;
        //num = num +1;
        //num+=1;
        //num++;
        //++num;
        int result = num++;   //fetches first and then increments next
        int result1 = ++num;  //increments first and then fetches
    }
}



// multidimensional array

class arrays
{
    public static void main (String args[])
    {
        int nums[][] = new int[3][4];
        for (int i=0;i<3;i++)
        {
            for (int j= 0;j<4;j++)
            {
                nums[i][j]= (int)(Math.random() *10);

            }
        }

        for (int i=0;i<3;i++)
        {
            for (int j= 0;j<4;j++)
            {
                System.out.print(nums[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
