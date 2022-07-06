
public class Client {

	public static void main(String[] args) {
		LazyRegistryWithDCL singleton;
		
		
		singleton = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL singleton2 = LazyRegistryWithDCL.getInstance();
		System.out.println(singleton == singleton2);
	}

}
