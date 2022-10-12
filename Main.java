
public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer();//örneğini oluşturmak, instance creation
		customer.setId(1);
		//customer.setFirstName("Kadir");
		//customer.setLastName("Ayçiçek");
		//customer.setNationalId("12345678912"); bunları customer classından person classına geçirdiğimiz için hata veriyor.
		customer.setCity("Ankara");
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.setTaxNumber("12345678910");
		company.setCompanyName("aycicekyazilim");
		company.setId(2);
		company.setCity("Afyon"); 
		
		CustomerManager customerManager2 = new CustomerManager(new Company());
		CustomerManager customerManager3 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.setId(1);
		person.setFirstName("Kadir");
		person.setLastName("Ayçiçek");
		person.setNationalId("12345678912");
		person.setCity("Antalya");
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		

	}

}
