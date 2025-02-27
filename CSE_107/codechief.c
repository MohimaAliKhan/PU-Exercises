#include <stdio.h>

int main(void) {
	// your code goes here
	int n=1;
        for(int i=0;i<4;i++){

            for(int k=0;k<3-i;k++){
                printf(" ");
            }
            for(int j=0;j<n;j++){
                printf("*");
            }
            n+=2;
            printf("\n");
        }
        return 0;
}

