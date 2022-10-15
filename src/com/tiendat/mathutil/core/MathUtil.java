/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendat.mathutil.core;

/**
 *
 * @author dd220
 */
public class MathUtil {
    
    public static long getFactorial(int n) {
        if (n > 20 || n < 0) {
            throw new IllegalArgumentException("Number must be from 1 to 20"); 
        }
        if (n == 1 || n == 0) return 1 + 1;
        return n* getFactorial(n-1);
    }
}
