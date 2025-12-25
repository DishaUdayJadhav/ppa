#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd = 0, ret = 0;
    char Fname[50];
    char Buffer[] = "Hello World";

    printf("Enter Filename in which you want to write:\n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to Open file");
    }

    ret = write(fd,Buffer,8);

    printf("%d Bytes gets Written Successfully",ret);

    close(fd);

    return 0;
}