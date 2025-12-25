#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;

    char Fname[50];

    printf("Enter the filename that you want to Open:");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("Unable to Open file\n");
        return -1;
    }
    else
    {
        printf("File is succefully Opened with fd :%d\n",fd);
    }

    close(fd);

    return 0;
}