package utils;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence
                    .createEntityManagerFactory("JPA_Persist_es1");
        } catch (Throwable ex) {
            System.err.println("Initial EntityManagerFactory creation failed."
                    + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

}