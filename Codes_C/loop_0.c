#include <stdio.h>
#define SIZE 30000

int main()
{
	static int array[SIZE][SIZE];
	int i, j;

	for (i = 0; i < SIZE; ++i)
	{
		for (j = 0; i < SIZE; ++i)
		{
			array[i][j] = i*2;
		}
	}

	return 0;
}