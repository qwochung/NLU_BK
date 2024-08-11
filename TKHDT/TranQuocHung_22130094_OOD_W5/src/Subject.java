import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	List<obDisount> listDiscount = new ArrayList<obDisount>();
	List<obProduct> listNewProducts = new ArrayList<obProduct>();
	
	
	
	
	public void registerDiscount(obDisount disount) {
		listDiscount.add(disount);
	};
	
	public void registerProdut(obProduct product) {
		listNewProducts.add(product);
	};
	
	public void removeDiscount(obDisount disount) {
		listDiscount.remove(disount);
	};
	
	public void removeProduct(obProduct product) {
		listNewProducts.remove(product);
	};
	
	
	public abstract void notifyProduct()  ;
	
	public abstract void notifyDiscount()  ;
	
	
}
