public class ArePrimeFactors {
    
    public static void main(String[] args){        
       
        int[] arr = {2, 3, 5};
        int n = 31;
        
        System.out.println(arePrimeFactors(n, arr));
    }
    
    
    static boolean arePrimeFactors(int n, int[] arr){
        int total = 1;
        
        for (int i = 0; i < arr.length; i++){
            boolean isPrime = true;
            total*=arr[i];
            
            for (int j = 2; j < arr[i]; j++){
                
                if(arr[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if (!isPrime) return false;
        }
        
        return total == n;
    }
    
    
    
}