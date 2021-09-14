//Name:
//Date:
//Application:
//Purpose:

class CheckersBoard {
  public static void main(String[] args) {
    int[][] checkersArray = new int[8][8];

    final int ROW = 170; // this is 10101010 in binary

    for (int i=0; i<8; i++) {
      int currRow = ROW>>(i%2); // returns 10101010 for even rows and 01010101 for odd rows
      for (int j=0; j<8; j++) {
        if (i<3) {
          checkersArray[i][j]=((currRow>>7)%2); // gives the digit in the 8th place and shifts, which fills the row with the starting value of currRow.
        } else if (i>4) {
          checkersArray[i][j]=2*((currRow>>7)%2); // gives 2s and 0s in the3 bottom half.
        }                                         // Does nothing in rows 3 and 4.
        System.out.print(checkersArray[i][j]);
        currRow<<=1;      // does the shift before iterating j and repeating to fill out the row.
      }
      System.out.println();
    }
  }
}
