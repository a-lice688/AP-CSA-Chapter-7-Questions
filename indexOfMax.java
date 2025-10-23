public class indexOfMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        
        System.out.print(indexOfMain(arr));
    }

    public static int indexOfMain(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; 
        }

        int index = 0;    
        int max = arr[0];   

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }    
        }
        return index;
    }
}
