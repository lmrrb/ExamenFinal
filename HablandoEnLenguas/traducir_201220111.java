/**
 * @(#)traducir_201220111.java
 *
 *
 * @author 
 * @version 1.00 2014/5/18
 */
import java.io.*;

public class traducir_201220111 {

    public traducir_201220111() {
    }
    
    public void hablar(String dir)
    {
    	letras_201220111 letra = new letras_201220111();
    	String direccion=dir;
    	String ndireccion;
    	
    	try
    	{
    		File lectura = new File(direccion);
	    	BufferedReader entrada = new BufferedReader(new FileReader(lectura));
			String caracter; 
			String linea;
			String ndir;
			int cont=1;
			ndireccion = generardir(direccion);
			File salida = new File(ndireccion);
			FileWriter fw = new FileWriter (salida,true);
    		BufferedWriter bf = new BufferedWriter(fw);
    		PrintWriter MyWriter = new PrintWriter(bf);
			
			while(entrada.ready())
			{
				linea = entrada.readLine();
				while ((caracter = linea) != null)
				{ 
					System.out.print("Caso #"+cont+": ");
					MyWriter.print("Caso #"+cont+": ");
					for (int i = 0; i < caracter.length(); i++)
					{
						char x=caracter.charAt(i);
						String y= (new StringBuffer().append(x)).toString();
						System.out.print(letra.buscar(y));
						MyWriter.print(letra.buscar(y));
						
						if (i==caracter.length()-1)
						{
							linea=null;
							cont++;
						}
					}
					System.out.println("");
					MyWriter.println("");
					
				}
			}
			MyWriter.close ();
    		bf.close();
    		System.out.println("");
    		System.out.println("en esta direccion se creo el archivo: HablandoEnLenguas_201220111");
    		System.out.println(ndireccion);
    	}
    	catch(Exception e)
    	{
    	}
    	 
    }
    
    public static  String generardir(String direccion)
    {
    	String ndireccion="";
    	String z="";
    	String ndir="";
    	char [] adir;
    	char w;
    	int y=-1;
    	String car="/";
    	
    	adir= direccion.toCharArray();
    	
    	for (int x=direccion.length()-1;x>=0;x--)
    	{
    		w=adir[x];
    		z=(new StringBuffer().append(w).toString());
    		if(car.equals(z))
    		{
    			y=x;
    			break;
    		}
    	}
    	
    	for(int a=0;a<=y;a++)
    	{
    		w=adir[a];
    		z=(new StringBuffer().append(w).toString());
    		ndireccion = ndireccion +z;
    	}
    	ndir=ndireccion+"HablandoEnLenguas_201220111.txt";
    	return (ndir);
    }//fin generardir
    
    
    
}