package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;


    public Student(String name){
        this.name = name;
        this.grade = new ArrayList<>();
    }

    
    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grade.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grades : grade) {
            sum = sum + grades;
        }
        return (double)sum / grade.size();
    }

//    public int getGrades(String student){
//        return student.grade;
//    }

    public static void main(String[] args) {
        Student student = new Student("Jeff");
        student.addGrade(90);
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(99);
        System.out.println(student.getName());
        System.out.println(student.getName() + ": " + student.getGradeAverage());
    }
}
