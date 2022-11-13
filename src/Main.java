public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("первое число меньше второго");
        } else {
            System.out.println("числа равны");
        }

        int num3 = 4;
        switch (num3) {
            case 3:
                System.out.println("число равно 3");
                break;
            case 4:
                System.out.println("число равно 4");
                break;
        }
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(arr[0]);
        palindrome("Шалаш");


    }

public static void palindrome (String word){
        StringBuilder strBuilder = new StringBuilder(word);
        strBuilder.reverse();
        String inverseWord = strBuilder.toString();
        if (word.equalsIgnoreCase(inverseWord)){
            System.out.println("Данная строка является палиндромом");
        }else {
            System.out.println("Данная строка не является палиндромом");
        }
}


}










