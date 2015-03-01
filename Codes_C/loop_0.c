#include <stdio.h>
#define SIZE 30000

int main()
{
	static int array[SIZE][SIZE];
	int i, j;

	for (i = 0; i < SIZE; i++)
	{
		for (j = 0; j < SIZE; j++)
		{
			array[i][j] = i*2;
		}
	}

	return 0;
}
