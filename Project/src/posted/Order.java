package posted;

import users.Employee;

public class Order {
	
	private int idOrder;
	
	private String text;
	
	private String title;
	
	private Employee sender;
	
	private Boolean performed = false;
	
	
	public Order(){}
	
	public int getIdOrder() {
	    return idOrder;
	}
	
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	
	public String getText() {
	    return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getTitle() {
	    return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Employee getSender() {
	    return sender;
	}
	
	public void setSender(Employee sender) {
		this.sender = sender;
	}
	
	public Boolean isPerformed() {
	   return performed;
	}
	
	public void perform() {
		this.performed = true;
	}
	
	public boolean equals(Object obj)
	{
		Order order = (Order) obj;
		return (order.getIdOrder() == idOrder && order.getText().equals(this.text) && order.getTitle().equals(this.title) && order.getSender().equals(this.sender) && order.isPerformed().equals(performed));
	}
	
	public int hashcode() {
	    return super.hashCode();
	}

}

