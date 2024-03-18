#include<stdio.h>
#include<stdlib.h>
int stack[6],rev[6];
int top=-1,k=0;
int size;
void push()
{
    int num;
    if(top== size-1)
    {
        printf("stack overflow \n");
    }
    else
    {
        printf("enter the number to be pushed \n");
        scanf("%d",&num);
        top++;
        stack[top]=num;
    }
}

void pop()
{
    int num;
    if(top==-1)
    {
        printf("stack underflow\n");
    }
    else{
        num=stack[top];
        printf("popped element is %d \n",num);
        top--;

    }
}

void display()
{
    int i;
    if(top==-1)
    {
        printf("stack underflow\n");
    }
    else 
    {
        printf("contents");
        for(i=top;i>=0;i--)
        {
            printf("%d\n",stack[i]);
            rev[k++]=stack[i];
        }
    }
}

int pali()
{
    int i ,flag = 1;
    for (i=top;i>=0;i--)
    {
        if(stack[i]!=rev[--k])
        {
            flag=0;
        }
    }
    return flag;
}

void main()
{
    int choice ,f ;
    printf("enter the size for stack \n");
    scanf("%d",&size);
    printf("1.push\n 2.pop \n 3.display \n 4.check for palindrome\n 5.exit");
    while(1)
    {
        printf("enter the choice :");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1 : push();
            break;
            case 2 : pop();
            break;
            case 3 : display();
            break;
            case 4: f=pali();
            if(f==1)
            {
                printf("its palindrome");
            }
            else{
                printf("not palindrome");

            }
            break;
            case 5 : exit(0);
            default : printf("invalid choice");
        }
    }
}