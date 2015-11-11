package BankBalanceLookup;

import java.util.HashMap;
import java.util.Map;

public class CustomerSimpleMap implements CustomerLookupService{
	
	private Map<String, Customer> customers;
	
	public CustomerSimpleMap(){
		customers = new HashMap<String, Customer>();
		addCustomer(new Customer("001", "Harry","Hacker", -3456.78));
		addCustomer(new Customer("002", "Codie","Coder", 1234.56));
		addCustomer(new Customer("003", "Polly","Programmer", 987654.32));
		
	}

	@Override
	public Customer findCustomer(String id) {
		if(id != null){
			return(customers.get(id.toLowerCase()));
		}else{
			return null;
		}
	}
	
	private void addCustomer(Customer cus){
		customers.put(cus.getCustomerId(), cus);
	}

}
