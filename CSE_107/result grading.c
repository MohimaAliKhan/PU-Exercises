#include<stdio.h>
int main()
{
    int phy,chm,mth,bio;
    float per;
    printf("Enter your physics,chemistry,math and biology marks:");
    scanf("%d%d%d%d",&phy,&chm,&mth,&bio);
    per=(phy+chm+mth+bio)/4;
    if (per<40)
        printf("Your grade=F\n Percentage=%.2f",per);
    else if(per<45)
        printf ("Your grade=E\n Percentage=%.2f",per);
    else if(per<50)
        printf ("Your grade=D\n Percentage=%.2f",per);
    else if(per<55)
        printf ("Your grade=C\n Percentage=%.2f",per);
    else if(per<60)
        printf ("Your grade=B\n Percentage=%.2f",per);
    else if(per<65)
        printf ("Your grade=A-\n Percentage=%.2f",per);
    else if(per<70)
        printf ("Your grade=A\n Percentage=%.2f",per);
    else
        printf ("Your grade=A+\nPercentage=%.2f",per);
    return 0;
}
