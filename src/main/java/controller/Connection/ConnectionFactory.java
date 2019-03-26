package controller.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oem
 */
public class ConnectionFactory {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("Talentum");

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
