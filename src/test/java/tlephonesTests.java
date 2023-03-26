

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import org.example.MobilePhone;


public class tlephonesTests {

    @Test
    public void HashCodeAndEqualityTest() {
        MobilePhone mf1 = new MobilePhone("124-446-785", "Samsung", "Android",  41.46f);
        MobilePhone mf2 = new MobilePhone("124-446-785", "Samsung", "Android",  41.46f);
        int mf1Hash = mf1.hashCode();
        String strongMf1Hash = mf1.getStrongHash();
        int mf2hash = mf2.hashCode();
        String strongMf2Hash = mf2.getStrongHash();
        Assertions.assertEquals(mf1Hash, mf2hash);
        Assertions.assertEquals(strongMf1Hash, strongMf2Hash);
        Assertions.assertTrue(mf1.equals(mf2));
    }

}
