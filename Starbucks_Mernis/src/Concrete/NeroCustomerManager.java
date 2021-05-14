package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	public void Save(Customer customer) {
if(customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
		}
		else {
			System.out.println("NOT A VALID PERSON");
		}super.Save(customer);
	}

}
