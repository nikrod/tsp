import java.util.*;

public class menu {
	
	public static void main (String args [])
	{
		System.out.println("ingrese cantidad de ciudades");
		Scanner leer=new Scanner(System.in);
		int n=leer.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("ciudad N°");
			System.out.println(i+1);
			System.out.println("ingrese valor de x");
			int x=leer.nextInt();
			System.out.println("ingrese valor de y");
			int y=leer.nextInt();
			ciudad aux=new ciudad(x,y,n);
			ArrayList<ciudad> ciudades = new ArrayList<ciudad>();
			ciudades.add(aux);
		}
		leer.close();
		
		
	}
	
}
