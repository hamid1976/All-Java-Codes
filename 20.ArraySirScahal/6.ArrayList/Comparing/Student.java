interface GenericInterface<T> {
    void display(T value);
}

class Main<T> implements GenericInterface<T> {

    @Override
    public void display(T value) {
        // Implementation goes here
    }
}

class Student1 implements Comparable<Student1> {
    int rollno;
    float marks;

    Student1(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 o) {
        float diff = this.marks - o.marks;
        if (diff == 0) {
            return 0;
        } else if (diff < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 hamid = new Student1(12, 89.3415f);
        Student1 naveed = new Student1(65, 456.365615f);

        if (hamid.compareTo(naveed) < 0) {
            System.out.println("Hamid has more marks");
        }
    }
}
