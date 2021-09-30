import org.junit.Assert;
import org.junit.Test;

public class testWeek4 {

    @Test
    public void test_max2Int() {
        Assert.assertEquals(7, Week4.max2Int(7, 6));
    }

    @Test
    public void test_minArray() {
        int arr[] = {3, 4, 5};
        Assert.assertEquals(3, Week4.minArray(arr));
    }

    @Test
    public void test_BMI() {
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(4, 4));
    }
}
