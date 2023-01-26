public class Exercise4 {
    public static int getNumberOfConsonants(String string){
        char[] vowelsPlusSpace = {'a', 'e', 'i', 'o', 'u', ' '};
        String s = string.toLowerCase().trim();
        int vowels = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < vowelsPlusSpace.length; j++){
                if(s.charAt(i) == vowelsPlusSpace[j]){
                    vowels++;
                    break;
                }
            }
        }
        int cons = s.length() - vowels;
        return cons;
    }
}
