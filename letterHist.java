
public class letterHist {
    
    public static void main (String[] args) {
        
        String test = "ABCDEFGHIjklmnopqrstuvwxyz!";
        int[] histogram = letterHist(test);

        for (int i = 0; i < 26; i++)  System.out.print(histogram[i]);
    
    }
    
    public static int[] letterHist(String input) {
            
        int[] histogram = new int[26]; 

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i)); 
            if (ch >= 'a' && ch <= 'z') histogram[ch - 'a']++;
        }

        return histogram;
        
    }
    
    
}
