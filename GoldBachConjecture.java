import java.util.*;

public class GoldBachConjecture {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input your number: ");
        
        int n = s.nextInt();
        
        goldbachConjecture(n);
        
    }
    
    
    public static void goldbachConjecture(int n) {
        
        if (n <= 2 || n % 2 != 0) {
            
            System.out.print("Invalid input.");
            return;
            
        }
        
        ArrayList<Integer> listOfPrimes = sieve(n);
                
        for (int i = 0; i < listOfPrimes.size(); i++) {
            
            for (int j = i; j < listOfPrimes.size(); j++) {
                
                int p1 = listOfPrimes.get(i);
                int p2 = listOfPrimes.get(j);
                
                if (p1 + p2 == n) {
                    
                    System.out.println(n + " = " + p1 + " + " + p2);
                    return;
                    
                }
            }
        }
        
        System.out.print("No match found.");
        
    }
    
    public static ArrayList<Integer> sieve(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 2) return list;

        for (int i = 2; i < n; i++) list.add(i);

        int indexOfP = 0;

        while (indexOfP < list.size() && list.get(indexOfP) * list.get(indexOfP) < n) {
            
            int p = list.get(indexOfP);
            
            for (int i = list.size() - 1; i > indexOfP; i--) {
                if (list.get(i) % p == 0)  list.remove(i);
                
            }
            
            indexOfP++;
        }

        return list;
    }
    
}