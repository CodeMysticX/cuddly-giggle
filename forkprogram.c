#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int main(){
      int eve_sum =0;
      int odd_sum =0;
      pid_t q=fork();
      for(int i=1; i<=100; i++){
        if(q==0){
            if(i%2==0){
                sleep(1);
                eve_sum+=i;
            printf("Even number = %d\n",i);
            }
        }
        else if(q<0)
        {
            printf("Error!");
        }
        else{
            if(i%2!=0){
                sleep(1);
            printf("Odd number = %d\n",i);
            odd_sum+=i;
            }
        }
      }
      printf("Even number sum = %d\n",eve_sum);
      printf("Odd number sum = %d\n",odd_sum);
}
