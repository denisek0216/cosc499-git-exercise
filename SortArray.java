import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    // Method 1: Sorting integers
    public static int[] sortIntegers(int[] intArr) {
        Arrays.sort(intArr);
        return intArr;
    }
    
    // Method 2: Sorting strings
    public static String[] sortStrings(String[] strArr) {
        Arrays.sort(strArr);
        return strArr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello.\nEnter the length of the array:");
        int length = input.nextInt();
        System.out.println("Array length: "+length);
        System.out.println("Choose to (1) Sort integers, or (2) Sort strings.");
        int option = input.nextInt();
        while (option!=1 && option!=2) {
            if (option==1) {
                int[] intArr = new int[length];
                
                // TODO: Check if array consists of only ints

                for (int i=0; i<length; i++) {
                    System.out.println("Enter element-"+i+" value: ");
                    int inputElem = input.nextInt();
                    intArr[i] = inputElem;
                }

                int[] sortedIntArr = sortIntegers(intArr);
                System.out.println("Output: "+sortedIntArr.toString());
            }
            else if (option==2) {
                String[] strArr = new String[length];

                for (int i=0; i<length; i++) {
                    System.out.println("Enter element-"+i+" value:");
                    String inputElem = input.next();
                    strArr[i] = inputElem;
                }

                String[] sortedStrArr = sortStrings(strArr);
                System.out.println("Output: "+sortedStrArr.toString());
            }
            else {
                System.out.println("Invalid option choice. Enter only either 1 or 2.");
            }
        }
    }
}