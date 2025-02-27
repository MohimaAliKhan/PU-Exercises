#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    char string[n+1];
    scanf("%s",string);
    int i=1;
    while(string[i]!='\0'){
        if(string[i]!=string[i-1]){
            n-=2;
            i++;
            printf("2 decrement");
        }
        i++;
    }


    printf("%d",n);

    return 0;
}
