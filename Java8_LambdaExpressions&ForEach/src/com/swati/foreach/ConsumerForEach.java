package com.swati.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
		System.out.println(i);
	}
	
}
public class ConsumerForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//list.forEach(i -> System.out.println(i));
		
		//Method 1
		//Consumer<Integer> c = new ConsumerImpl();
		//list.forEach(c);
		
		//Method 2 -> Annonymous Inner Class
		/*Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		list.forEach(c);
		*/
		
		//Method 3 -> Omitting the extra code
		Consumer<Integer> c = i -> System.out.println(i);
		list.forEach(c);
		
		//or line 35,36 can be put in one line as below 
		list.forEach(i -> System.out.println(i));
	}

}
