package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        //Divide(12,0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(CheckFileExtension(studentFiles.get("Stefanie")));

    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        if (y == 0){
            try {
                throw new ArithmeticException("You can not divide by 0, [derogatory term]!");
            } catch (ArithmeticException err){
                err.printStackTrace();
            }
        }else{
            System.out.println(String.format("The quotient of %s divided by %s is: %s", x, y, x/y));

        }

    }

    public static int CheckFileExtension(String fileName)
    {
        int result = 0;
        // Write code here!
        if(fileName == null) {
            try {
                throw new NullPointerException("Ile cannot be null");
            }catch (NullPointerException error){
                error.printStackTrace();
                result = -1;
                return result;
            }
        } else if (fileName.endsWith(".java")) {
            result = 1;
            return result;
        }
        return result;
    }

}
