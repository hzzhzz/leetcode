// Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
//
//        Note:
//
//        All letters in hexadecimal (a-f) must be in lowercase.
//        The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
//        The given number is guaranteed to fit within the range of a 32-bit signed integer.
//        You must not use any method provided by the library which converts/formats the number to hex directly.


import java.math.BigInteger;

public class ConvertNumberToHex405 {
    public String solution(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        char[] table = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        while (num != 0) {
            sb.append(table[(15 & num)]);
            num >>>= 4;
        }
        return sb.reverse().toString();

    }

}
