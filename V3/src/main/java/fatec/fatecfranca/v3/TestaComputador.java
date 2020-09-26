/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca.v3;

import java.util.ArrayList;

public class TestaComputador {

    public static void mostaCalcula(Computador obj){
        System.out.println(obj.toString() + " preco final " + obj.calculaPreco());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Notebook not = new Notebook(10, "dell", "HG-500", 1580);
        PC pc = new PC(15, "pichau", "OK-OK-5000", 8000);
        Celular cel = new Celular(6, "samsung", "S9", 2102);
        
        ArrayList<Computador> vetor = new ArrayList(not, pc, cel);
        
        //vetor.add(not);
        //vetor.add(pc);
        //vetor.add(cel);
        
        mostaCalcula(vetor.get(0));
        mostaCalcula(vetor.get(1));
        mostaCalcula(vetor.get(2));
        
        
    }
    
}
