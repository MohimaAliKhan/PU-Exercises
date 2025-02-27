#include<stdio.h>
 int m(int num, int p )
{
    int result=1;
    for (int l=0; l<p;l++ )
    {
        result=result*num;
    }
    return result;
}


 void armstrong (int arm )
 {
     int d= arm;
     int j=arm;
     int sum=0;
     int r;
     int p;
     for(p=0;j!=0;p++)
     {
       j=j/10;
     }
     for ( ; d!=0; )
     {
         r=d%10;
         sum=sum +(m(r,p));
         d=d/10;
     }
     if (sum == arm)
      {
        printf("%d ",arm);}



 }

 int main ()
 {
     int a,b;
     printf("Enter the lower and upper limit of interval:");
     scanf("%d%d",&a,&b);
     for (int i=a;i<=b; i++ )
     {
         armstrong(i);
     }
     return 0;
 }
