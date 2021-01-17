public class PerimeterandArea {
  public static void main(String[] args) {
  // We assign the length and width of the rectangle
  int length = 38;
  int width = 76;
  // the formula for perimeter is double the sum of the 
  //length and the width
  int perimeter = 2 * (length + width);
  // the area of a rectangle is the product of its length and width
  int area = length * width;
  
  // We print out the perimeter and the area of the rectangle
  System.out.println("The Perimeter is : " + perimeter);
	System.out.println("The Area is : " + area);

 }
}