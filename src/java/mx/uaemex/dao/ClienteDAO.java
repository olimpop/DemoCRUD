/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.dao;

import mx.uaemex.model.Cliente;
import mx.uaemex.util.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author renecruz
 */
public class ClienteDAO {

    //CRUD for Cliente

    public void addCliente(Cliente cliente) {
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    public void deleteCliente(int idCliente) {
    }

    public void updateCliente(Cliente cliente) {
    }

    public Cliente getClienteByID(int idCliente) {
        Cliente cliente = null;
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Cliente where idCliente = :idToFind";
            Query query = session.createQuery(queryString);
            query.setInteger("idToFind", idCliente);
            cliente = (Cliente) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return cliente;
    }
}
