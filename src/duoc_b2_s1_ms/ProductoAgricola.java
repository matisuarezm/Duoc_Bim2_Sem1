package duoc_b2_s1_ms;

/**
 *
 * @author msuarez
 */
public class ProductoAgricola {
    
    //Atributos privados
    private String codigo;
    private String nombre;
    private int cantidad;
    private String unidadDeMedida;
    private double precio;
    private String grupo;
    private String fechaVencimiento;    
    private boolean esExportable;
    
    
    //Constructor sin Parametros (datos por defecto)
    public ProductoAgricola(){
    
        this.codigo = "COD000";
        this.nombre = "nombre";
        this.cantidad = 1;
        this.unidadDeMedida = "KG";
        this.precio = 0.0;
        this.grupo = "Por Definir";
        this.fechaVencimiento = "01-01-1900";
        this.esExportable = false;
    }
    
    //Constructor con parametros (Se piden al crear el objeto)
    public ProductoAgricola(String codigo, String nombre, int cantidad, String unidadDeMedida, double precio, String grupo,String fechaVencimiento, boolean esExportable){
    
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
        this.precio = precio;
        this.grupo = grupo;        
        this.fechaVencimiento = fechaVencimiento;
        this.esExportable = esExportable;
    }
    
    //Getter    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getGrupo(){
        return grupo;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String getUnidadDeMedida(){
        return unidadDeMedida;
    }
    
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public boolean getEsExportable(){
        return esExportable;
    }
    
    //Setters
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio){
        if (precio < 0) {
            System.out.println("El valor no puede ser negativo");
            this.precio = 0;
        }else{
            this.precio = precio;
        }
    }
    
    public void setGrupo(String grupo){
       this.grupo = grupo;
    }
    
    public void setCantidad(int cantidad){
        if (cantidad <= 0) {
            System.out.println("Debe ingresar una cantidad válida");
        }else{
            this.cantidad = cantidad;        
        }
    }
    
    public void setUnidadDeMedida(String unidadDeMedida){
        this.unidadDeMedida = unidadDeMedida;
    }
    
    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void setEsExportable(boolean esExportable){
        this.esExportable = esExportable;
    }

    @Override
    public String toString() {
        return String.format("Producto Agricola : %n- Código = %s %n- Nombre = %s %n- Precio = %.2f %n- Grupo = %s "
                + "%n- Cantidad = %d %n- Unidad de medidad = %s %n- Fecha de vencimiento = %s %n- Es exportable = %b", 
                codigo, nombre, precio, grupo, cantidad, unidadDeMedida, fechaVencimiento, esExportable);
    }
    
    
    
        
        
}
