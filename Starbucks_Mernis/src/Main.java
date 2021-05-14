import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer =new Customer();
		customer.setDateOfBirth(new GregorianCalendar(1999, 25 , 10).getTime());
		customer.setFirstName("abcd");
		customer.setLastName("efgh");
		customer.setNationalityId("123456789");
		baseCustomerManager.Save(customer);
		
	}

}
