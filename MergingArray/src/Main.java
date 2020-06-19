import java.util.*;

public class Main {

	public static int[] Merge(int [] pole, int [] pole2) {
		int [] array = new int[pole.length+pole2.length];
		int index = pole.length;
		for(int i = 0;i<pole.length;i++) {
			array[i] = pole[i];
		}
		for(int j = 0;j<pole2.length;j++) {
				array[index] = pole2[j];
				index ++;
			}		
	return array;
	}
	static int partition(int arr[], int start, int end) { 
        int pivot = arr[end];  
        int i = start-1; 
        for (int j=start; j<end; j++){ 
            if (arr[j] < pivot){ 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[end]; 
        arr[end] = temp; 
  
        return i+1; 
    } 

    static void sort(int arr[], int start, int end)  { 
        if (start < end) { 
            int pi = partition(arr,  start, end); 
            sort(arr, start, pi-1); 
            sort(arr, pi+1,end); 
        } 
    }
	static Random r;
	public static void main(String[] args) {
		
	r = new Random();
	int x = r.nextInt(8)+1;
	
	int [] pole = new int[x];
	int [] pole2 = {0,1,3,7};
	
	for(int i = 0;i<pole.length;i++) {
		x = r.nextInt(8)+1;
		pole[i] = x; 
	}
		Arrays.sort(pole);Arrays.sort(pole2);
		//System.out.println(Arrays.toString(pole)+"\n"+Arrays.toString(pole2));
		int [] m = Merge(pole,pole2);
		sort(m,0,m.length-1);
		String array = Arrays.toString(m);
		System.out.println(array);
	}
}
