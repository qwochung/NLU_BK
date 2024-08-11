
public  class Store extends Subject {
	String nameStore;
	String inforProduct;
	String inforDiscount;
	
	
	 
	public Store(String nameStore, String inforProduct, String inforDiscount) {
		super();
		this.nameStore = nameStore;
		this.inforProduct = inforProduct;
		this.inforDiscount = inforDiscount;
	}


	

	@Override
	public void notifyDiscount() {
		for (obDisount obDisount : listDiscount) {
			obDisount.updateDiscount(this.nameStore,getInforDiscount());
		}
		
	}


	@Override
	public void notifyProduct() {
		for (obProduct obProduct : listNewProducts) {
			obProduct.updateProduct(nameStore, getInforProduct());
		}
	}






	void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}






	void setInforProduct(String inforProduct) {
		this.inforProduct = inforProduct;
		notifyProduct();
	}




	

	void setInforDiscount(String inforDiscount) {
		this.inforDiscount = inforDiscount;
		notifyDiscount();
	}




	String getInforProduct() {
		return inforProduct;
	}




	String getInforDiscount() {
		return inforDiscount;
	}
	
	
	
	public double total () {
		double result = 0;
		listDiscount.forEach(null);
		
		return result;
	}
	
	

}
