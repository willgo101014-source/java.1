package sumarprecios;
import clase.Productos;
public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   int index = 0;

	        Productos[] Inventario = new Productos[4];

	        Inventario[0] = new Productos("producto1", 13, 6);
	        Inventario[1] = new Productos("producto2", 19, 3);
	        Inventario[2] = new Productos("producto3", 9, 3);
	        Inventario[3] = new Productos("producto4", 2, 3);


	     
	        for (int i = 0; i < Inventario.length; i++) {
	            if (Inventario[i] != null) {
	                Inventario[index++] = Inventario[i];
	            }
	        }

	        while (index < Inventario.length) {
	            Inventario[index++] = null;
	        }

	
	        System.out.println("Inventario después de compactar:");
	        for (Productos p : Inventario) {
	            if (p != null)
	                System.out.println(p.getNombre() + " - Precio " + p.getPrecio());
	            else
	                System.out.println("null");
	        }
	    }
	}
