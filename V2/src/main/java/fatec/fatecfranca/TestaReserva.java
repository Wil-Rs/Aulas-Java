/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.fatecfranca;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tux
 */
public class TestaReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voo voo1 = new Voo(666, "havaianas", "allstar");
        Passageiro passageiro1 = new Passageiro("54687498-8", "48541236784");
        Reserva reserva1 = new Reserva(616, new Date(), voo1, passageiro1);
        
        System.out.println( reserva1.toString() );
        
        Voo voo2 = new Voo(77,"franca", "sao paulo");
        Passageiro pa1 = new Passageiro("123", "789");
        Reserva re2 = new Reserva();
        re2.setCod(800);
        re2.setData( new Date() );
        re2.setPassageiro(pa1);
        re2.setVoo(voo2);
        System.out.println( re2.toString() );
        
        //criando um data
        Date minhaData = new Date(2020, 7, 3); // ano, mes[0,1,2,3,4,5,6,7,8,9,10,11], dia
        System.out.println(minhaData);
        
    }
    
}
