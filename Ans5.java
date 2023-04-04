//Q5 - Write a Java program to swap two numbers with the help of a third variable
public class Ans5 {
    public static void main(String[] args) {
        int first=2;
        int second=3;
        int temp;
        temp=first;
        first=second;
        second=temp;
        System.out.print(first);
        System.out.print(","+second);

    }
}
