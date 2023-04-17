package practicacarrito;

import java.util.Scanner;

public class CarritodeCompras {	
	

	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese que producto desea agregar al Carrito:");
		System.out.println("______________________________________________");
		System.out.println("Seleccionar: ");
		String NombreProducto1 = teclado.next();
		
		System.out.println("¿Cuantas unidades desea?");
		int CantidadProducto1 = teclado.nextInt();
		
		System.out.println("Ingrese el precio del Producto: ");
		int PrecioProducto1 = teclado.nextInt();
		
		Product compra = new Product(NombreProducto1 , CantidadProducto1 , PrecioProducto1);
		
		
		ItemsCarrito item = new ItemsCarrito(compra.NombreProducto , compra.CantidadProducto , compra.PrecioProducto , compra.CantidadProducto*compra.PrecioProducto);
		
		
		//SEGUNDO PRODUCTO
		
		System.out.println("Ingrese que producto desea agregar al Carrito:");
		System.out.println("______________________________________________");
		System.out.println("Seleccionar: ");
		String NombreProducto2 = teclado.next();
		
		System.out.println("¿Cuantas unidades desea?");
		int CantidadProducto2 = teclado.nextInt();
		
		System.out.println("Ingrese el precio del Producto: ");
		int PrecioProducto2 = teclado.nextInt();
		
		Product compra2 = new Product(NombreProducto2 , CantidadProducto2 , PrecioProducto2);
		
		
		ItemsCarrito item2 = new ItemsCarrito(compra2.NombreProducto , compra2.CantidadProducto , compra2.PrecioProducto , compra2.CantidadProducto*compra2.PrecioProducto);
		
		
		//TERCER PRODUCTO
		
		System.out.println("Ingrese que producto desea agregar al Carrito:");
		System.out.println("______________________________________________");
		System.out.println("Seleccionar: ");
		String NombreProducto3 = teclado.next();
		
		System.out.println("¿Cuantas unidades desea?");
		int CantidadProducto3 = teclado.nextInt();
		
		System.out.println("Ingrese el precio del Producto: ");
		int PrecioProducto3 = teclado.nextInt();
		
		Product compra3 = new Product(NombreProducto3 , CantidadProducto3 , PrecioProducto3);
		
		
		ItemsCarrito item3 = new ItemsCarrito(compra3.NombreProducto , compra3.CantidadProducto , compra3.PrecioProducto , compra3.CantidadProducto*compra3.PrecioProducto);
				
		
		//TOTAL PRECIO   ITEM 1+2+3
		
		System.out.println("_______________________________________________");
		System.out.println("CARRITO DE COMPRAS - TIENDA VIRTUAL");
		System.out.println("_______________________________________________");
		System.out.println("Producto: " + item.NombreProducto);
		System.out.println("Precio Unitario: $" + item.PrecioProducto);
		System.out.println("Cantidad: " + item.CantidadProducto + " Unid.");
		System.out.println("Precio: $" + item.PrecioItemsCarrito);
		System.out.println("_______________________________________________");
		
		System.out.println("Producto: " + item2.NombreProducto);
		System.out.println("Precio Unitario: $" + item2.PrecioProducto);
		System.out.println("Cantidad: " + item2.CantidadProducto + " Unid.");
		System.out.println("Precio: $" + item2.PrecioItemsCarrito);
		System.out.println("_______________________________________________");
		
		System.out.println("Producto: " + item3.NombreProducto);
		System.out.println("Precio Unitario: $" + item3.PrecioProducto);
		System.out.println("Cantidad: " + item3.CantidadProducto + " Unid.");
		System.out.println("Precio: $" + item3.PrecioItemsCarrito);
		System.out.println("_______________________________________________");
		
		
		if(item.PrecioItemsCarrito + item2.PrecioItemsCarrito + item3.PrecioItemsCarrito > 1000) {
			Descuento DescuentoCompra = new Descuento(
					item.NombreProducto,
					item.CantidadProducto,
					item.PrecioProducto,
					item.PrecioItemsCarrito,
					((item.PrecioItemsCarrito + item2.PrecioItemsCarrito + item3.PrecioItemsCarrito)*0.90)
			
				
					
			);
			
			double total = DescuentoCompra.Descontado;
			
			
			System.out.println("Precio Carrito: $" + (item.PrecioItemsCarrito + item2.PrecioItemsCarrito + item3.PrecioItemsCarrito));
			System.out.println("Descuento Aplicado del 10%: $" + (item.PrecioItemsCarrito + item2.PrecioItemsCarrito + item3.PrecioItemsCarrito)*0.10);
			System.out.println("_______________________________________________");
			System.out.println("         Total a Pagar con Descuento: $" + total);
						
		}
		
			else {
				
				
				System.out.println("Precio Carrito: $" + (item.PrecioItemsCarrito + item2.PrecioItemsCarrito + item3.PrecioItemsCarrito));
				System.out.println("No se encontraron Descuentos para Aplicar.");
				System.out.println("_______________________________________________");
				System.out.println("                       Total a Pagar: " + (item.PrecioItemsCarrito + item2.PrecioItemsCarrito + item3.PrecioItemsCarrito));
			}
		}
	

	}


