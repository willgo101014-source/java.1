package HolaMundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] libros = new String[50];
        String[] autores = new String[50];
        int opcion = 0;
        int contador = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Añadir libros y autores");
            System.out.println("2. Mostrar libros disponibles");
            System.out.println("3. Buscar autor de un libro");
            System.out.println("4. Modificar autor de un libro");
            System.out.println("5. Eliminar un libro");
            System.out.println("6. Contar libros registrados");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer antes de leer texto

            switch (opcion) {
                case 1:
                    if (contador < 50) {
                        System.out.println("Ingresar el nombre del libro");
                        String libro = sc.nextLine();

                        System.out.println("Nombre del autor");
                        String aut = sc.nextLine();

                        libros[contador] = libro;
                        autores[contador] = aut;
                        contador++;

                        System.out.println("Libro añadido correctamente.");
                    } else {
                        System.out.println("Inventario lleno");
                    }
                    break;
                case 2:
                	if(contador ==0) {
                		System.out.println("No hay libros");
                	} else {
                		for(int i=0;i<contador;i++) {
                			System.out.println("libros"+ "="+ libros[i]+ "" + autores[i]);
                		}
                		case 3:
                			System.out.println("Ingresa el nombre del autor");
                			   String aut = sc.nextLine();
                			   
                			   
                	}
                	
            }

        } while (opcion != 7);

        sc.close();
    }
}

    		 
	
	

	
     
	
    		
    			 
    			 
    		
    		
    		 
    		 
    		 
    		 
    	 
    	 
     
    
     
