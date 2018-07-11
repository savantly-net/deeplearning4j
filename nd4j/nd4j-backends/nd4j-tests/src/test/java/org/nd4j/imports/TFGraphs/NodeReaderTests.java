package org.nd4j.imports.TFGraphs;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.Test;
import org.nd4j.linalg.factory.Nd4j;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Slf4j
public class NodeReaderTests {

    @Test
    public void testNodeReader_1() throws Exception {
        val array = NodeReader.readArray("ae_00", "BiasAdd.0");
        val exp = Nd4j.create(new double[]{0.75157526, 0.73641957, 0.50457279, -0.45943720, 0.58269453, 0.10282226, -0.45269983, -0.05505687, -0.46887864, -0.05584033}, new long[]{5 ,2});

        assertNotNull(array);
        assertEquals(exp, array);
    }
}
