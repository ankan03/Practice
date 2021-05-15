package jdbcApplication;

public class ForNameUseInJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		A a = new A();//will print 'In static Block In instance Block' because it execute both static block & instance block

		Class.forName("jdbcApplication.A");//will print 'In static Block'
		//When Class.forName is used it only execute static block not the dynamic block
	}

}

class A{
	static {
		System.out.println("In static Block");
	}
	
	//instance
	{
		System.out.println("In instance Block");
	}
}
