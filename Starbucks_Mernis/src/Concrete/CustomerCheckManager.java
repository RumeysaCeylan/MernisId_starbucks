package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Adapter.MernisServiceAdapter;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	
	}

	

}
