package com.swati.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hope", "Josie", "Lizzie", "Cleo");
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		list.forEach(consumer);
	}

}
