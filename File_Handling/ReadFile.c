#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd = 0, ret = 0;
    char Fname[50];
    char Buffer[50] = {'\0'};

    printf("Enter Filename  which you want to read:\n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to Open file");
    }

    ret = read(fd,Buffer,7);

    printf("%d Bytes gets read Successfully\n",ret);
    printf("Data from File is :%s\n",Buffer);

    close(fd);

    return 0;
}