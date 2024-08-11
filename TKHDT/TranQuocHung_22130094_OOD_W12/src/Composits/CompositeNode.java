package Composits;

import java.util.ArrayList;
import java.util.List;


public class CompositeNode extends XMLNode {
	 
	List<XMLNode> nodes;

//	public CompositeNode(String name, TextNode description, List<Attribute> attributes, List<XMLNode> nodes) {
//		super(name, description, attributes);
//		this.nodes = nodes;
//			
//	}
	
	
	
	

	
	public CompositeNode(String name) {
		super(name, description, attributes);
		this.description = ne, description, attributes, name)
		this.nodes = nodes;
	}






	public void addNode( XMLNode node) {
		if (nodes == null) {
			this.nodes = new ArrayList<XMLNode>();
		}
		nodes.add(node);
	}
	
	public void removeNode (XMLNode node) {
		nodes.remove(node);
	}
	
	public void addAttribute( Attribute attribute) {
		if (attributes == null) {
			this.attributes = new ArrayList<Attribute>();
		}
		attributes.add(attribute);
	}
	
	public void removeAttribute (Attribute attribute) {
		attributes.remove(attribute);
	}


	@Override
	public void print() {
		System.out.println(this.toString());
		
	}


	@Override
	public String toString() {
		return '<'+ this.getName() + this.getAttributes().toString()+ '>'
				;
	}
	
	 public static void main(String[] args) {
		CompositeNode node = new CompositeNode("book",null,new ArrayList<Attribute>(), null);
		node.print();
		
	}
	


	
}
