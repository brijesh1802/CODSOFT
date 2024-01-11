import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("\nEnter marks in Sub " + (i + 1));
                marks[i] = sc.nextInt();
            } while (marks[i] > 100);
        }
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        float avg = ((float)sum/5);
        char grade;
        if (avg > 60 && avg < 70) {
            grade = 'D';
        } else if (avg >= 70 && avg < 80) {
            grade = 'C';
        } else if (avg >= 80 && avg < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("\nMarks\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject" + (i + 1) + ": " + marks[i]+"\n");
        }
        System.out.println("\nTotal Marks:" + sum + "/500");
        System.out.println("\nAverage Marks:" + avg);
        System.out.printf("\nStudent Grade: %c", grade);
        System.out.println("\n\n");
        sc.close();

    }
}