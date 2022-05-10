public class CommonPrefix {

    public static String prefix(String[] array) {
//        String first_word = array[0];
//        char[] fw = first_word.toCharArray();
//        char[] pref = new char[150];
//        boolean flag = true;
//        String res = new String();
//
//
////        for (int i = 0; i < fw.length; i++){
////            pref = pref.concat(String.valueOf(fw[i]));
////            for(int j = 0; j < array.length; j++){
////                if(!array[j].contains(pref)){
////                    return pref;
////                }
////            }
////        }
//        for (int i = 0; i < pref.length; i++){
//
//        }
//
//        return "";
        String prefix = array[0];
        for (String str : array)
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        return prefix;



    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"} ;

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

        System.out.println(prefix(array2)); // abc








    }
}

