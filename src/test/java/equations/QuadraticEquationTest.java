package equations;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class QuadraticEquationTest {

    /**
     * проверяет, что для уравнения x^2+1 = 0 корней нет (возвращается пустой массив)
     */
    @Test
    public void shouldReturnEmptyArray() {
        assertEquals(0, QuadraticEquation.solve(1, 0, 1).length);
    }

    /**
     * проверяет, что для уравнения x^2-1 = 0 есть два корня кратности 1 (x1=1, x2=-1)
     */
    @Test
    public void shouldReturnArrayWith2Doubles() {
        double[] solvedEquation = QuadraticEquation.solve(1, 0, -1);

        assertEquals(2, solvedEquation.length);
        double[] doubles = {1, -1};
        assertEquals(0, Arrays.compare(doubles, solvedEquation));
    }

    /**
     * проверяет, что для уравнения x^2+2x+1 = 0 есть один корень кратности 2 (x1= x2 = -1)
     * +
     * ____________________________ YOU ARE HERE ____________________________
     * подобрать такие коэффициенты квадратного уравнения для случая одного корня кратности два, чтобы дискриминант был
     * отличный от нуля, но меньше заданного эпсилон. Эти коэффициенты должны заменить коэффициенты в тесте из п. 7.
     */
    @Test
    public void shouldReturnArrayWith1Double() {
        double[] solvedEquation = QuadraticEquation.solve( 1 + QuadraticEquation.e * 0.1, 2, 1);

        assertEquals(1, solvedEquation.length);
        assertEquals(0, Arrays.compare(new double[]{-1}, solvedEquation));
    }

    /**
     * проверяет, что коэффициент a не может быть равен 0. В этом случае solve выбрасывает исключение.
     */
    @Test
    public void shouldConfirmACantBeEquals0() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
    }


}