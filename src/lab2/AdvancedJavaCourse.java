package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
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
        if (courseName == null || courseName.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCourseCredits(double credits) {
        if (credits < 0.5 || credits > 5.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 5.0");
            System.exit(0);
        }
        this.credits = credits;
    }

}
