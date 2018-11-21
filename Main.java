package clipboard_project;

public class Main {

	public static void main(String[] args) {
		clipboard test = new clipboard(5);
		
		test.add_element(5);
		test.add_element(5.3);
		test.add_element("abc");
		
		test.display();
		
		
		test.add_element(10);
		test.add_element(11);
		test.add_element("ghft");
		test.add_element(5.9);
		
		
		System.out.println("\n\n");
		
		test.display();
		System.out.println(" number =" + test.getNumberCount());
		System.out.println("sum number =" + test.getNumberSum());

	}

}
