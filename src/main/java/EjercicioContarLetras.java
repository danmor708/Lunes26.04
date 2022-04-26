/*public class EjercicioContarLetras {
    class Ejemplo1 {
        public static void Main(){
            String str = "";
            char[] arr;
        }

    }
}
*/

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioContarLetras {

    public static void main(String[] args) {
        Integer[] arrayLetter = new Integer[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayLetter.length; i++) {
            arrayLetter[i] = sc.nextInt();
        }
        System.out.println(contarRepetidas(arrayLetter));

    }

    public static String contarRepetidas(Integer[] arrayLetter) {

        if (arrayLetter == null)
            return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer Letter : arrayLetter) {
            if (map.containsKey(Letter)) {
                Integer value = map.get(Letter);
                value++;
                map.replace(Letter, value);
            } else {
                map.put(Letter, 1);
            }
        }
        return map.toString();

    }
}
