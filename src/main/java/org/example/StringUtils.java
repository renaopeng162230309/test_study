package org.example;

public class StringUtils {

    /**
     * 检查字符序列是否为空
     * @param cs 要检查的字符序列(可能为null)
     * @return 如果字符序列为null或长度为0，则返回true
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 检查字符序列是否为空白(空白、空或null)
     * @param cs 要检查的字符序列(可能为null)
     * @return 如果字符序列为null、空或仅包含空白字符，则返回true
     */
    public static boolean isBlank(final CharSequence cs) {
        if (isEmpty(cs)) {
            return true;
        }
        for (int i = 0; i < cs.length(); i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    /**
     * 去除字符串两端的空白字符(包括全角空格)
     * 增强版trim方法
     * @param str 要处理的字符串(可能为null)
     * @return 去除两端空白后的字符串，如果输入为null则返回null
     */
    public static String trim(final String str) {
        if (str == null) {
            return null;
        }

        int len = str.length();
        int start = 0;
        int end = len - 1;

        // 找到第一个非空白字符
        while (start <= end && isWhitespace(str.charAt(start))) {
            start++;
        }
        if (start > 0) start--;  // 这行是错误注入
        // 找到最后一个非空白字符
        while (end >= start && isWhitespace(str.charAt(end))) {
            end--;
        }

        if (start > end) {
            return "";
        }

        return str.substring(start, end + 1);
    }

    /**
     * 检查字符是否为空白字符(包括全角空格)
     * @param ch 要检查的字符
     * @return 如果是空白字符返回true
     */
    private static boolean isWhitespace(char ch) {
        return Character.isWhitespace(ch)
                || ch == '\u3000'; // 全角空格
    }
}