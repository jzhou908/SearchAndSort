import java.util.Scanner;
import java.util.List; 
import java.util.ArrayList;
import java.util.Arrays;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		SearchAndSort sorting = new SearchAndSort();
		Scanner in =  new Scanner(System.in);
		System.out.println("What algorithm would you like to execute?");
		String answer = in.nextLine();
		if(!answer.equalsIgnoreCase("bubble") && !answer.equalsIgnoreCase("selection") && !answer.equalsIgnoreCase("insertion") && !answer.equalsIgnoreCase("merge") && !answer.equalsIgnoreCase("linear") && !answer.equalsIgnoreCase("binary")) {
			System.out.println("Invalid Input! Try Again. Input: bubble, selection, insertion, merge, linear, binary, or quit.");
			return;
		}
		else if(answer.equalsIgnoreCase("quit")) {
			return;
		}
		System.out.println("What type of data?");
		String type = in.nextLine();
		if(!type.equalsIgnoreCase("integer") && !type.equalsIgnoreCase("string")) {
			System.out.println("Invalid Input! Try Again. Input: integer or string.");
			return;
		}
		System.out.println("How is it stored?");
		String array = in.nextLine();
		if(!array.equalsIgnoreCase("array") && !array.equalsIgnoreCase("arraylist")) {
			System.out.println("Invalid Input! Try Again. Input: array or arraylist.");
			return;
		}
		System.out.println("Enter the data.");
		String data = in.nextLine();
		if(data.equals(null)) {
			System.out.println("Please input data separated by commas.");
			return;
		}
		if(type.equalsIgnoreCase("integer") && array.equalsIgnoreCase("array")) {
			String[] original = data.split(",");
			int[] intarray = new int[original.length];
			int i= 0;
			for(String thing: original) {
				intarray[i] = Integer.valueOf(thing);
				i++;
			}
			if(answer.equalsIgnoreCase("bubble")) {
				sorting.bubble(intarray);
				System.out.println(intarray);
			}
			else if(answer.equalsIgnoreCase("selection")) {
				sorting.selection(intarray);
				System.out.println(intarray);
			}
			else if(answer.equalsIgnoreCase("insertion")) {
				sorting.insertion(intarray);
				System.out.println(intarray);
			}
			else if(answer.equalsIgnoreCase("merge")) {
				System.out.println(intarray);
			}
			else if(answer.equalsIgnoreCase("linear")) {
				System.out.println(intarray);
			}
			else if(answer.equalsIgnoreCase("binary")) {
				System.out.println(intarray);
			}
			else if(answer.equalsIgnoreCase("quit")) {
				System.out.println("Sorting complete.");
				return;
			}
			
		}
		else if(type.equalsIgnoreCase("String") && array.equalsIgnoreCase("array")){
			String[] stringarray = data.split(",");
			if(answer.equalsIgnoreCase("bubble")) {
				sorting.bubble(stringarray);
				System.out.println(stringarray);
			}
			else if(answer.equalsIgnoreCase("selection")) {
				sorting.selection(stringarray);
				System.out.println(stringarray);
			}
			else if(answer.equalsIgnoreCase("insertion")) {
				sorting.insertion(stringarray);
				System.out.println(stringarray);
			}
			else if(answer.equalsIgnoreCase("merge")) {
				System.out.println(stringarray);
			}
			else if(answer.equalsIgnoreCase("linear")) {
				System.out.println(stringarray);
			}
			else if(answer.equalsIgnoreCase("binary")) {
				System.out.println(stringarray);
			}
			else if(answer.equalsIgnoreCase("quit")) {
				System.out.println("Sorting complete.");
				return;
			}
		}
		else if(type.equalsIgnoreCase("String") && array.equalsIgnoreCase("arraylist")) {
			String[] original = data.split(",");
			ArrayList<String> stringarraylist = new ArrayList<String>(Arrays.asList(original));
			if(answer.equalsIgnoreCase("bubble")) {
				sorting.bubble1(stringarraylist);
				System.out.println(stringarraylist);
			}
			else if(answer.equalsIgnoreCase("selection")) {
				sorting.selection1(stringarraylist);
				System.out.println(stringarraylist);
			}
			else if(answer.equalsIgnoreCase("insertion")) {
				sorting.insertion1(stringarraylist);
				System.out.println(stringarraylist);
			}
			else if(answer.equalsIgnoreCase("merge")) {
				System.out.println(stringarraylist);
			}
			else if(answer.equalsIgnoreCase("linear")) {
				System.out.println(stringarraylist);
			}
			else if(answer.equalsIgnoreCase("binary")) {
				System.out.println(stringarraylist);
			}
			else if(answer.equalsIgnoreCase("quit")) {
				System.out.println("Sorting complete.");
				return;
			}
		}
		else if(type.equalsIgnoreCase("integer") && array.equalsIgnoreCase("arraylist")) {
			String[] original = data.split(",");
			Integer[] intarray = new Integer[original.length];
			int i= 0;
			for(String thing: original) {
				intarray[i] = Integer.valueOf(thing);
				i++;
			}
			ArrayList<Integer> intarraylist = (ArrayList<Integer>) Arrays.asList(intarray);
			if(answer.equalsIgnoreCase("bubble")) {
				sorting.bubble(intarraylist);
				System.out.println(intarraylist);
			}
			else if(answer.equalsIgnoreCase("selection")) {
				sorting.selection(intarraylist);
				System.out.println(intarraylist);
			}
			else if(answer.equalsIgnoreCase("insertion")) {
				sorting.insertion(intarraylist);
				System.out.println(intarraylist);
			}
			else if(answer.equalsIgnoreCase("merge")) {
				System.out.println(intarraylist);
			}
			else if(answer.equalsIgnoreCase("linear")) {
				System.out.println(intarraylist);
			}
			else if(answer.equalsIgnoreCase("binary")) {
				System.out.println(intarraylist);
			}
			else if(answer.equalsIgnoreCase("quit")) {
				System.out.println("Sorting complete.");
				return;
			}
		}
		in.close();
	}
	public int[] bubble(int[] a){
		int b = a.length; 
        for (int i = 0; i < b-1; i++) {
        	for (int j = 0; j < b-i-1; j++) {
        		if (a[j] > a[j+1]){ 
                    int temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp; 
                }
        	}
        }
        return a;
	}
	public String[] bubble(String[] a){
		String temp;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j].compareTo(a[j+1])>0) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	public ArrayList<Integer> bubble(ArrayList<Integer> a){
		int b = a.size(); 
        for (int i = 0; i < b-1; i++) {
        	for (int j = 0; j < b-i-1; j++) {
        		if (a.get(j) > a.get(j+1)){ 
                    int temp = a.get(j); 
                    a.set(j, a.get(j+1)); 
                    a.set(j+1, temp); 
                }
        	}
        }
        return a;
	}
	public ArrayList<String> bubble1(ArrayList<String> a){
		String temp;
		for(int i=0; i<a.size(); i++) {
			for(int j=0; j<a.size()-1-i; j++) {
				if(a.get(j).compareTo(a.get(j+1))>0) {
					temp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
			}
		}
		return a;
	}
	public int[] selection(int[] a) {
		int n = a.length; 
        for (int i = 0; i < n-1; i++) { 
            int min = i; 
            for (int j = i+1; j < n; j++) {
            	if (a[j] < a[min]) {
                    min = j; 
            	}    
            }
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        }
        return a;
	}
	public String[] selection(String[] a) {
		int n = a.length; 
        for (int i = 0; i < n-1; i++) { 
            int min = i; 
            for (int j = i+1; j < n; j++) {
            	if (a[j].compareTo(a[min]) < 0) {
                    min = j; 
            	}    
            }
            String temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        }
        return a;
	}
	public ArrayList<Integer> selection(ArrayList<Integer> a){
		int n = a.size(); 
        for (int i = 0; i < n-1; i++) { 
            int min = i; 
            for (int j = i+1; j < n; j++) {
            	if (a.get(j) < a.get(min)) {
                    min = j; 
            	}    
            }
            int temp = a.get(min); 
            a.set(min, a.get(i)); 
            a.set(i, temp); 
        }
        return a;
	}
	public ArrayList<String> selection1(ArrayList<String> a){
		int n = a.size(); 
        for (int i = 0; i < n-1; i++) { 
            int min = i; 
            for (int j = i+1; j < n; j++) {
            	if (a.get(j).compareTo(a.get(min)) < 0) {
                    min = j; 
            	}    
            }
            String temp = a.get(min); 
            a.set(min, a.get(i)); 
            a.set(i, temp);
        }
        return a;
	}
	public int[] insertion(int[] a) {
		int n = a.length; 
        for (int i=1; i<n; ++i) { 
            int target = a[i]; 
            int j = i-1; 
            while (j>=0 && a[j] > target) { 
                a[j+1] = a[j]; 
                j = j-1; 
            } 
            a[j+1] = target; 
        }
        return a;
	}
	public String[] insertion(String[] a) {
		int n = a.length; 
        for (int i=1; i<n; ++i) { 
            String target = a[i]; 
            int j = i-1; 
            while (j>=0 && a[j].compareTo(target)>0) { 
                a[j+1] = a[j]; 
                j = j-1; 
            } 
            a[j+1] = target; 
        }
        return a;
	}
	public ArrayList<Integer> insertion(ArrayList<Integer> a) {
		int n = a.size(); 
        for (int i=1; i<n; ++i) { 
            int target = a.get(i); 
            int j = i-1; 
            while (j>=0 && a.get(j) > target) { 
                a.set(j+1, a.get(j));
                j = j-1; 
            } 
            a.set(j+1, target); 
        }
        return a;
	}
	public ArrayList<String> insertion1(ArrayList<String> a){
		int n = a.size(); 
        for (int i=1; i<n; ++i) { 
            String target = a.get(i); 
            int j = i-1; 
            while (j>=0 && a.get(j).compareTo(target)>0) { 
            	a.set(j+1, a.get(j));
                j = j-1; 
            } 
            a.set(j+1, target); 
        }
        return a;
	}
	public int[] merge(int[] a) {
		
	}
}
