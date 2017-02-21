/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author FA
 */
public class Startup {
    public static void main(String[] args) {
        IntroToProgrammingCourse intProgramming = new IntroToProgrammingCourse("Intro VB", "VB 123");
        intProgramming.setCourseCredits(2);
        
        IntroJavaCourse intJava = new IntroJavaCourse("Intro Java", "JV 12345");
        intJava.setCourseCredits(3);
        
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "AJV 432");
        advJava.setCourseCredits(5);
        
        College col2 = new College();
        
        col2.addCourseSemesterInventory(intJava);
        col2.addCourseSemesterInventory(advJava);
        col2.addCourseSemesterInventory(intProgramming);
        
        
    }
}
