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
		// TODO Auto-generated constructor stub
	}
	
	
	List<Archive> myCatalogue=new ArrayList<Archive>();
	
	
	
	public void addToCat(Archive general) {
		this.myCatalogue.add(general);
	}
	
	
	public void deleteFromISBN(Long ISBN) {
		
		List<Archive> newCatalogue= myCatalogue.stream().filter(x->!x.ISBNcode.equals(ISBN)).collect(Collectors.toList())	;
		myCatalogue=newCatalogue;
		
	}
	
	public void searchForISBN(Long ISBN) {
		
		List<Archive> newCatalogue= myCatalogue.stream()
				.filter(x->x.ISBNcode
				.equals(ISBN))
				.collect(Collectors.toList())	;
		System.out.println(newCatalogue);
		
	}
	
	public void searchForYears(Long myear) {
	
		List<Archive> newCatalogue= myCatalogue.stream()
				.filter(x->x.yearOfPublishing
				.equals(myear))
				.collect(Collectors.toList())	;
		System.out.println(newCatalogue);
		
	}
	
	public void searchForAuthors(String author) {
		
		List<Archive> newCatalogue= myCatalogue.stream()
				.filter(x -> x instanceof Book )
				.map(y->(Book)y)
				.filter(w->w.author.equals(author))
				.collect(Collectors.toList());
		System.out.println(newCatalogue);
	}
	
	public static void writeFile(Catalogue catalogue) throws IOException {
		
		File myCatalogue= new File("Catalogo.txt");
		FileWriter myFW= new FileWriter(myCatalogue);
		PrintWriter myPW= new PrintWriter(myFW);
		myPW.print(catalogue);
		myPW.close();
	}


	public static void readFile(Catalogue catalogue) throws IOException{
		
		File file1= new File("Catalogo.txt");
		String readString= FileUtils.readFileToString(file1, "UTF-8");
		System.out.println(readString);
		
	}
	
	
}
