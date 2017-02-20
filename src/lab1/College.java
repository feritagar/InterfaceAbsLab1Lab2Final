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
public class College {

    private ProgrammingCourse prgCourse;

    public College(ProgrammingCourse prgCourse) {
        this.prgCourse = prgCourse;
    }

    public void addCourseSemesterInventory(ProgrammingCourse course) {
        System.out.println(course.getCourseName()+" has been added to the semester inventory.");
    }

}
