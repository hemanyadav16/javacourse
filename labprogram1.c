#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
struct day{
    char*dayname ;
    int date;
    char*activity;

};
int numdays =7;
int i ;
struct day*calender;
void read()
{
    char*dn;
    char*da;
    int dd;
    for(i=0;i<numdays;i++)
    {
        printf("enter the day name : ");
        scanf("%s ",dn);
        (calender+i)->dayname=strdup(dn);
        printf("enter date :");
        scanf( " %d ",&dd);
        (calender + i)->date = dd;
        printf("enter the day activity: ");
        scanf("%s ",da);
        (calender + i)->activity = strdup(da);
        

    }
}

void dispaly()
{
    for (i=0;i<numdays;i++)
    {
        printf("day %d(%s) :%s \n",(calender+i)->date,(calender+i)->dayname,(calender+i)->activity);
       
    }
}

void create()
{
    struct day*calender = (struct day*)malloc(numdays*sizeof(struct day));
     if(calender == NULL)
    {
        printf("memory allocation failed");    
    }
}


void main()
{
    create();
    read();
    dispaly();
    free(calender);
    getch();
}