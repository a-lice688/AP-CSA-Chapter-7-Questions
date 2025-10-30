import java.util.Scanner;

public class AreFactors {
    
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = s.nextInt();
        
        int[] arr = {3, 6, 9}; 
        
        System.out.print(areFactors(n, arr));
        
    }
    
    public static boolean areFactors(int n, int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] % n != 0) return false;
            
        }
        
        return true;
    }
    
}