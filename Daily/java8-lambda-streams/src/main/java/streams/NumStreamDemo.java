package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NumStreamDemo {
	public static void main(String[] args) {
//		List<Integer> nums=Arrays.asList(1,2,3,4,10,35,36,97,85,43,98);
//		nums.stream().filter(t->t%2==0).forEach(System.out::println);
//		nums.stream().filter(t->t%2!=0).forEach(System.out::println);
//		nums.stream().filter(t->t%2!=0).map(t->2*t).collect(Collectors.toList());
//		System.out.println(nums);
//		
//		List<String> names=Arrays.asList
//				("Shantanu","John","Peter","Robin","Kirthi","Soham","Jonny","Sheetal","Shankar");
//				
//		names.stream().filter(name->name.length()>5).forEach(System.out::println);
//		System.out.println();
//		names.stream().filter(name->name.startsWith("Sh")).map(name->"Hello "+name).
//		collect(Collectors.toList()).forEach(System.out::println);
//		System.out.println();
//		names.stream().map(name->name+" "+name.length()).forEach(System.out::println);
		
		
		List<Integer> nums=Arrays.asList(1,2,3,4,10,35,36,97,85,43,98);
//		nums.stream().forEach((a,b)->System.out.println(Math.min(a,b)));
		System.out.println(nums.stream().mapToInt(n->n).max().getAsInt());
		System.out.println(nums.stream().mapToInt(n->n).min().getAsInt());
		System.out.println(nums.stream().reduce((a,b)->a+b).get());
		
	}
}
