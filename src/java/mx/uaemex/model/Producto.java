package mx.uaemex.model;
// Generated 26-nov-2015 11:12:29 by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private String nombre;
     private String descripcion;
     private String unidad;
     private Float precioUnitario;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, String unidad, Float precioUnitario) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.unidad = unidad;
       this.precioUnitario = precioUnitario;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public Float getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }




}


