// Online C compiler to run C program online
#include <stdio.h>

int main() {

    int a,s,i=0;
    s=0;
    a=0;
    char str1 [100];
    char str2 [100];
    scanf("%s",str1);
    scanf("%s",str2);
    while (str1[i]!='\0') {
      if(str1[i]-str2[i]==0)
    {
       s=0;
      printf("1\n");
    }
    else if(str1[i]<='Z'&& str2[i]<='Z')
    {
         if(str1[i]-str2[i]<0)
         {
          s=-1;
           printf("2\n");
          break;
          }
        else
         {
          s=1;
           printf("3\n");
           break;
          }
    }


    else if(str1[i]>='a'&& str2[i]>='a')
    {
         if(str1[i]-str2[i]<0)
         {
          s=-1;
           printf("4\n");
          break;
          }
        else
         {
          s=1;
           printf("5\n");
           break;
          }
    }

    else
    { if(str1[i]-str2[i]<0) {
        a = str1[i]+32-str2[i];
        if(a==0)
        { s=0;
         printf("6\n");
        }
        else
        { s=-1;
             break;
              printf("7\n");
        }
       }
       else
       { a = str2[i]+32-str1[i];
        if(a==0)
        { s=0;
             printf("8\n");
        }
        else
        { s=1;
         printf("9\n");
             break; }
       }
       i++;

    }
     printf("Ans:%d\n",s);
    return 0;
   }
}
