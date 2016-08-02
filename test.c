#include <stdio.h>
#include <string.h>

void reverse (char* str){
    int length = strlen(str);
    int i;
    char* end = &(str[length-1]);
    char temp;
    char* start = str;
    
    for (i=0; i<length/2; i++){
        temp = *end;
        *end--=*start;
        *start++=temp;
    }
}

int main (int argc, char **argv){
    char* str = argv[1];
    
    reverse(str);
    printf("%s\n", str);
}
