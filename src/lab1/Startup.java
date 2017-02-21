/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author FA
 */
public class Startup {
    
    public static void main(String[] args) {
        IntroJavaCourse iJC = new IntroJavaCourse("math", "123-qwe");
        iJC.setCredits(3.0);
        
        AdvancedJavaCourse adv = new AdvancedJavaCourse("sosyal", "123");
        adv.setCredits(5.0);
        
        IntroToProgrammingCourse intPro = new IntroToProgrammingCourse("Intro VB", "VB-120");
        intPro.setCredits(2);
        
        College col = new College(intPro);
        col.addCourseSemesterInventory(intPro);
        col.addCourseSemesterInventory(adv);
        col.addCourseSemesterInventory(intPro);
        
    }
    
}
