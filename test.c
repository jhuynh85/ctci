#include <stdio.h>
#include <string.h>

/* 1.2 Function for reversing a string in place */
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

/* 1.4 Function that replaces whitespace with %20 */
void replace (char* str){
	int count=0;
	int i;
	
	for (i=0; i<strlen(str); i++){
		if (str[i]==' ') count++;
	}
	
	int finalLength = strlen(str)+(count*2);
	str[finalLength--]='\0';
	
	for (i=strlen(str)-1; i>=0; i--){
		if(str[i]==' '){
			str[finalLength--]='0';
			str[finalLength--]='2';
			str[finalLength--]='%';
		} else {
			str[finalLength--]=str[i];
		}
	}
}

int main (int argc, char **argv){
    char str[30] = "Mr John Smith   ";
    
  	replace(str);
    printf("%s\n", str);
}
