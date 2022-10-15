package MathUtilDDTTest;

import com.tiendat.mathutil.core.MathUtil;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {  {0, 1},
                                                 {1, 1},
                                                 {2, 2},    
                                                 {3,6}, 
                                                 {4, 24}, 
                                                 {5, 120}, 
                                                 {6, 720}};
    }
    
    @Parameterized.Parameter(value = 0)
    public int input;
    
    @Parameterized.Parameter(value = 1)
    public long expectecd;
    
    @Test
    public void testGetFactorialGivenRightArgumentsReturnWells() {
        assertEquals(expectecd, MathUtil.getFactorial( input));
    }
}
