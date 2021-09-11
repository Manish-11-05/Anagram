import java.util.Arrays;
import java.util.Scanner;

public class String_anagram {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first string to check for anagram");
        char[] arr=sc.nextLine().toLowerCase().toCharArray();
        Arrays.sort(arr);

        System.out.println("Enter the second string to check for anagram");
        char[] arr1=sc.nextLine().toLowerCase().toCharArray();
        Arrays.sort(arr1);

        if( Arrays.compare(arr,arr1)==0){
            System.out.println("The strings are anagram to each other");
        }else {
            System.out.println("The strings are not anagram to each other");
        }


    }
}
