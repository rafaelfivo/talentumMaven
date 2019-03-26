package model.DAO;

import controller.Connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

public class DAO<T> {

    EntityManager manager;

    //Salva no banco
    public T save(T t) {
        manager = new ConnectionFactory().getEntityManager();

        try {
            manager.getTransaction().begin();
            manager.persist(t);
            manager.getTransaction().commit();
            return t;

        } catch (Exception e) {
            System.err.println("Erro ao salvar: " + e);
            manager.getTransaction().rollback();
            return null;

        } finally {
            manager.close();
        }
    }

    //Modifica dados do banco 
    public T update(T t) {
        manager = new ConnectionFactory().getEntityManager();

        try {
            manager.getTransaction().begin();
            manager.merge(t);
            manager.getTransaction().commit();
            return t;

        } catch (Exception e) {
            System.err.println("Erro ao alterar: " + e);
            manager.getTransaction().rollback();
            return null;

        } finally {
            manager.close();
        }
    }

    //Faz consulta no banco
    public T findById(Class<T> clazz, Long id) {
        manager = new ConnectionFactory().getEntityManager();
        return manager.find(clazz, id);
    }

    //Remove dados do banco
    public Boolean remove(Class<T> clazz, Long id) {
        manager = new ConnectionFactory().getEntityManager();

        T t = findById(clazz, id);

        try {
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
            return true;

        } catch (Exception e) {
            System.err.println("Erro ao apagar: " + e);
            manager.getTransaction().rollback();
            return false;

        } finally {
            manager.close();
        }
    }

}
