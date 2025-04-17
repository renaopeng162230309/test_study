package org.example;

public class StringUtilsManualTest {
    public static void main(String[] args) {
        System.out.println("=== StringUtils 手动单元测试 ===");
        testIsEmpty();
        testIsBlank();
        testTrim();
        
        System.out.println("\n测试完成！");
    }
    
    public static void testIsEmpty() {
        System.out.println("\n测试 isEmpty() 方法:");
        
        // 测试用例1: null输入
        boolean result1 = StringUtils.isEmpty(null);
        boolean expected1 = true;
        printTestResult("null输入", result1, expected1);
        
        // 测试用例2: 空字符串
        boolean result2 = StringUtils.isEmpty("");
        boolean expected2 = true;
        printTestResult("空字符串", result2, expected2);
        
        // 测试用例3: 空白字符串
        boolean result3 = StringUtils.isEmpty(" ");
        boolean expected3 = false;
        printTestResult("空白字符串", result3, expected3);
        
        // 测试用例4: 普通字符串
        boolean result4 = StringUtils.isEmpty("abc");
        boolean expected4 = false;
        printTestResult("普通字符串", result4, expected4);
    }
    
    public static void testIsBlank() {
        System.out.println("\n测试 isBlank() 方法:");

        // 测试用例1: null输入
        boolean result1 = StringUtils.isBlank(null);
        boolean expected1 = true;
        printTestResult("null输入", result1, expected1);

        // 测试用例2: 空字符串
        boolean result2 = StringUtils.isBlank("");
        boolean expected2 = true;
        printTestResult("空字符串", result2, expected2);

        // 测试用例3: 空白字符串
        boolean result3 = StringUtils.isBlank(" ");
        boolean expected3 = true;
        printTestResult("空白字符串", result3, expected3);

        // 测试用例4: 普通字符串
        boolean result4 = StringUtils.isBlank("abc");
        boolean expected4 = false;
        printTestResult("普通字符串", result4, expected4);

        // 测试用例5: 带空白字符的字符串
        boolean result5 = StringUtils.isBlank("  abc  ");
        boolean expected5 = false;
        printTestResult("带空白字符的字符串", result5, expected5);
    }

    private static void testTrim() {
        System.out.println("\n测试 trim() 方法:");

        // 测试用例1: null输入
        String result1 = StringUtils.trim(null);
        String expected1 = null;
        printTestResult("null输入", result1, expected1);

        // 测试用例2: 空字符串
        String result2 = StringUtils.trim("");
        String expected2 = "";
        printTestResult("空字符串", result2, expected2);

        // 测试用例3: 空白字符串
        String result3 = StringUtils.trim(" ");
        String expected3 = "";
        printTestResult("空白字符串", result3, expected3);

        // 测试用例4: 普通字符串
        String result4 = StringUtils.trim("abc");
        String expected4 = "abc";
        printTestResult("普通字符串", result4, expected4);

        // 测试用例5: 前后带空格的字符串
        String result5 = StringUtils.trim("  abc  ");
        String expected5 = "abc";
        printTestResult("前后带空格的字符串", result5, expected5);

        // 测试用例6: 中间有空格的字符串
        String result6 = StringUtils.trim("a b c");
        String expected6 = "a b c";
        printTestResult("中间有空格的字符串", result6, expected6);
    }

    private static void printTestResult(String testCase, Object result, Object expected) {
        boolean passed = (result == null && expected == null) || 
                         (result != null && result.equals(expected));
        
        System.out.println("[" + (passed ? "通过" : "失败") + "] " + testCase + 
                          " - 结果: " + result + ", 预期: " + expected);
    }
    
    private static void printTestResult(String testCase, boolean result, boolean expected) {
        System.out.println("[" + (result == expected ? "通过" : "失败") + "] " + testCase + 
                          " - 结果: " + result + ", 预期: " + expected);
    }
}