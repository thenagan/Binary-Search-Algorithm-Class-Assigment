// Binary Search Program
// Travis Henagan
// CPT307: Data Structures & Algorithms
// Dr. Nelson Stewart
// April 25, 2020

 
package binaryprogram;

class SearchProgram {
	
	
	public static void Search(int[] arr, int first, int last, int key) {
		int mid = (first + last) / 2;
		while ( first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			}
			else if (arr[mid] == key) {
				System.out.println(key + " was found");
				break;
			}
			else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println(key + " Not found");
		}
			}
	public static void main(String args[]) {
		int arr[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
		int key = 45;
		int key2 = 17;
		int last = arr.length - 1;
		Search(arr,0,last,key);
		Search(arr,0,last,key2);
		
	}
		}