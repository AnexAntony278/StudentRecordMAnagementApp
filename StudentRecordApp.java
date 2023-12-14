
package com.mycompany.studentrecordapp;

public class StudentRecordApp {

    public static void main(String[] args) {
        System.out.println("App Running...");
        Start s=new Start();
        s.setVisible(true);
        s.setBounds(0, 0, 400, 450);
        
       try{
            ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","net start MySQL80");
            Process p=pb.start();
            System.out.println(p.getOutputStream()
            );
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
