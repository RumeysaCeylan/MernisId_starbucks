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
		customer.setDateOfBirth(new GregorianCalendar(1985, 1 , 6).getTime());
		customer.setFirstName("Engin");
		customer.setLastName("Demiro�");
		customer.setNationalityId("28861499108");
		baseCustomerManager.Save(customer);
		
	}

}