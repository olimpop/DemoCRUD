/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.uaemex.dao.ClienteDAO;
import mx.uaemex.model.Cliente;

/**
 *
 * @author renecruz
 */
@ManagedBean
@SessionScoped
public class ClienteBean {

    private Integer idCliente;
    private String razonSocial;
    private String rfc;
    private String direccion;
    private String email;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }

    public void addCliente() {
        Cliente cliente = new Cliente(getRazonSocial(), getRfc(), getDireccion(), getEmail());
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.addCliente(cliente);
        FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Cliente creado correctamente, nuevo ID es " + cliente.getIdCliente() ));
    }
    
    public void returnClienteById() {
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.getClienteByID(getIdCliente());
        if (cliente != null) {
            setIdCliente(cliente.getIdCliente());
            setRazonSocial(cliente.getRazonSocial());
            setRfc(cliente.getRfc());
            setDireccion(cliente.getDireccion());
            setEmail(cliente.getEmail());            
        } else { 
            setRazonSocial("");
            setRfc("");
            setDireccion("");
            setEmail("");
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cliente NO encontrado "));
        }
    }
    
    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
