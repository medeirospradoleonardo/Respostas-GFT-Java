public class Main {

    public static char repeteString(String s){
        int encontrou = 0;
        for(int i=0; i<s.length(); i++){

            encontrou = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    encontrou++;
                }
            }

            if(encontrou == 1){
                return s.charAt(i);
            }

        }

        return '_';
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(repeteString("aaabccccdeeef"));
        System.out.println(repeteString("strings"));
        System.out.println(repeteString("microsoft visual studio 2022"));
        System.out.println(repeteString("abcedoftz"));
    }
}
