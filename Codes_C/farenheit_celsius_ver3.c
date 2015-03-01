#include <stdio.h>
#define LOWER 0
#define UPPER 300
#define STEP 20

int main(int argc, char const *argv[])
{
	float fahr;
	float celsius;
	printf("Farenheit\t Celsius\n");
	printf("------------------------\n");

	for (fahr = LOWER; fahr <= UPPER; fahr = fahr+STEP)
	{
		celsius = 5.0 * (fahr-32.0)/9.0; 
		printf("%3.0f\t\t%6.1f\n", fahr, celsius);
	}
	return 0;
}