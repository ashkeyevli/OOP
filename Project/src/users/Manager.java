package users;

import java.io.Serializable;

import enums.Unit;
import interfaces.Orderable;
import posted.News;
import posted.Order;
import storage.Storage;

public class Manager extends Employee implements Orderable, Serializable {
	private static final long serialVersionUID = -5415031327415238040L;
	private Unit type;
	
	@Override
	public void makeOrder(Order o) {
		if (orders.contains(o)) System.out.println("Order already exists.");
		else {
			orders.add(o);
			System.out.println("Order was sent.");
		}
	}
	
	public Unit getType() {
	    return type;
	}
	
	public void setType(Unit type) {
		this.type = type;
	}
	
	public void postNews(News news) {
		if(Storage.newses.contains(news)) System.out.println("News already exists.");
		else Storage.newses.addElement(news);
	}
	
	@Override
	public String toString() {		 
		return String.format("%s\nUnit: %s.", super.toString(), type);
	}
	
	@Override
	public boolean equals(Object obj) {
		Manager manager = (Manager) obj;
		return super.equals(obj) && manager.getType() == type;
	}
}

