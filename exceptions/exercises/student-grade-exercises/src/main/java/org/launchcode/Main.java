package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(String student: studentFiles.values()) {
            System.out.println(CheckFileExtension(student));
        }

    }

    public static double Divide(int x, int y)
    {
        if(y == 0){
            try{
                throw new GradeExceptions("You can't divide by zero!");
            } catch (GradeExceptions e) {
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName){
        if(fileName == null) {
            try {
                throw new FileException("Missing file type!");
            } catch(FileException e){
                e.printStackTrace();
            }
            return -1;
        }

        if ( fileName.isEmpty()){
            try {
                throw new FileException("Not a .java file!");
            } catch(FileException e){
                e.printStackTrace();
            }
            return -1;
        } else if (fileName.contains(".java")){
            return 1;
        } else {
            return 0;
        }


    }


}