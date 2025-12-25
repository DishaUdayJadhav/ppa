#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd = 0, ret = 0;
    char Fname[50];
    char Buffer[] = "India is My country I love India";

    printf("Enter Filename in which you want to write:\n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("Unable to Open file");
    }

    ret = write(fd,Buffer,25);

    printf("%d Bytes gets Written Successfully",ret);

    close(fd);

    return 0;
}