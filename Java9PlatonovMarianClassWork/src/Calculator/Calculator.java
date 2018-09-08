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
public class Calculator {
    float rezultat=0;

    public float aduna(float a, float b){
        rezultat=a+b;
        return rezultat;
    }   
    
    public float scadere(float a, float b){
        rezultat=a-b;
        return rezultat;
    }   
    
    public float inmulteste(float a, float b){
        rezultat=a*b;
        return rezultat;
    }
    
    public float imparte(float a, float b){
        rezultat=a/b;
     return rezultat;
    }
}
    
