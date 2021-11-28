import java.util.Scanner;

public class insertion_sort {
    public void sort_array(int[] array, int n){
        for(int i=1; i<n; i++){
            int current = array[i];
            int j = i-1;
            
            while(array[j]>current && j>=0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
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
        insertion_sort i = new insertion_sort();
        i.sort_array(array, n);
        i.printArray(array, n);
    }
}
