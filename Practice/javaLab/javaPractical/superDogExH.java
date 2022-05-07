// Program to Handle Exception In a Super Class Methods

package javaLab.javaPractical;

public class superDogExH {
    void method() throws RuntimeException
	{
		System.out.println("\nSuperClass Dog\n");
	}
}

class subCatExH extends superDogExH {

	void method() throws ArithmeticException
	{

		System.out.println("\nSubClass Cat\n");
	}

	public static void main(String args[])
	{
		try{
			int a = 10/0;
		}
		catch(ArithmeticException e) {
			superDogExH s = new subCatExH();
			s.method();
		}
	}
}
