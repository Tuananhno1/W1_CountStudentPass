import java.util.Scanner;

public class CountStudentPassing {
    public static void main(String[] args) {
        System.out.println("The Application to count the number of students pass.");

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 38) {
                System.out.println("Size does not exceed 38");
            }
        }while (size > 38);

        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter a mark for student" + (i+1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("List of mark: ");
        for(int j=0;j<array.length;j++){
            System.out.println(array[i] + "\t");
            if (array[i]>=5 && array[i]<=10)
                count++;
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
