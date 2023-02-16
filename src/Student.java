public class Student {
    private final String name;
    private final int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int getmaximumMark() {
        int maximum = 0;//95,98,10
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getminimumMark() {
        int minimum = 0;
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

}

