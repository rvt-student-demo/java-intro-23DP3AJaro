package lv.rvt;

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length() + " height: " + box.height() +
                         " width:  " + box.width() )  ;

    Box largerBox = box.biggerBox(box);
    System.out.println("25% bigger length: " + largerBox.length() +
                        " 25% bigger height: " + largerBox.height() +
                        " 25% bigger width: " + largerBox.width());

    Box smalleBox = box.smallerBox(box);
    System.out.println("25% smaller length: " + smalleBox.length() +
                        " 25% smaller height: " + smalleBox.height() +
                        " 25% smaller width: " + smalleBox.width());
  }
}
