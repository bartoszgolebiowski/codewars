package ex16;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;


public class Opstrings1Test {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {

        testing(Opstrings1.oper(Opstrings1::rot, "fijuoo\nCqYVct\nDrPmMJ\nerfpBA\nkWjFUG\nCVUfyL"),
                "LyfUVC\nGUFjWk\nABpfre\nJMmPrD\ntcVYqC\nooujif");
        testing(Opstrings1.oper(Opstrings1::rot, "rkKv\ncofM\nzXkh\nflCB"),
                "BClf\nhkXz\nMfoc\nvKkr");

        System.out.println("Fixed Tests selfieAndRot");
        testing(Opstrings1.oper(Opstrings1::selfieAndRot, "xZBV\njsbS\nJcpN\nfVnP"),
                "xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx");
        testing(Opstrings1.oper(Opstrings1::selfieAndRot, "uLcq\nJkuL\nYirX\nnwMB"),
                "uLcq....\nJkuL....\nYirX....\nnwMB....\n....BMwn\n....XriY\n....LukJ\n....qcLu");
    }
}