package algoritmos;

import abstracao.IStrategy;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Ascendente implements IStrategy{

    @Override
    public void sort(List<?> list) {
        Collections.sort((List<Integer>) list);
    }
    
}
