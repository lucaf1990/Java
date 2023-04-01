package model;

import Connector.DBConnector;

import java.io.IOException;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import util.JpaUtil;

@AllArgsConstructor
@NoArgsConstructor

public class Catalogue {

	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public Catalogue() {
	}

	public static void addToCat(Archive a) {
		try {
			em.getTransaction().begin();
			em.persist(a);
			em.getTransaction().commit();

		} catch (Exception e) {

		}
	}

	public static void delete(Long iSBNcode) throws IOException {
		em.getTransaction().begin();
		Archive e = em.find(Archive.class, iSBNcode);
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Utente eliminato nel database");
	}

	public static Archive getElementByISBN(Long iSBNcode) throws IOException {
		em.getTransaction().begin();
		Archive e = em.find(Archive.class, iSBNcode);
		em.getTransaction().commit();
		System.out.println(e);
		return e;
	}

	public static User getIdForLoan(Long id)  {
		em.getTransaction().begin();
		User e = em.find(User.class, id);
		em.getTransaction().commit();
		return e;
	}
	public static Archive getBookForLoan(Long ISBNcode)  {
		em.getTransaction().begin();
		Archive e = em.find(Archive.class, ISBNcode);
		em.getTransaction().commit();
		return e;
	}
	public static List<Archive> getElementByYear(int yearOfPublishing) throws IOException {

		Query q = em.createQuery("SELECT bm FROM Archive bm WHERE bm.yearOfPublishing= :research");
		q.setParameter("research", yearOfPublishing);
		return q.getResultList();

	}

	public static List<Archive> getElementByAuthor(String author) throws IOException {

		Query q = em.createQuery("SELECT bm FROM Archive bm WHERE bm.author= :research");
		q.setParameter("research", author);
		return q.getResultList();

	}

	public static List<Archive> getElementByTitle(String titolo) throws IOException {

		Query q = em.createQuery("SELECT a FROM Archive a WHERE LOWER (a.titolo) LIKE LOWER ('%' || :research || '%')");
		q.setParameter("research", titolo);
		return q.getResultList();

	}
	public static List<Loan_Catalogue> getElementByMemebership(Long membership_number) throws IOException {

		Query q = em.createQuery("SELECT a FROM Loan_Catalogue a WHERE a.utente.membership_number = :membership_number and  a.day_loan_end = NULL");
		q.setParameter("membership_number", membership_number);
		return q.getResultList();

	}
	public static List<Loan_Catalogue> getElementStillLoaned () throws IOException {

		Query q = em.createQuery("SELECT a FROM Loan_Catalogue a WHERE a.day_loan_end is NULL OR a.day_loan_end>a.day_loan_end_prevision");
		
		return q.getResultList();

	}

	public static void addUser(User u) throws IOException {

		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}

	public static void addLoan(Loan_Catalogue l) throws IOException {
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		System.out.println("Done ");

	}

}
