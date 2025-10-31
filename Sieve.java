import java.util.Scanner;

public class Sieve {
    
    public static boolean[] sieve (int n) {
        
        if (n <= 1) return new boolean[0];
        
        boolean[] isPrime = new boolean[n]; 
        
        for (int i = 2; i < n; i++) isPrime[i] = true;
        
        for (int i = 2; i * i < n; i++) {
            
            if (isPrime[i]) {
                
                for (int j = i * i; j < n; j += i) isPrime[j] = false;
                
            }
        }        
        
        return isPrime; 
        
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        
        boolean[] arr = sieve(n);
        
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + "\t");
        
    }
    
}