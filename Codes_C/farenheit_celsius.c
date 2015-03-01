#include <stdio.h>

int main(int argc, char const *argv[])
{
	float fahr, celsius;
	float lower, upper, step;

	lower = 0;
	upper = 300;
	step = 20;

	fahr = lower;

	printf("Farenheit\t Celsius\n");
	printf("------------------------\n");

	while(fahr <= upper)
	{
		/*En realidad no es necesario escribir el .0
		* C hace conversión de int a float de forma automática
		* Ponemos el .0 para que quede más claro a ojos del programador.
		*/
		celsius = 5.0 * (fahr-32.0)/9.0; 
		printf("%3.0f\t\t%6.1f\n", fahr, celsius);
		fahr = fahr + step;
	}
	return 0;
}
