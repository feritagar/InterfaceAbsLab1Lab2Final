package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }


    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public double getCourseCredits() {
        return credits;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCourseCredits(double credits) {
       this.credits = credits;
    }

    
}
