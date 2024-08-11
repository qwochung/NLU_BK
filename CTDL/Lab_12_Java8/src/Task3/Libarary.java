package Task3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Libarary {
	private String name;
	private List<Book> books;
	public Libarary(String name, List<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	public Book getOldestBook() {
		Comparator<Book> comparable = (b1 , b2 ) -> {
			return Integer.compare(b1.getYear(), b2.getYear());
		};
		
		
		
		return  books.stream().max( comparable).get();
	}
	
	
	
	
	public Map<Integer, List<Book>> getBooksByYears (){
		return this.books.stream().collect(Collectors.groupingBy(Book::getYear));
	}
	
	
	public Set<Book> findBooks(String authorName, int year){
		Comparator<Book> comp	= (b1, b2) ->{
			return b1.getTitle().compareTo(b2.getTitle());
		};
		
		return books.stream().filter( x -> x.hasAuthor_Year( authorName, year))
				.collect(Collectors.toCollection(() -> new TreeSet<>(comp)));
	}

}
