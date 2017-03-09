package Collections;

import java.util.*;

public class Collections {
	public static void main(String[] args) {
		
		List<Integer> arr = null;	
		List<Integer> arr1 = null;
		List<Integer> arr2 = null;
		
		System.out.println("Numbers 1-10");
		Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an Array");

        int num = input.nextInt();

        int[] numbers = new int[num];
        
        System.out.println("Numbers 6-15");
        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the size of an Array");

        int num1 = input1.nextInt();
        
        int[] numbers1 = new int[num1];
        
        int num2 = num + num1;
        
        int[] numbers2 = new int[num2];
        
        for (int i = 1; i < numbers.length; i++){
        for (int i1 = 6; i1 < numbers1.length; i1++){	 
        for (int i2 = 1; i2 < numbers2.length; i2++){		 
        arr = new ArrayList<Integer>(numbers1.length);
        int rand1 =  (int) Math.round(Math.random() * 10);
        arr.add(rand1);
        
        
        
        
       arr1 = new ArrayList<Integer>(numbers.length);
        int rand2 =  (int) Math.round(Math.random() * 15);
        arr1.add(rand2);
        
        
        
        
        	int rand3 =  (int) Math.round(Math.random() * 25);
        	 arr2 = new ArrayList<Integer>(numbers2.length);
             arr2.add(rand3);
             arr2.removeAll(arr);
             arr2.addAll(arr);
             arr2.removeAll(arr1);
             arr2.addAll(arr1);
             java.util.Collections.sort(arr2);
             java.util.Collections.reverse(arr2);
             

             
             
             
        }
        
        
        	 }
       }
       System.out.println("Number of First collection" + arr);
       System.out.println("Size of First collection" + arr.size()); 
        
       System.out.println("Number of Second collection" + arr1);
        System.out.println("Size of Second collection" + arr1.size()); 
        
        System.out.println("Sorted collection" + arr2);
        System.out.println("Collection in reverse order" + arr2);
             System.out.println("Size of Combined collection " + arr2.size());
         
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key1", "value1");
	    map.put("key2", "value2");
	    map.put("key2", "value2");
	    map.put("key3", "value3");
	    map.put("key4", "value4");
	    System.out.println(map);
	    System.out.println("Map Size:" + map.size());
	    /*I chose this type of collection because Maps do not all for duplicates which makes them 
	    easier to implement since the work to check for a duplicate key/value pair is already 
	    peformed for you.*/
	}
}
	     
		
		


