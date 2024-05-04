#include<stdio.h>
int s=0,i=1;
    while(i<=n)
    {
        if(i%3==0 || i%5==0 || i%7==0)
            s+=i;
        i++;
    }
    return s;
    