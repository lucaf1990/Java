package controller;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.User;

public class MainProject {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Persistency_1");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		User u = new User();
		u.setName_user("Luca");
		u.setLastname_user("Forma");
		u.setEmail_user("lucaforma@gmail.com");

		try {
			// addUser(u);
			User f1 = findUser(1l);
			// System.out.println(f1);
			// f1.setEmail_user("lucaforma90.02@gmail.com");
			// updateUser(f1);
			deleteUser(f1);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			em.close();
			emf.close();
		}

	}

	public static void addUser(User u) {

		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println(" correct_commit ");
	}

	public static User findUser(Long id) {
		em.getTransaction().begin();
		User u = em.find(User.class, id);
		em.getTransaction().commit();

		return u;
	}

	public static User updateUser(User u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println(u);
		return u;
	}

	public static void deleteUser(User u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("User_deleted");

	}

}
