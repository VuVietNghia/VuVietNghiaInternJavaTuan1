/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vn.fpoly.caculate_vuvietnghia;

import java.util.Scanner;

/**
 *
 * @author Nghia Vu
 */
public class Caculate_VuVietNghia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, tong = 0;
        String phepTinh;
        
        while (true) {
            System.out.print("Nhập a: ");
            String input = sc.nextLine();
            if (input.isBlank()) {
                System.out.println("Vui lòng nhập số để tính toán");
                continue;
            }
            try {
                a = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Vui lòng nhập số để tính toán");
            }
        }
        
        while (true) {
            System.out.print("Nhập b: ");
            String input = sc.nextLine();
            if (input.isBlank()) {
                System.out.println("Vui lòng nhập số để tính toán");
                continue;
            }
            try {
                b = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Vui lòng nhập số để tính toán");
            }
        }
        
        while (true) {
            System.out.print("Chọn phép tính (+, -, *, /): ");
            phepTinh = sc.nextLine();
            if (phepTinh.isBlank()) {
                System.out.println("Vui lòng chọn phép tính");
                continue;
            }
            if (!phepTinh.equals("+") && !phepTinh.equals("-") && !phepTinh.equals("*") && !phepTinh.equals("/")) {
                System.out.println("Phép tính không hợp lệ");
                continue;
            }
            break;
        }
        
        switch (phepTinh) {
            case "+":
                tong = a + b;
                break;
                
            case "-":
                tong = a - b;
                break;
                
            case "*":
                tong = a * b;
                break;
                
            case "/":
                if (b == 0) {
                    System.out.println("b phải khác 0");
                }
                tong = a / b;
                break;
            default:
                throw new AssertionError();
        }

        if (phepTinh.equals("+")) {
            System.out.println(a + " + " + b + " = " + tong);
        } else if (phepTinh.equals("-")) {
            System.out.println(a + " - " + b + " = " + tong);
        } else if (phepTinh.equals("*")) {
            System.out.println(a + " * " + b + " = " + tong);
        } else if (phepTinh.equals("/")) {
            System.out.println(a + " / " + b + " = " + tong);
        }

//        System.out.println("Tổng = " + tong);
    }
}
