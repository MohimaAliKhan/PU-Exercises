#include<stdio.h>
int main()
{
    int num,first,N,last,d,swap=0;
    printf("Enter the number:");
    scanf("%d",&num);
    d=1;
    last=num%10;
     first=num;
    while (N!=0)
    {
        d=d*10;
        first=first/10;
        N=first/10;
    }
    swap=(last*d)+((((num%d)/10)*10)+first);
    printf("First number=%d and Last number=%d\n Swap number=%d",first,last,swap);

    return 0;
}
