/*
 * Objetivo: definir uma API que me permita trocar um algoritmo por outro de mesma familia
 */
package strategypattern;

import abstracao.IStrategy;
import algoritmos.Ascendente;
import algoritmos.Descendente;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class StrategyPattern {

    private static IStrategy strategy;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        strategy = new Ascendente();
        
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            lista.add(new Random().nextInt(100));
        }
        
        strategy.sort(lista);
        
        System.out.println("Lista Ascendente:\n");
        for (Integer integer : lista) {
            System.out.print(integer + ", ");
        }
        
        
        strategy = new Descendente();
        
        strategy.sort(lista);
        
        System.out.println("\n\nLista Descendente:\n");
        for (Integer integer : lista) {
            System.out.print(integer + ", ");
        }
        
    }
    
}
