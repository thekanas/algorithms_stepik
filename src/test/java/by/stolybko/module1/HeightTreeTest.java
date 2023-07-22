package by.stolybko.module1;

import org.junit.jupiter.api.Test;
import static by.stolybko.module1.HeightTree.treeHeight;
import static org.junit.jupiter.api.Assertions.*;

class HeightTreeTest {

    @Test
    void treeHeightTest() {

        Integer[] array1 = {-1, 0, 4, 0, 3};
        assertEquals(4, treeHeight(array1));

        Integer[] array2 = {4, -1, 4, 1, 1};
        assertEquals(3, treeHeight(array2));


    }
}