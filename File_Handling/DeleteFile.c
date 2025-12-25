#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;

    char Fname[50];

    printf("Enter the filename that you want to Delete:");
    scanf("%s",Fname);

    unlink(Fname);

    return 0;
}