import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
 class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public int compareTo(Student other) {
        if (cgpa != other.cgpa) {
            return Double.compare(other.cgpa, cgpa);
        } else if (!name.equals(other.name)) {
            return name.compareTo(other.name);
        } else {
            return Integer.compare(id, other.id);
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        for (String event : events) {
            Scanner scanner = new Scanner(event);
            String type = scanner.next();
            if (type.equals("ENTER")) {
                String name = scanner.next();
                double cgpa = scanner.nextDouble();
                int id = scanner.nextInt();
                queue.add(new Student(id, name, cgpa));
            } else if (type.equals("SERVED")) {
                queue.poll();
            }
            scanner.close();
        }
        List<Student> remainingStudents = new ArrayList<Student>();
        while (!queue.isEmpty()) {
            remainingStudents.add(queue.poll());
        }
        return remainingStudents;
    }
}

