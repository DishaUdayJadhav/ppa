#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;

    char Fname[50];

    printf("Enter the filename that you want to create:");
    scanf("%s",Fname);

    fd = creat(Fname,0777);

    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File is succefully created with fd :%d\n",fd);
    }

    return 0;
}