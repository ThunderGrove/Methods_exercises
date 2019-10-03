import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest{
    @Test
    void findMidt(){
        assertEquals(8,Main.findMidt(6,10,8),"The return is not 8");
        assertEquals(8,Main.findMidt(6,8,8),"The return is not 8");
        assertEquals(6,Main.findMidt(6,4,8),"The return is not 6");
        assertEquals(0,Main.findMidt(0,-900,450),"The return is not 0");
        assertEquals(10,Main.findMidt(12,10,8),"The return is not 10");
        assertEquals(-321,Main.findMidt(-963,-123,-321),"The return is not -321");
        assertEquals(4444,Main.findMidt(4444,22,88888888),"The return is not 4444");
        assertEquals(333,Main.findMidt(333,55555,1),"The return is not 333");
    }

    @Test
    void inc(){
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10},Main.inc(new int[]{0,1,2,3,4,5,6,7,8,9}),"Failled 1. array test");
        assertArrayEquals(new int[]{-8,-7,-6,-5,-4,-3,-2,-1,0,1},Main.inc(new int[]{-9,-8,-7,-6,-5,-4,-3,-2,-1,0}),"Failled 2. array test");
        assertArrayEquals(new int[]{5,4,3,2,1},Main.inc(new int[]{4,3,2,1,0}),"Failled 3. array test");
        assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},Main.inc(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}),"Failled 4. array test");
        assertArrayEquals(new int[]{1000},Main.inc(new int[]{999}),"Failled 5. array test");
    }

    @Test
    void math(){
        assertEquals(2.3,Main.math("add",1.2,1.1),"Failed the add test");
        assertEquals(1,Main.math("sub",3,2),"Failed the sub test");
        assertEquals(4,Main.math("multi",2,2),"Failed the multi test");
        assertEquals(1,Main.math("divi",2,2),"Failed the divi test");
        assertEquals(1,Main.math("mod",5,2),"Failed the mod test");
    }
}