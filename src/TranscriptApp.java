import java.util.Scanner;
import java.util.ArrayList;

public class TranscriptApp {
    public static void main(String[] args) {
        boolean studentContinue = true;
        boolean courseContinue = true;
        Scanner kb = new Scanner(System.in);


        System.out.println("Welcome to the transcript application. ");
        while (studentContinue) {
            Transcript userTranscript = new Transcript();
            System.out.println("Enter Student ID number: ");
            userTranscript.setId(kb.nextLine());
            System.out.println("Enter Student's first name: ");
            userTranscript.setFirstName(kb.nextLine());
            System.out.println("Enter Student's last name: ");
            userTranscript.setLastName(kb.nextLine());
            while (courseContinue) {
                Course course = new Course();
                System.out.println("Enter Course: ");
                course.setName(kb.nextLine());
                System.out.println("Enter Credits: ");
                course.setCredits(kb.nextLine());
                System.out.println("Enter Grade: ");
                String gradeInput = kb.nextLine();
                course.setGrade(gradeInput);
                switch (gradeInput) {
                    case "A":
                        course.setQuality(4.0);
                        break;
                    case "a":
                        course.setQuality(4.0);
                        break;
                    case "B":
                        course.setQuality(3.0);
                        break;
                    case "b":
                        course.setQuality(3.0);
                        break;
                    case "C":
                        course.setQuality(2.0);
                        break;
                    case "c":
                        course.setQuality(2.0);
                        break;
                    case "D":
                        course.setQuality(1.0);
                        break;
                    case "d":
                        course.setQuality(1.0);
                        break;
                    case "F":
                        course.setQuality(0.0);
                        break;
                    case "f":
                        course.setQuality(0.0);
                        break;
                    default:
                        course.setQuality(0.0);
                        break;
                }
                userTranscript.addCourse(course);

                System.out.println("Enter Another Course? Y/N");

                if (kb.nextLine().equals("n") || kb.nextLine().equals("N")) {
                    courseContinue = false;
                }
            }
            userTranscript.printTranscript();
            System.out.println("Enter Another Student? Y/N");
            if (kb.nextLine().equals("n") || kb.nextLine().equals("N")) {
                studentContinue = false;
            }
        }
    }
}
