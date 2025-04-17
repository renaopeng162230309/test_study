import org.example.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsJUnitTest {
    
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));  // 这个测试会失败
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }
    
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void testTrim() {
        assertEquals(null, StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim(" abc "));
    }
}