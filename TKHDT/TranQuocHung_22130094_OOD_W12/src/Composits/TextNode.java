package Composits;

import java.util.List;

public class TextNode extends XMLNode {
	String content;

	

	public TextNode(String name, TextNode description, List<Attribute> attributes, String content) {
		super(name, description, attributes);
		this.content = content;
	}
	
	
	
	

	String getContent() {
		return content;
	}

	void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof TextNode)) {
			return false;
		}
		TextNode descriptionNode = (TextNode)obj;
		return this.getContent().equals(descriptionNode.getContent()) ;
	}

	@Override
	public void addNode(XMLNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeNode(XMLNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAttribute(Attribute attribute) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAttribute(Attribute attribute) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
