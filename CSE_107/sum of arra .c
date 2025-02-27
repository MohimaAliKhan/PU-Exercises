#include<stdio.h>
int main()
{
    int n,i,max=0,min=0;

    int array[100];
    printf("\nEnter the value of array:");
     for (i=0;i<100;i++)
    {
        scanf("%d",&array[i]);
    }
    for (i=0;i<=n;i++)
    {
        if (max<array[i])
        {
            max=array[i];
        }
        else
        {
            max=max;
        }
    }
       printf("\nThe maximum value is %d",max);
       min=array[0];

    for (i=0;i<n;i++)
    {
        if (min>array[i])
        {
            min=array[i];
        }
        else
        {
            min=min;
        }
    }
     printf("\nThe minimum value is %d",min);
    return 0;

}
