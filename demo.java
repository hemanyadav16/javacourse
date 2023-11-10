class student
{
    int rollno;
    String name;
    int marks;
}


class demo
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
    

    }
}