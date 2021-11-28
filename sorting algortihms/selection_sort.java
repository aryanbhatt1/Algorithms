import java.util.Scanner;

public class selection_sort {

    public void sort_array(int[] array, int n){
        for(int i=0; i<n-1; i++){
            int min_inx = i;
            for(int j=i+1; j<n; j++){
                if(array[j]<array[min_inx]){
                    min_inx = j;
                }
            }
            int temp = array[min_inx];
            array[min_inx] = array[i];
            array[i] = temp;
        }
    }
    
    public void printArray(int[] array, int n){
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        selection_sort s = new selection_sort();
        s.sort_array(array, n);
        s.printArray(array, n);
        sc.close();
    }
}
