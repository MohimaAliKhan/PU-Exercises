# include <stdio.h>

void largNum(int array[],int n)
{
    int larg=array[0];
    int i;
    for(i=1;i<n;i++)
    {
        if(larg<array[i])
           {
             larg=array[i];
           }

    }
    printf("The maximum value:%d\n",larg);
}

void smallNum(int array[],int n)
{
    int small=array[0];
    int i;
    for(i=1;i<n;i++)
    {
        if(small>array[i])
           {
             small=array[i];
           }

    }
    printf("The minimum value:%d\n",small);
}
int main()
{
    int n, i;
    printf("Enter the number of value:");
    scanf("%d",&n);
    int array[n];
    printf("Enter values:");
    for(i=0;i<n;i++)
    {
     scanf("%d",&array[i]);
    }
    smallNum(array,n);
    largNum(array,n);

    return 0;
}
