#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int dd,mm,yy,rdd,rmm,ryy;
    scanf("%d %d %d",&rdd,&rmm,&ryy);
    scanf("%d %d %d",&dd,&mm,&yy);
    if(yy<ryy)
        printf("10000");
    else if(yy==ryy && mm<rmm)
        {
        int k= (rmm-mm)*500;
        printf("%d",k);
    }
    else if(yy==ryy && mm==rmm && dd<rdd)
        printf("%d",(rdd-dd)*15);
        else 
        printf("0");
        
    return 0;
}