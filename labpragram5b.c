#include<stdlib.h>
#include<stdio.h>
void towers(int,char,char,char);
int main()
{
    int num;
    printf("enter the number of disks :");
    scanf("%d",&num);
    printf("the sequence of moves involved in the tower of hanoiare:");
    towers(num,'A','C','B');
    return 0 ;
}

void towers(int num,char frompeg,char topeg,char anuxpeg)
{
    if(num==1)
    {
        printf("\n move disk 1 from peg %c to peg%c",frompeg,topeg);
        return;
    }
    towers( num-1, frompeg,anuxpeg, topeg);
    printf("\n move disk %d from peg %c to peg%c",num,frompeg,topeg);
    towers( num-1,anuxpeg, topeg, frompeg);
}