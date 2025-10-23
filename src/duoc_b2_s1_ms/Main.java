package duoc_b2_s1_ms;

/**
 *
 * @author msuarez
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Producto con contructor sin parametros valores por defecto
        ProductoAgricola producto2 = new ProductoAgricola();
        System.out.println(producto2.toString());
        
        //Creacion de producto modificando sus mutadores
        ProductoAgricola prodcuto1 = new ProductoAgricola();
        prodcuto1.setCodigo("AGFE001");
        prodcuto1.setNombre("Urea");
        prodcuto1.setCantidad(20);
        prodcuto1.setUnidadDeMedida("KG");
        prodcuto1.setPrecio(5000.0);
        prodcuto1.setGrupo("Fertilizante");
        prodcuto1.setFechaVencimiento("29-01-2026");
        prodcuto1.setEsExportable(true);        
        System.out.println("");
        System.out.println(prodcuto1.toString());
        
        
        //Prodcuto usando el constructor
        ProductoAgricola producto = new ProductoAgricola("AGAC001","Envidor",10,"LTS",15000.0,"Acaricidas","05-02-2026",false);
        System.out.println("");        
        System.out.println(producto.toString());
        
        
        
    }
    
}
