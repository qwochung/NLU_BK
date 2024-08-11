package Composits;

import java.util.List;

public abstract class XMLNode {
	String name;
	TextNode description;
	List<Attribute> attributes;

	
	
	
	
	
	

	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	TextNode getDescription() {
		return description;
	}


	void setDescription(TextNode description) {
		this.description = description;
	}

 

	List<Attribute> getAttributes() {
		return attributes;
	}


	void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof XMLNode)) {
			return false;
		}
		else {
			XMLNode node =  (XMLNode) obj;
			
			return this.getName().equals(node.getName()) &&
					this.getAttributes().equals(node.getAttributes() )&&
					this.getDescription().equals(node.getDescription()) ;
		}
	}





	public  abstract void addNode( XMLNode node) ;
	
	public abstract void removeNode (XMLNode node) ;
	
	public abstract void addAttribute( Attribute attribute) ;
	
	public abstract void removeAttribute (Attribute attribute) ;
	
	public abstract void print();
	
	
	
	
	

}
