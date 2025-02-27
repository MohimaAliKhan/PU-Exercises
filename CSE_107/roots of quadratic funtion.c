#include <stdio.h>
#include<math.h>
int main()
{
    float a,b,c;
    printf("Enter co-eficiant of x2,x and the constant term:");
    scanf("%d%d%d",&a,&b,&c);
    float D=(b*b)-(4*a*c);
    float r1=(-b+sqrt(D))/(2*a);
    printf("Root1:%d",r1);
    return 0;

}
