package practicacarrito;

class Product {
	
	String NombreProducto ;
	int CantidadProducto ;
	double PrecioProducto ;
	//
	String NombreProducto2 ;
	int CantidadProducto2 ;
	double PrecioProducto2 ;
	
	String NombreProducto3 ;
	int CantidadProducto3 ;
	double PrecioProducto3 ;
	
public Product(String NombreProducto , int CantidadProducto , double PrecioProducto) {
	
	this.NombreProducto = NombreProducto;
	this.CantidadProducto = CantidadProducto;
	this.PrecioProducto = PrecioProducto;
	//
	this.NombreProducto2 = NombreProducto;
	this.CantidadProducto2 = CantidadProducto;
	this.PrecioProducto2 = PrecioProducto;
	
	this.NombreProducto3 = NombreProducto;
	this.CantidadProducto3 = CantidadProducto;
	this.PrecioProducto3 = PrecioProducto;
	
}
	
}

class ItemsCarrito extends Product {
	double PrecioItemsCarrito ;
	
public ItemsCarrito(String NombreProducto , int CantidadProducto , double PrecioProducto , double PrecioItemsCarrito ) {
	
	super (NombreProducto , CantidadProducto , PrecioProducto) ;
	
	this.PrecioItemsCarrito = PrecioItemsCarrito;
}
}



class Descuento extends ItemsCarrito {
	double Descontado;
	
public Descuento(String NombreProducto , int CantidadProducto , double PrecioProducto , double PrecioItemsCarrito , double Descontado) {
	super (NombreProducto , CantidadProducto , PrecioProducto , PrecioItemsCarrito);
	this.Descontado = Descontado;
}
}

	