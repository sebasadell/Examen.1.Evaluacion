public class Password {
    private int longitud = 8;
    private String contrasena ="";

    public Password() {
        contrasena = generarPassword(longitud);
    }

    public Password(int longitud){
        this.longitud = longitud;
        contrasena = generarPassword(longitud);
    }

    public boolean esFuerte(){
        char[] mayusC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int mayus = 0;
        char[] minusC = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int minus = 0;
        char[] numsC = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int nums = 0;

        for(int i = 0; i < contrasena.length(); i++){
            for(int j = 0; j < mayusC.length; j++){
                if(contrasena.charAt(i) == mayusC[j]){
                    mayus++;
                    break;
                }
            }
            for(int j = 0; j < minusC.length; j++){
                if(contrasena.charAt(i) == minusC[j]){
                    minus++;
                    break;
                }
            }
            for(int j = 0; j < numsC.length; j++){
                if(contrasena.charAt(i) == numsC[j]){
                    nums++;
                    break;
                }
            }
        }

        if(mayus > 2 && minus > 1 && nums > 5){
            return true;
        }
        else{
            return false;
        }
    }

    public String generarPassword(int longitud){
        char[] character = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char c;
        int random;
        String contrasena = "";
        for(int i = 0; i < longitud; i++){
            random = (int) (Math.random() * (character.length));
            contrasena += character[random];
        }
        return contrasena;
    }

    public String getPassword(){
        return contrasena;
    }

    public  int getLongitud(){
        return longitud;
    }

    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
}