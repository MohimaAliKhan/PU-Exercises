#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter the value of three tringle:");
    scanf("%d%d%d",&a,&b,&c);
    if ((a+b+c)==180)
      printf("The tringle is valid.");
    else
        printf("The tringle is not valid.");
    return 0;
}
