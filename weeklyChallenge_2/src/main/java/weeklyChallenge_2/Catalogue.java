package weeklyChallenge_2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Catalogue {

	public Catalogue() {
	}

	//creo l'array 
	List<Archive> myCatalogue = new ArrayList<Archive>();

	//metodo per aggiungere al catalogo
	public void addToCat(Archive general) {
		this.myCatalogue.add(general);
	}

	//metodo per eliminare tramite isbn
	public void deleteFromISBN(Long ISBN) {

		List<Archive> newCatalogue = myCatalogue.stream()
				.filter(x -> !x.ISBNcode.equals(ISBN))
				.collect(Collectors.toList());
		myCatalogue = newCatalogue;

	}

	//metodo per ricercare tramite isbn
	public void searchForISBN(Long ISBN) {

		List<Archive> newCatalogue = myCatalogue.stream()
				.filter(x -> x.ISBNcode.equals(ISBN))
				.collect(Collectors.toList());
		System.out.println(newCatalogue);

	}

	//metodo per ricercare tramite anno
	public void searchForYears(int myear) {

		List<Archive> newCatalogue = myCatalogue.stream()
				.filter(x -> x.yearOfPublishing == myear)
				.collect(Collectors.toList());
		System.out.println(newCatalogue);

	}

	//metodo per ricerca tramite autore
	public void searchForAuthors(String author) {

		List<Archive> newCatalogue = myCatalogue.stream()
				.filter(x -> x instanceof Book)
				.map(y -> (Book) y)
				.filter(w -> w.author.equals(author))
				.collect(Collectors.toList());
		System.out.println(newCatalogue);
	}

	//scrittura di un file .txt
	public static void writeFile(Catalogue catalogue) throws IOException {

		File myCatalogue = new File("Catalogo.txt");
		FileWriter myFW = new FileWriter(myCatalogue);
		PrintWriter myPW = new PrintWriter(myFW);
		myPW.print(catalogue);
		myPW.close();
	}

		//lettura di un file .txt
	public static void readFile(Catalogue catalogue) throws IOException {

		File file1 = new File("Catalogo.txt");
		String readString = FileUtils.readFileToString(file1, "UTF-8");
		System.out.println(readString);

	}

}
