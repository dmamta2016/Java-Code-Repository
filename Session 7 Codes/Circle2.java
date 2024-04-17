public class Circle2 {
private float rad; // Variable to store radius of a circle 
private float PI; // Variable to store value of PI

/**
 * No-argument constructor
 *
 */
public Circle2(){
PI = 3.14f;
}

/**
 * Overloaded constructor
 *
 * @param r a float variable to store the value of radius
*/
public Circle2(float r) {
this(); // Invoke the no-argument constructor rad = r;
}

}
