/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programstatusmahasiswa;

/**
 *
 * @author Asyer-gaming
 */
public class Programstatusmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program status mahasiswa");
        String nama="alfredo asyer";
        boolean cuti=false;
        int jmlSks=145;
        
     if(jmlSks <144){
         if(cuti ==false){
             System.out.println("kamu DO");
         }
         
     }
     if(jmlSks<121){
         if(cuti==true){
             System.out.println("kamu DO");
         }
     }
     else{
         if(jmlSks>144 && cuti==false){
             System.out.println("kamu lulus");
         }}
    }
        
        
    }
    

