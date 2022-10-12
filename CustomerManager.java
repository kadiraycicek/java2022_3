
public class CustomerManager {
	public CustomerManager(Customer customer) { //bu sekilde yapmamizin sebebi diger metotlardan ulasabilmemiz icindir,
        										//bu sayede customer nesnesini add, update, delete vb. 
		                                        //her turlu operasyonda kolaylikla kullanabilirim
		
	}
	public void Save() {
		System.out.println("Müşteri Kaydedildi");
	}
	public void Delete() {
		System.out.println("Müşteri Silindi");
	}

}
