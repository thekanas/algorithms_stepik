package by.stolybko.module1;

import org.junit.jupiter.api.Test;

import static by.stolybko.module1.Brackets.correctBrackets;
import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    @Test
    void correctBracketsTest() {

        assertEquals("Success", correctBrackets("([](){([])})"));
        assertEquals("Success", correctBrackets("*{}"));
        assertEquals("5", correctBrackets("()[]}"));
        assertEquals("7", correctBrackets("{{[()]]"));
        assertEquals("3", correctBrackets("{{{[][][]"));
        assertEquals("3", correctBrackets("{*{{}"));
        assertEquals("3", correctBrackets("{}([]"));
        assertEquals("13", correctBrackets("dasdsadsadas]]]"));
        assertEquals("1", correctBrackets("(slkj{lk[lsj]}"));
        assertEquals("Success", correctBrackets("(slkj, {lk[lve]} ,l)"));




    }
}