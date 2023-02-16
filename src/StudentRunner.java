public class StudentRunner {
    public static void main (String[] args) {
        int[] marks = {99, 98,100};
        Student student = new Student("Aarti", marks);
        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: " + sum);
    }
}