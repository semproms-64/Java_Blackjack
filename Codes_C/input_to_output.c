#include <stdio.h>
#include <stdlib.h>
#include <stdio.h>


int main(int argc, char const *argv[])
{
	int c;

	while((c = getchar()) != EOF)
	{
		putchar(c);
		printf("%d\n", EOF);
		if (c == 'q')
		{
			exit(0);
		}
	}
	return 0;
}