public class soku {
    // sets our array size to 9 and makes sure it cant be changed since we need it 
at alot of place we set an final
    private static final int board_SIZE = 9;
 
    public static void main(String[] args) {
     
      int[][] board ={
      {3, 0, 6, 5, 0, 8, 4, 0, 0},
      {5, 2, 0, 0, 0, 0, 0, 0, 0},
      {0, 8, 7, 0, 0, 0, 0, 3, 1},
      {0, 0, 3, 0, 1, 0, 0, 8, 0},
      {9, 0, 0, 8, 6, 3, 0, 0, 5},
      {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
      {1, 3, 0, 0, 0, 0, 2, 5, 0},
      {0, 0, 0, 0, 0, 0, 0, 7, 4},
      {0, 0, 5, 2, 0, 6, 3, 0, 0} };
     
      System.out.println(" orginal  ");
      printBoard(board);
     
      if (solveBoard(board)) {
        System.out.println(" solved ");
      }
     
      printBoard(board);
      
    }
   
    //prints the board with lines  and make it look nice
   
    private static void printBoard(int[][] board) {
        for (int row = 0; row < board_SIZE; row++) {
          if (row % 3 == 0 && row != 0) {
            System.out.println("____________");
          }
          for (int column = 0; column < board_SIZE; column++) {
            if (column % 3 == 0 && column != 0) {
              System.out.print("|");
            }
            System.out.print(board[row][column]);
          }
          System.out.println();
        }
      }
  
    // checks for repating numbers 
    private static boolean row(int[][] board, int number, int row) {
      for (int i = 0; i < board_SIZE; i++) {
        if (board[row][i] == number) {
          return true;
        }
      }
      return false;
    }
   
    // checks for repeating columns
    private static boolean col(int[][] board, int number, int column) {
      for (int i = 0; i < board_SIZE; i++) {
        if (board[i][column] == number) {
          return true;
        }
      }
      return false;
    }
   
    //checking elsewhere 
    private static boolean box(int[][] board, int number, int row, int column) {
      int localBoxRow = row - row % 3;
      int localBoxColumn = column - column % 3;
     
      for (int i = localBoxRow; i < localBoxRow + 3; i++) {
        for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
          if (board[i][j] == number) {
            return true;
          }
        }
      }
      return false;
    }
   // check if its a valid placement if its all valid it returns false
    private static boolean valid(int[][] board, int number, int row, int column) {
      return !row(board, number, row) &&
          !col(board, number, column) &&
          !box(board, number, row, column);
    }
   
    private static boolean solveBoard(int[][] board) {
      for (int row = 0; row < board_SIZE; row++) {
        for (int column = 0; column < board_SIZE; column++) {
          if (board[row][column] == 0) {
            for (int num = 1; num <= board_SIZE; num++) {
              if (valid(board, num, row, column)) {
                board[row][column] = num;
   
                
                // recursion find the first blank spot and restart 
                if (solveBoard(board)) {
                  return true;
                }
                else {
                  board[row][column] = 0;
                }
              }
            }
            return false;
          }
        }
      }
      return true;
    }
}
