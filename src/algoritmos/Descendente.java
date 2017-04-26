package algoritmos;

import abstracao.IStrategy;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Descendente implements IStrategy{

    @Override
    public void sort(List<?> list) {
        list.sort(Collections.reverseOrder());
    }
    
}
