/*
 * Copyright 2016 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package buildit5;

import buildit5.BuildIt5;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0587637
 */
public class BuildIt5Test {
    
    public BuildIt5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTwo method, of class BuildIt5.
     */
    @Test
    public void testAddTwo() {
        System.out.println("addTwo");
        int x = 0;
        int expResult = 2;
        int result = BuildIt5.addTwo(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of sphereArea method, of class BuildIt5.
     */
    @Test
    public void testSphereArea() {
        System.out.println("sphereArea");
        double radius = 1.0;
        double expResult = 12.56636;
        double result = BuildIt5.sphereArea(radius);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of cylinderArea method, of class BuildIt5.
     */
    @Test
    public void testCylinderArea() {
        System.out.println("cylinderArea");
        double r = 1.0;
        double h = 1.0;
        double expResult = 12.56636;
        double result = BuildIt5.cylinderArea(r, h);
        assertEquals(expResult, result, 0.0001);
    }
    
}
