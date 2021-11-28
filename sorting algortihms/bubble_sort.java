import java.util.Scanner;

class bubble_sort{
    void sort_array(int[] array, int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    void printArray(int[] array, int n){
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
       bubble_sort b = new bubble_sort();
       b.sort_array(array, n);
       b.printArray(array, n);
       sc.close();
    }
}