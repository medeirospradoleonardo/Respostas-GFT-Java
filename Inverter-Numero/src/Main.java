
public class Main {

    static String reverse(String original) {
        String reversed = "";
        for (int i = original.length() - 1;  0 <= i; i--) {
            reversed += original.charAt(i);
        }
        return reversed;
    }

    public static long inverterNumero(String s){

        long num = Long.parseLong(s);

        if(num > 0){
        String numero_string;
        String numero_invertido;

        numero_string = String.valueOf(num);
        numero_invertido = reverse(numero_string);
        return Long.parseLong(numero_invertido);

        }else{
            return -1;
        }

    }
    public static void main(String[] args) throws Exception {

        System.out.println("15485448" + " - " + inverterNumero("15485448"));
        System.out.println("2195498" + " - " + inverterNumero("2195498"));
        System.out.println("12" + " - " + inverterNumero("12"));
        System.out.println("98716549" + " - " + inverterNumero("98716549"));
        System.out.println("9999998999" + " - " + inverterNumero("9999998999"));
        System.out.println("1654891" + " - " + inverterNumero("1654891"));

    }
    
}
