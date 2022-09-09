import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonyUtilTest {

    @Test
    public void moneyTest(){
        String money = MonyUtil.format(1000);
        assertEquals("$1000,00" , money);
    }

    @Test
    public void moneyTestNegative(){
        String money = MonyUtil.format(-1000);
        assertEquals("-$1000,00" , money);
    }

    @Test
    public void euroMoneyTest(){
        String money = MonyUtil.format(1000, "€");
        assertEquals("€1000,00" , money);
    }

    @Test
    public void euroMoneyTestNegative(){
        String money = MonyUtil.format(-1000, "€");
        assertEquals("-€1000,00" , money);
    }

    @Test
    public void euroMoneyTestNull() {
        assertThrows(NullPointerException.class,
                ()->{MonyUtil.format(-1000, null);});
    }
}