package Composits;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		Attribute id_Attribute = new Attribute("id", "id01");
		Attribute status_Avaliable = new Attribute("status", "avaliable");
		Attribute status_Rent = new Attribute("status", "Rent");
		
		TextNode nameNode = new TextNode("Name", null, null	, "Refactoring");
		TextNode firstNameNode = new TextNode("FirstName", null, null	, "Martin");
		TextNode lastNameNode = new TextNode("LastName", null, null	, "Fowler");
		TextNode bookNameNode1 = new TextNode("BookName", null, null	, "UML Distilled");
		TextNode bookNameNode2= new TextNode("BookName", null, null	, "Analysis Patterns");
		
		
		CompositeNode otherBooksNode = new CompositeNode("OtherBooks", null, null, null);
	
		CompositeNode authorNode = new CompositeNode("Author", null,null , null);
		
		
		
		
		
		
		CompositeNode bookNode = new CompositeNode("book", null, null, null);
		
		otherBooksNode.addNode(bookNameNode1);
		authorNode.addNode(firstNameNode);
		authorNode.addNode(lastNameNode);
		authorNode.addNode(otherBooksNode);
		
		
		bookNode.addAttribute(id_Attribute);
		bookNode.addAttribute(status_Rent);
		bookNode.addNode(nameNode);
		bookNode.addNode(authorNode);
	
	
	
	}
}
