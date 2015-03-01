#include <stdio.h>
#include <stdlib.h>

int main()
{
	long nc;
	nc = 0;
	char c;

	while((c=getchar()) != EOF)
	{
	   ++nc;
	   printf("%ld\n", nc); 
	   if(c == 'q') exit(0);
	}
}
