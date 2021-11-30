package Week1;

import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void test_is_triangle_1(){
        assert(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2(){
        assert (Demo.isTriangle(5, 12, 13));
    }
}
