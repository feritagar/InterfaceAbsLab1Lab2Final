package lab1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private String prerequisites;
    private String description ;
    private double credits;
    
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    // to display course description
    public void displayDescription(){
        System.out.println("Course Description: "+description);
    }
    
    // each sub-class has different description
    @Override
    public void addDescription() {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter Advanced Java Course Description");
        this.description = info.nextLine();
        
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public double getCredits() {
        return credits;
    }
    
    

   @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 5.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 5.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

   
    
}
