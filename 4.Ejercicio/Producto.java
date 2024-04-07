public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private String color;
    private double precioCompra;
    private double precioVenta;
    private double descuentoMaximo;
    private int unidadesExistencia;
    private String metrica;
    private String categoria;

    public Producto(String codigo, String nombre, String marca, String color, double precioCompra, double precioVenta, double descuentoMaximo, int unidadesExistencia, String metrica, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.descuentoMaximo = descuentoMaximo;
        this.unidadesExistencia = unidadesExistencia;
        this.metrica = metrica;
        this.categoria = categoria;
    }

    // Métodos getter y setter para cada atributo
}

public class Compra {
    private String consecutivo;
    private String fecha;
    private String proveedor;
    private String codigoProducto;
    private double precioCompra;
    private int cantidad;
    private double valorPagarSinIVA;
    private double valorPagarIVA;
    private double valorTotalPagar;

    public Compra(String consecutivo, String fecha, String proveedor, String codigoProducto, double precioCompra, int cantidad, double valorPagarSinIVA, double valorPagarIVA, double valorTotalPagar) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.codigoProducto = codigoProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.valorPagarSinIVA = valorPagarSinIVA;
        this.valorPagarIVA = valorPagarIVA;
        this.valorTotalPagar = valorTotalPagar;
    }

    // Métodos getter y setter para cada atributo
}

public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String genero;
    private String fechaNacimiento;
    private String numeroTelefono;
    private String email;
    private String direccion;
    private String estado;

    public Cliente(String cedula, String nombre, String apellido1, String apellido2, String genero, String fechaNacimiento, String numeroTelefono, String email, String direccion, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
    }

    // Métodos getter y setter para cada atributo
}

public class Venta {
    private String consecutivo;
    private String fecha;
    private String cedulaCliente;
    private String medioPago;
    private String modalidad;
    private String codigoProducto;
    private double precioVenta;
    private int cantidad;
    private double valorDescuento;
    private double valorCobrarSinIVA;
    private double valorCobrarIVA;
    private double valorTotalCobrar;

    public Venta(String consecutivo, String fecha, String cedulaCliente, String medioPago, String modalidad, String codigoProducto, double precioVenta, int cantidad, double valorDescuento, double valorCobrarSinIVA, double valorCobrarIVA, double valorTotalCobrar) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.codigoProducto = codigoProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.valorDescuento = valorDescuento;
        this.valorCobrarSinIVA = valorCobrarSinIVA;
        this.valorCobrarIVA = valorCobrarIVA;
        this.valorTotalCobrar = valorTotalCobrar;
    }

    // Métodos getter y setter para cada atributo
}

public class Negocio {
    private NuevaLista<Producto> productos;
    private NuevaLista<Compra> compras;
    private NuevaLista<Cliente> clientes;
    private NuevaLista<Venta> ventas;

    public Negocio() {
        productos = new NuevaLista<>();
        compras = new NuevaLista<>();
        clientes = new NuevaLista<>();
        ventas = new NuevaLista<>();
    }

    // Métodos para gestionar los productos, compras, clientes y ventas
}

public class Main {
    public static void main(String[] args) {
        Negocio negocio = new Negocio();

    }
}

    
}
