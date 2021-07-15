import java.util.ArrayList;

public class Transcript {
    private String id;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    private double gpa;


    Transcript(){
        this.courses = new ArrayList<Course>();
    }

    //getters and setters

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList getCourses(){
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    //methods

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public String getOverallGPA(){
        double total = 0;
        for(Course course: courses){
            total = total + course.getQuality();
        }
        double toFormat = total / courses.size();
        String formattedGPA = String.format("%.01f", toFormat);
        return formattedGPA;
    }

    public void printTranscript(){
        System.out.println(this.firstName+" "+this.lastName+"\nStudent ID: "+this.id);
        System.out.println("Course\tCredits\tGrade\tQuality Points");
        System.out.println("-------\t-------\t-------\t-------\n");
        for (int i = 0; i < courses.size();i++) {
            System.out.println(courses.get(i).getName() + "\t\t" + courses.get(i).getCredits() + "\t\t" + courses.get(i).getGrade() + "\t\t" + courses.get(i).getQuality());
        }

        System.out.println("\nGPA: "+getOverallGPA());
    }




}
