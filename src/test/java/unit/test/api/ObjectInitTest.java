package unit.test.api;

import com.alibaba.fastjson.JSON;

import org.junit.Test;

public class ObjectInitTest {
    ObjectInit objectInit = null;

    @Test
    public void testRandom() {
        Test3 random = ObjectInit.random(Test3.class);
        System.out.println(JSON.toJSONString(random));

    }

}