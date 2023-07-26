import java.util.*;
public class Tarea20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente[] clientes = new Cliente[3];
        OrdenCompra[] ordenes = new OrdenCompra[4];

        for (int i =0 ; i < 3 ; i++){
            System.out.println("Ingrese su Nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su Apellido");
            String apellido = sc.nextLine();
            clientes[i] = new Cliente(nombre, apellido);
            //iniciar orden
            System.out.println("Ingrese una descripción para la orden " + (i+1));
            ordenes[i] = new OrdenCompra(sc.nextLine());
            ordenes[i].setCliente(clientes[i]);

            for(int j = 0; j < 4; j++){
                System.out.println("Ingrese el fabricante del producto " + (j+1));
                String fabricante = sc.nextLine();
                System.out.println("Ingrese el nombre del producto "+ (j+1));
                String nombreProducto = sc.nextLine();
                System.out.println("Ingrese el precio del producto "+ (j+1));
                int precio = Integer.parseInt(sc.nextLine());

                ordenes[i].addProducto(new Producto(nombreProducto, fabricante, precio));
            }
        }

        for (OrdenCompra orden : ordenes){
            System.out.println("Orden: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getPrecioTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
        }
    }


//------------OrdenCompra-----------------------------------------------------------
class OrdenCompra{
    private final int identificador;
    private static int ultimoIdentificador;
    private int indiceProductos;

    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final Producto[] productos;

    OrdenCompra(String descripcion){
        ultimoIdentificador++;
        this.identificador = ultimoIdentificador;

        this.descripcion = descripcion;
        this.fecha = new Date();
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente c){
        this.cliente = c;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getPrecioTotal(){
        int total=0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}

//-------------Cliente--------------------------------------------------------------
class Cliente{
    private String nombre, apellido;

    Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }
}

//-------------Producto--------------------------------------------------------------
class Producto{
    private String fabricante, nombre;
    private int precio;

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    Producto(String fabricante, String nombre, int precio){
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }
}
