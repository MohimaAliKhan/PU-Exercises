#include<stdio.h>
int main()
{
 char ch;
 scanf("%c",&ch);
 if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
    printf ("'%c' is a character",ch);
 else if (ch>='0' && ch<='9')
     printf ("'%c' is a digit",ch);
 else
    printf ("'%c' is a special character",ch);
 return 0;
}
