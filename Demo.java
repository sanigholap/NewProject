public class B  {

	int a = 20;

	void show(int a) {

		{
						System.out.println(this.a);
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		B b = new B();

		b.show(30);
		
		System.out.println("Hi java");
	}
}
