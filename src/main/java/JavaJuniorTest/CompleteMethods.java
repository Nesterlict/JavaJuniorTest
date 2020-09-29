package JavaJuniorTest;

import java.util.Arrays;

public class CompleteMethods {

    /**
     * @param s – Строка состоящая из букв латинского алфавита и пробелов
     * @return Количество слов в строке s
     */

    public static int countWords (String s) {
        return (s==null || s.isEmpty()) ? 0 : s.trim().split(("\\s+")).length;
    }

    /**
     * @param a - оригинальный массив
     * @return массив, который не содержит дубликатов. Порядок элементов оригинального массива должен быть сохранён, из последовательности дубликатов оставлять первый, например, {2,1,4,2,3} -> {2,1,4,3}
     */

    public static int[] removeDuplicates(int[] a) {
        return Arrays.stream(a).distinct().toArray();
    }

}
