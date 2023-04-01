package controller_event;

import java.time.LocalDate;
import java.util.List;

import event.Event;

public class Main_Event {

	public static void main(String[] args) {
		
		
		
		try {
			
			//EventoDAO.addEvent(new Event("PUBBLICO","Cena con delitto", "La serata comprende cena di gala con spettacolo", LocalDate.of(2023, 04, 25)));
			//EventoDAO.addEvent(new Event("PRIVATO","The Royal Wedding", "La serata comprende Royal Wedding", LocalDate.of(2020, 01, 10)));
			//EventoDAO.addEvent(new Event("PUBBLICO","Concerto in arena", "La serata comprende concerto, e foto con l'artista", LocalDate.of(2023, 07, 12)));
			//EventoDAO.addEvent(new Event("PUBBLICO","Balli di gruppo", "La serata comprende ballo con la balestra", LocalDate.of(2023, 04, 25)));
		
			//Event e1=EventoDAO.findEvent(27);
			//EventoDAO.deleteEvent(e1);
			
			//Event e2=EventoDAO.findEvent(29);
			//e2.setTipo_evento("PRIVATO");
			//EventoDAO.updateEvent(e2);
			
			//EventoDAO.refresh(e2);
			//System.out.println( EventoDAO.findAllEvents());
			List<Event> myEvents= EventoDAO.findAllEvents();
			myEvents.forEach(x->System.out.println(x));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			EventoDAO.em.close();
		}
		
		
		
		
	}
	
}
