package controller_event;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import event.Event;

import utils.JpaUtil;



	public class EventoDAO {

		static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		
		
		public static void addEvent (Event e) {
			
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println(" event_correctly_created ");
			
		}
		
		 public static List<Event> findAllEvents()  {
	            Query q = em.createNamedQuery("Event.findAll");
	            System.out.println("lettura eventi!!");
	            return q.getResultList();
	        }
		
		public static Event findEvent(Integer id) {
			em.getTransaction().begin();
			Event e = em.find(Event.class, id);
			em.getTransaction().commit();
			System.out.println(e);
			return e;
		}
		
		public static Event updateEvent(Event e) {
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			System.out.println(e);
			return e;
		}
		
		 public static void refresh(Event e)  {
	            em.getTransaction().begin();
	            em.refresh(e);
	            em.getTransaction().commit();
	            System.out.println("dati refreshati nel database");
	        }
		
		public static void deleteEvent(Event e) {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			System.out.println("User_deleted");

		}
		
		
	}


