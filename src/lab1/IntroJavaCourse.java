package lab1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String description;
    private String prerequisites;
    private double credits;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);

    }

    // to display course description
    public void displayDescription() {
        System.out.println("Course Description: " + description);
    }

    // each sub-class has different Description
    @Override
    public void addDescription() {
        Scanner desc = new Scanner(System.in);
        System.out.println("Enter Intro Java Course Description");
        this.description = desc.nextLine();

    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public double getCredits() {
        return credits;
    }
    

    @Override
    public void setCredits(double credits) {
        if (credits < 1.0 || credits > 3.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 1.0 to 3.0");
            System.exit(0);
        }
        this.credits = credits;
    }

}
