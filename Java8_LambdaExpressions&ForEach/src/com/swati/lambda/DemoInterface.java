package com.swati.lambda;

//by default all the methods in interface are "public abstract"
interface Phone{
	void call();
	default void message() {		//in interface we can define method using default keyword
		System.out.println("Message Sent");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("Calling");
	}
}


public class DemoInterface {

	public static void main(String[] args) {
		Phone ph = new AndroidPhone();
		ph.call();
		ph.message();
	}

}
