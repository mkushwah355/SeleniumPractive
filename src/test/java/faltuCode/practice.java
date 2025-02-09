package faltuCode;

import java.util.*;

class practice {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 3);
		map.put("c", 15);//remove
		map.put("d", 20);
		map.put("e", 7);

		Integer largest = Integer.MIN_VALUE;
		Integer secondLargest = Integer.MIN_VALUE;
		String largestKey= "";
		String secondLargestKey="";

		for (Map.Entry<String, Integer> loop1 : map.entrySet()) {

			Integer values = loop1.getValue();

			if (values > largest) {
				secondLargest = largest;
				largest = values;
				secondLargestKey=largestKey;
				largestKey=loop1.getKey();
			}

		}//System.out.println(secondLargest);
		map.remove(secondLargestKey);
		System.out.println(map);

	}

}
