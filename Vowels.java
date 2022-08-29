public class Vowels {
        public static void Vowels(char ch){
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println(ch + " is vowel");
                        break;
                    default:
                        System.out.println(ch + " is consonant");
                }
            }
    public static void main(String[] args){
            char ch='i';
            Vowels(ch);
      }
}
