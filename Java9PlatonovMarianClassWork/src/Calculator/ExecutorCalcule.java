/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author Marian Platonov
 */
public class ExecutorCalcule {
    
   static int rezultat=0;
    
    public static void main(String ars[]){
        
    }
    
    public static int aduna(int a, int b){
    rezultat=a+b;
    return rezultat;
    }   
    
    public static int inmulteste(int a, int b){
    rezultat=a*b;
    return rezultat;
    }
    
    public static int imparte(int a, int b){
    rezultat=a/b;
    return rezultat;
    }
    
    public static int scadere(int a, int b){
    rezultat=a-b;
    return rezultat;
    }
}
