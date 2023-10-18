/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

/**
 *
 * @author QuaVi
 */

public class Calculator_Shape_Program  {
    public void run(){
      System.out.println("=====Calculator Shape Program=====");
        Rectangle rectangle = Library.inputRectangle();
        Circle circle = Library.inputCircle();
        Triangle trigle = Library.inputTriangle();

        Library.display(trigle, rectangle, circle);
    }
}
