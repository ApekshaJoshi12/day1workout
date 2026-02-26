public class VowelOrConsonant {
    public static void main(String[] args) {
        
        char ch = 'A';  
        
        
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a Vowel");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Consonant");
        } 
        else {
            System.out.println("Not an Alphabet");
        }
    }
}