package WeekOfOct12;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> x = new LinkedList<>();
		LinkedList<String> y = new LinkedList<>();
		LinkedList<String> z = new LinkedList<>();
		
		x.addAll(Arrays.asList("a", "b", "c", "d", "1", "2", "3"));
		y.addAll(Arrays.asList("1", "2", "3", "a", "b", "c", "n"));
		z.addAll(Arrays.asList("h", "i", "j", "k", "l", "m", "n"));
		
		System.out.println("Test 1: " + Intersection(x, y));
		System.out.println("Test 2: " + Intersection(x, z));
		System.out.println("Test 3: " + Intersection(y, z));
	}

	public static String Intersection(LinkedList<String> one, LinkedList<String> two) {
		
		Object intersectingNode = new Object();
		for(int i = 0; i < one.size(); i++) {
			for(int j = 0; j < two.size(); j++) {
				if(one.get(i) == two.get(j)) {
					intersectingNode = one.get(i);
					return "Intersection found at node " + intersectingNode;
			}
		}
	}
		
		return "No ntersection found";

	}
	}