#include <stdio.h>

int main()
{
    int t,n;

    scanf("%d",&t);
    for(int i=0;i<t;i++){
        scanf("%d",&n);
        int a[n];
        for(int j=0;j<n;j++){
          scanf("%d",&a[j]);
        }
        for(int j=1;j<n;j++){
          a[j]=a[j]-a[j-1];
        }
        printf("%d\n",a[n-1]);

    }


    return 0;
}
