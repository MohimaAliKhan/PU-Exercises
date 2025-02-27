#include<stdio.h>

void primeNumber(int num)
{
    int i;
    int rem;

    for (i=2;i<num; )
    {
        rem=num%i;
        if(rem==0)
        {
            printf("%d is not a prime number.",num);

            return;
        }
        else
        {
            i++;
        }
    }
     printf("%d is a prime number.",num);
}


int main()
{
    int Num;
     printf("Enter a number to check prime:");
     scanf("%d",&Num);
     primeNumber(Num);
     return 0;
}
