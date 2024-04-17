public class NewCircle {
float area;  // variable to store area of a circle

/**
 * Returns the value of PI
 *
 * @return  float
 */
public float getPI(){
return 3.14f;
}
/**
 * Calculates area of a circle 
 * @param rad an integer to store the radius 
 * @return    void
 */
public void calcArea(int rad) {
this.area = getPI() * rad * rad;
}
}
