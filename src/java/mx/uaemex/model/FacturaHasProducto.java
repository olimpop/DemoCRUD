package mx.uaemex.model;
// Generated 26-nov-2015 11:12:29 by Hibernate Tools 4.3.1



/**
 * FacturaHasProducto generated by hbm2java
 */
public class FacturaHasProducto  implements java.io.Serializable {


     private FacturaHasProductoId id;
     private Integer cantidad;
     private Float precioTotal;

    public FacturaHasProducto() {
    }

	
    public FacturaHasProducto(FacturaHasProductoId id) {
        this.id = id;
    }
    public FacturaHasProducto(FacturaHasProductoId id, Integer cantidad, Float precioTotal) {
       this.id = id;
       this.cantidad = cantidad;
       this.precioTotal = precioTotal;
    }
   
    public FacturaHasProductoId getId() {
        return this.id;
    }
    
    public void setId(FacturaHasProductoId id) {
        this.id = id;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Float getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }




}


