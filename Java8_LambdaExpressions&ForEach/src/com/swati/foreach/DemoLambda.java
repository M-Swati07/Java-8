package com.swati.foreach;

interface A{
	void show(int i);
}

//class B implements A{
//
//	@Override
//	public void show(int i) {
//		System.out.println("Hello" + i);
//	}
//}

public class DemoLambda {

	public static void main(String[] args) {
//		A obj = new A() {		//Anonymous Inner Class
//			public void show(int i) {
//				System.out.println("Good Day!!" + i);
//			}
//		};
		
		//Another way to write the above code by removing "new A() { public void show" coz void show is already 
		//declared in the interface, so no need of the boilerplate code 
		//you can also remove the int below as its already declared in interface
		A obj = (int i) -> 
		{
			System.out.println("Good Day " + i);
		};	// the brackets can be removed in case of a single statement
		
		obj.show(7);
	}

}
