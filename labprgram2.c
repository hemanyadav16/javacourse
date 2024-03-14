#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main()
{
    char str[100],pat[100],rep[100],ans[100];
    int i,j,c,m,k,flag=0;
    printf("enter the main string");
    gets(str);
    printf("enter the pattern string");
    gets(pat);
    printf("enter the replade string");
    gets(rep);
    i=c=m=j=0;
    while(str[c]!='\0')
    {
        if(str[m]==pat[i])
        {
            i++;
            m++;
            flag=1;
            if(pat[i]=='\0')
            {
                for(k=0;rep[k]!='\0';k++,j++)
                {
                    ans[j]= rep[k];
                }
                i=0;
                c=m;
            }

        }
        else{
            ans[j]= str[c];
            j++;
            c++;
            m=c;
            i=0;
        }
    }
    if(flag==0)
    {
        printf("entered pattern doesnt exist");

    }
    else{
        ans[j]== '\0';
        printf("the resultant string is :%s",ans);
    }
}