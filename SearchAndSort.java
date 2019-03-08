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
		SearchAndSort search = new SearchAndSort();
		Scanner in = new Scanner(System.in);
		
		String[] list = null;
		int[] numlist = null;
		ArrayList<String> list1 = new ArrayList<String>();
		
		System.out.println("What algorithm would you like to execute?");
		String operation = in.nextLine().toLowerCase();
		if (!operation.equals("bubble") && !operation.equals("selection") && !operation.equals("insertion") && !operation.equals("merge") && !operation.equals("linear") && !operation.equals("binary") && !operation.equals("quit")) {
			System.out.println("Invalid input. Acceptable responses: bubble, selection, insertion, merge, linear, binary, quit.");
			return;
		} else if (operation.equals("quit")) {
			return;
		}
		
		System.out.println("What type of data?");
		String type = in.nextLine().toLowerCase();
		if (!type.equals("integers") && !type.equals("strings")) {
			System.out.println("Invalid input. Acceptable responses: strings, integers. Please try again.");
			return;
		}
		System.out.println("How is it stored?");
		String storage = in.nextLine().toLowerCase();
		if (!storage.equals("array") && !storage.equals("list")) {
			System.out.println("Invalid input. Acceptable responses: array, list.");
			return;
		}
		System.out.println("Enter the data in a comma-delimited list.");
		String data = in.nextLine();
		if (data.equals("")) {
			System.out.println("No data inputted.");
			return;
		}
		if (storage.equals("array") || storage.equals("list")) {
			list = data.split(",", 0);
			for (String val : list) {
				if(type.equals("integers")) {
					for (int j = 0; j < val.length(); j++) {
						
						if (val.length() > 1 && val.charAt(0) == '-' && Character.isDigit(val.charAt(1))) {
							System.out.print("");
						} else if (!Character.isDigit(val.charAt(j))) {
							if (Character.isWhitespace(val.charAt(j))) {
								System.out.println("No spaces in list, please.");
								return;
							}
							System.out.println("Invalid input.");
							return;
						}
					}
				} else {
					if (val.trim().equals(null)) {
						System.out.println("Invalid input.");
						return;
					}
					val = val.trim();
				}
			}
		}
		if (type.equals("integers")) {
			String t = null;
			if (operation.equals("linear") || (operation.equals("binary"))) {
				System.out.println("What is the target?");
				t = in.nextLine();
				if (t.equals("")) {
					System.out.println("Invalid target.");
				}
				for (int i = 0; i < t.length(); i++) {
					if (!Character.isDigit(t.charAt(i))) {
						System.out.println("Invalid target.");
						return;
					}
				}
			}
			if (storage.equals("array")) {
				numlist = new int[list.length];
				for (int i = 0; i < list.length; i++) {
					numlist[i] = Integer.valueOf(list[i]);
				}
				switch (operation) {
				case "bubble": 
					System.out.print("Bubble sort: ");
					search.print(search.bubble(numlist));
					break;
				case "selection":
					System.out.print("Selection sort: ");
					search.print(search.selection(numlist));
					break;
				case "insertion":
					System.out.print("Insertion sort: ");
					search.print(search.insertion(numlist));
					break;
				case "merge" :
					System.out.print("Merge sort: ");
					search.print(search.merge(numlist, numlist.length));
					break;
				case "linear" : 
					System.out.println("Index: " + search.linear(numlist, Integer.valueOf(t)));
					break;
				case "binary" :
					System.out.println("Index: " + search.binary(numlist, Integer.valueOf(t)));
					break;
				}
				
			} else {
				Integer[] numlist2 = new Integer[list.length];
				for (int i = 0; i < list.length; i++) {
					numlist2[i] = Integer.valueOf(list[i]);
				}
				ArrayList<Integer> numlist1 = new ArrayList<Integer>();
				for (int i = 0; i < numlist2.length; i++) {
					numlist1.add(numlist2[i]);
				}
				switch (operation) {
				case "bubble": 
					System.out.print("Bubble sort: ");
					search.print(search.bubble(numlist1));
					break;
				case "selection":
					System.out.print("Selection sort: ");
					search.print(search.selection(numlist1));
					break;
				case "insertion":
					System.out.print("Insertion sort: ");
					search.print(search.insertion(numlist1));
					break;
				case "merge" :
					System.out.print("Merge sort: ");
					search.print(search.merge(numlist1, numlist1.size()));
					break;
				case "linear" : 
					System.out.println("Index: " + search.linear(numlist1, Integer.valueOf(t)));
					break;
				case "binary" :
					System.out.println("Index: " + search.binary(numlist1, Integer.valueOf(t)));
					break;
				}
			}
		} else {
			String target = null;
			if (operation.equals("linear") || (operation.equals("binary"))) {
				System.out.println("What is the target?");
				target = in.nextLine();
				if (target.equals("") || target.equals(null)) {
					System.out.println("Invalid target.");
				}
			}
			if (storage.equals("array")) {
				switch (operation) {
				case "bubble": 
					System.out.print("Bubble sort: ");
					search.print(search.bubble(list));
					break;
				case "selection":
					System.out.print("Selection sort: ");
					search.print(search.selection(list));
					break;
				case "insertion":
					System.out.print("Insertion sort: ");
					search.print(search.insertion(list));
					break;
				case "merge" :
					System.out.print("Merge sort: ");
					search.print(search.merge(list, list.length));
					break;
				case "linear" : 
					System.out.println("Index: " + search.linear(list, target));
					break;
				case "binary" :
					System.out.println("Index: " + search.binary(list, target));
					break;
				}
			} else {
				ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(list));
				switch (operation) {
				case "bubble": 
					System.out.print("Bubble sort: ");
					search.prints(search.bubbles(list2));
					break;
				case "selection":
					System.out.print("Selection sort: ");
					search.prints(search.selections(list2));
					break;
				case "insertion":
					System.out.print("Insertion sort: ");
					search.prints(search.insertions(list2));
					break;
				case "merge" :
					System.out.print("Merge sort: ");
					search.prints(search.merges(list2, list2.size()));
					break;
				case "linear" : 
					System.out.println("Index: " + search.linears(list2, target));
					break;
				case "binary" :
					System.out.println("Index: " + search.binarys(list2, target));
					break;
				}
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
	public ArrayList<String> bubbles(ArrayList<String> a){
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
	public ArrayList<String> selections(ArrayList<String> a){
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
	public ArrayList<String> insertions(ArrayList<String> a){
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
	public int[] merge(int[] list, int len) {
		int[] left = new int[len/2];
		int[] right = new int[len - len/2];
		
		for (int i = 0; i < len/2; i++) {
			left[i] = list[i];
		}
		for (int i = len/2; i < len; i++) {
			right[i - len/2] = list[i];
		}
		merge(left, left.length);
		merge(right, right.length);
		
		return merge(bigmerge(list, left, right), list.length);
	}
	
	public int[] bigmerge(int[] list, int[] left, int[] right) {
		int l = 0;
		int r = 0;
		int k = 0;
		
		while (l < left.length && r < right.length) {
			if (left[l] > right[r]) {
				list[k] = right[r];
				k++;
				r++;
			} else {
				list[k] = left[l];
				k++;
				l++;
			}
		}
		
		return list;
	}
	
	public String[] merge(String[] list, int len) {
		String[] left = new String[len/2];
		String[] right = new String[len - len/2];
		
		for (int i = 0; i < len/2; i++) {
			left[i] = list[i];
		}
		for (int i = len/2; i < len; i++) {
			right[i - len/2] = list[i];
		}
		merge(left, left.length);
		merge(right, right.length);
		
	//	bigmerge(list, left, right);
		
		return list;
	}
	
	public ArrayList<Integer> merge(ArrayList<Integer> list, int len) {
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		for (int i = 0; i < len/2; i++) {
			left.add(list.get(i));
		}
		for (int i = len/2; i < len; i++) {
			right.add(list.get(i));
		}
		merge(left, left.size());
		merge(right, right.size());
		
	//	bigmerge(list, left, right);
		
		return list;
	}
	
	public ArrayList<String> merges(ArrayList<String> list, int len) {
		ArrayList<String> left = new ArrayList<String>();
		ArrayList<String> right = new ArrayList<String>();
		
		for (int i = 0; i < len/2; i++) {
			left.add(list.get(i));
		}
		for (int i = len/2; i < len; i++) {
			right.add(list.get(i));
		}
		merges(left, left.size());
		merges(right, right.size());
		return list;
	}
	
	public int linear(int[] list, int target) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public int linear(String[] list, String target) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	public int linear(ArrayList<Integer> list, int target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				return i;
			}
		}
		return -1;
	}
	
	public int linears(ArrayList<String> list, String target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}
 	
	public int binary(int[] list, int target) {
		bubble(list);
		if (list == null || list.length == 0) {
			return -1;
		}
		int left = 0;
		int right = list.length-1;
		int mid = list.length/2;
		while (left <= right) {
			if (list[mid] == target) {
				return mid;
			} else if (list[mid] > target) {
				right = mid - 1;
				mid = (left + right) / 2;
			} else {
				left = mid + 1;
				mid = (left + right) / 2;
			}
		}
		return -1;
	}
	
	public int binary(String[] list, String target) {
		bubble(list);
		if (list == null || list.length == 0) {
			return -1;
		}
		int left = 0;
		int right = list.length-1;
		int mid = list.length/2;
		while (left <= right) {
			if (list[mid].equals(target)) {
				return mid;
			} else if (list[mid].compareTo(target) > 0) {
				right = mid - 1;
				mid = (left + right) / 2;
			} else {
				left = mid + 1;
				mid = (left + right) / 2;
			}
		}
		return -1;
	}
	
	public int binary(ArrayList<Integer> list, int target) {
		bubble(list);
		if (list == null || list.size() == 0) {
			return -1;
		}
		int left = 0;
		int right = list.size()-1;
		int mid = list.size()/2;
		while (left <= right) {
			if (list.get(mid) == target) {
				return mid;
			} else if (list.get(mid) > target) {
				right = mid - 1;
				mid = (left + right) / 2;
			} else {
				left = mid + 1;
				mid = (left + right) / 2;
			}
		}
		return -1;
	}
	
	public int binary1(ArrayList<String> list, String target) {
		bubbles(list);
		if (list == null || list.isEmpty()) {
			return -1;
		}
		int left = 0;
		int right = list.size()-1;
		int mid = list.size()/2;
		while (left <= right) {
			if (list.get(mid).equals(target)) {
				return mid;
			} else if (list.get(mid).compareTo(target) > 0) {
				right = mid - 1;
				mid = (left + right) / 2;
			} else {
				left = mid + 1;
				mid = (left + right) / 2;
			}
		}
		return -1;
	}
	
	public void print(int[] list) {
		for (int i = 0; i < list.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(list[i]);
		}
		System.out.println();
	}
	
	public void print(String[] list) {
		for (int i = 0; i < list.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(list[i]);
		}
		System.out.println();
	}
	
	public void print(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	
	public void prints(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(list.get(i));
		}
		System.out.println();
	}
	

}
