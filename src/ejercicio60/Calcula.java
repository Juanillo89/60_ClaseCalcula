package ejercicio60;

/**
 * @author Xuan
 */
public class Calcula
{
	
	public static int mayor(int ... num)
	{
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if(num[i] > mayor)
			{
				mayor = num[i];
			}
		}
		return mayor;
	}

	public static double mayor(double ... num)
	{
		double mayor = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if(num[i] > mayor)
			{
				mayor = num[i];
			}
		}
		return mayor;
	}

	public static String mayor(String ... cadena)
	{
		String mayor = "";
		for (int i = 0; i < cadena.length; i++)
		{
			if(cadena[i].length() > mayor.length())
			{
				mayor = cadena[i];
			}
		}
		return mayor;
	}

	public static int menor(int ... num)
	{
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if(num[i] < menor)
			{
				menor = num[i];
			}
		}
		return menor;
	}

	public static double menor(double ... num)
	{
		double menor = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++)
		{
			if(num[i] < menor)
			{
				menor = num[i];
			}
		}
		return menor;
	}

	public static String menor(String ... cadena)
	{
		int tam = Integer.MAX_VALUE;
		String menor = "";
		for (int i = 0; i < cadena.length; i++)
		{
			if(cadena[i].length() < tam)
			{
				menor = cadena[i];
				tam = cadena[i].length();
			}
		}
		return menor;
	}
}