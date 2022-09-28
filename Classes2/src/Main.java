
public class Main {

	public static void main(String[] args) {
//		reference type
		CustomerMenager customerMenager = new CustomerMenager();
//		customerMenager için stack oluşturuldu
		CustomerMenager customerMenager2 = new CustomerMenager();
//		customerMenager2 için stack oluşturuldu
		customerMenager = customerMenager2;
//		ikisi de aynı yeri tutuyo artık
		customerMenager.Add();
		customerMenager.Remove();
		customerMenager.Update();
	}

}
