/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Relacionamento;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anacris
 */
public class CarroTest {
    @Test
    public void tanqueDeGasolinaTest() { 
        Carro car = new Carro();
        
        car.encherTanque(new Gasolina(10.0)); 
        car.andar(14.0);
        assertEquals(9.0, car.getCombustivel(), 0.001);
    }
    
    @Test
    public void tanqueDeAlcoolTest() 
    { 
        Carro car = new Carro(); 
        car.encherTanque(new Alcool(10.0)); 
        car.andar(28.0);
        assertEquals(8.0, car.getCombustivel(), 0.001); 
    }

}
