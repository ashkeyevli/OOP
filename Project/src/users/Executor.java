package users;

import java.util.Iterator;

import posted.Order;

public class Executor extends Employee{
	private static final long serialVersionUID = 1L;
	private int bonus;
	
	public void checkOrder() {
		for (Iterator<Order> iterator = orders.iterator(); iterator.hasNext();) {
			Order order = (Order) iterator.next();
			if(!order.isPerformed()) {
				bonus += 1000;
				order.perform();
			}
		}
	}
	
	public double getSalary() {
	    return salary + bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && ((Executor) obj).getBonus() == bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Bonus: " + bonus;
	}
}

