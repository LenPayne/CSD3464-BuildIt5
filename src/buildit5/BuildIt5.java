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

/**
 *
 * @author c0587637
 */
public class BuildIt5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        outputRecord();
        sayHi("Len", 4);
        mashup("Hello", "World");
        int valuePlusTwo = addTwo(2);

        double area1 = sphereArea(4);
        double area2 = sphereArea(100);
        double area3 = sphereArea(11111);
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println("Area of Cylinder 3x4 = " + cylinderArea(3, 4));
    }

    /**
     * Outputs a Student Record
     */
    public static void outputRecord() {
        System.out.println("First Name: Len");
        System.out.println("Last Name: Payne");
        System.out.println("College: Lambton College");
    }

    /**
     * Outputs 'Hi' to a specific name
     *
     * @param name the name to greet
     */
    public static void sayHi(String name) {
        System.out.println("Hi " + name + "!");
    }

    /**
     * Outputs 'Hi' to a specific name, a specific number of times
     *
     * @param name the name to greet
     * @param max the number of times to greet them
     */
    public static void sayHi(String name, int max) {
        for (int i = 0; i < max; i++) {
            sayHi(name);
        }
    }

    /**
     * Mash up two strings together in an ABAB pattern
     *
     * @param a the first string
     * @param b the second string
     */
    public static void mashup(String a, String b) {
        System.out.println(a + b + a + b);
    }

    /**
     * Adds two to a value and returns it
     *
     * @param x the original value
     * @return the original value, plus two
     */
    public static int addTwo(int x) {
        return x + 2;
    }

    /**
     * Provides the surface area for a sphere of a given radius
     *
     * @param radius the radius of the sphere
     * @return the surface area of the sphere
     */
    public static double sphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    /**
     * Provides the surface area of a cylinder with a given radius and height
     *
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     * @return the surface area of the cylinder
     */
    public static double cylinderArea(double r, double h) {
        return 2 * Math.PI * r * h + 2 * Math.PI * r * r;
    }
}
