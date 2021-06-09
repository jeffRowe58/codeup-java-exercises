package grades;

import java.util.*;

public class GradesApplication{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();


        Student student1 = new Student("Jeff");
        student1.addGrade(99);
        student1.addGrade(97);
        student1.addGrade(70);
        students.put("jeffRowe58", student1);


        Student student2 = new Student("Floyd");
        student2.addGrade(98);
        student2.addGrade(86);
        student2.addGrade(95);
        students.put("floyd99", student2);

        Student student3 = new Student("John");
        student3.addGrade(87);
        student3.addGrade(75);
        student3.addGrade(72);
        students.put("johnnyBoy99", student3);

        Student student4 = new Student("Jim");
        student4.addGrade(87);
        student4.addGrade(89);
        student4.addGrade(60);
        students.put("jimBo", student4);

        Set<String> keySet = students.keySet();
        ArrayList<String> listOfKeys = new ArrayList<>(keySet);


        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our students:");
        for (int i = 0; i < listOfKeys.size(); i++) {
            System.out.printf("| %s |\t", listOfKeys.get(i));
        }
        System.out.println();

        String user;
        do {
            System.out.println("What student would you like to see more information on?");
            user = sc.next();
            if (listOfKeys.contains(user)) {
                System.out.printf("Name: " + students.get(user).getName() + " - Github Username: " + user + "\nCurrent Average: %.2f\n", students.get(user).getGradeAverage());
                continue;
            }else{
                System.out.println("Sorry, no student found with the Github username of " + user);
            }
        }while(!listOfKeys.contains(user));
        do{
            System.out.println("Would you like to see another student");
            user = sc.next();
            if(user.equalsIgnoreCase("y")  || user.equalsIgnoreCase("yes")){
                System.out.println("What student would you like more information on?");
                user = sc.next();
                if(listOfKeys.contains(user)){
                    System.out.printf("Name: " + students.get(user).getName() + " - Github Username: " + user + "\nCurrent Average: %.2f\n", students.get(user).getGradeAverage());
                }else{
                    System.out.println("Sorry, no student found with the Github username of " + user);
                }

            }else if(user.equalsIgnoreCase("n") || user.equalsIgnoreCase("no")){
                System.out.println("Goodbye, and have a wonderful day.");
                break;
            }
        }while(true);

        }

    }



