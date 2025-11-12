public class anagrams {
    
    public static boolean areAnagrams(String a, String b) {
        
        int[] hist = new int[26];
        
        for (int i = 0; i < a.length(); i++) {
            
            char ch = Character.toLowerCase(a.charAt(i));
            
            if (ch >= 'a' && ch <= 'z') hist[ch - 'a']++;
            
        }
        
        for (int i = 0; i < b.length(); i++) {
            
            char ch = Character.toLowerCase(b.charAt(i));
            
            if (ch >= 'a' && ch <= 'z') hist[ch - 'a']--;
            
        }
        
        for (int i : hist)  if (i != 0) return false;
        
        return true; 
    }
    
    
    public static void main (String[] args) {
        
        String test1 = "Pokemon";
        String test2 = "kmoneop";
        
        System.out.println(areAnagrams(test1, test2));
        
        String test3 = "Character";
        String test4 = "Integer";
        
        System.out.println(areAnagrams(test3, test4));
        
    }
}
