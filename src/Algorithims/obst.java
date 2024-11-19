package Algorithims;

public class obst {
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Graph of E\n");

    // Get number of rows and columns
    int rows = e.length;
    int cols = e[0].length;

    // Print the header row with column indices
    sb.append("    ");
    for (int col = 0; col < cols; col++) {
      sb.append(String.format("%4d", col));
    }
    sb.append("\n");

    // Print the row indices and data
    for (int row = 1; row < rows; row++) {
      sb.append(String.format("%3d", row));
      sb.append(" ");
      for (int col = 0; col < cols; col++) {
        sb.append(String.format("%1.2f", e[row][col]));
        sb.append(" ");

      }
      sb.append("\n");
    }

    sb.append("Graph of W\n");

    // Get number of rows and columns
     rows = w.length;
     cols = w[0].length;

    // Print the header row with column indices
    sb.append("    ");
    for (int col = 0; col < cols; col++) {
      sb.append(String.format("%4d", col));
    }
    sb.append("\n");

    // Print the row indices and data
    for (int row = 1; row < rows; row++) {
      sb.append(String.format("%3d", row));
      sb.append(" ");

      for (int col = 0; col < cols; col++) {
        sb.append(String.format("%1.2f", w[row][col]));
        sb.append(" ");

      }
      sb.append("\n");
    }


    sb.append("Graph of Roots\n");

    // Get number of rows and columns
    rows = roots.length;
    cols = roots[0].length;

    // Print the header row with column indices
    sb.append("   ");
    for (int col = 1; col < cols; col++) {
      sb.append(String.format("%2d", col));
    }
    sb.append("\n");

    // Print the row indices and data
    for (int row = 1; row < rows; row++) {
      sb.append(String.format("%3d", row));
      for (int col = 1; col < cols; col++) {
        sb.append(String.format("%2d", roots[row][col]));
      }
      sb.append("\n");
    }


    return sb.toString();
  }
  double[][] e;
  double[][] w;
  int[][] roots;
  public void obstCreation(double[][] values){
    roots = new int[values[0].length][values[0].length];
    e = new double[values[0].length+1][values[0].length];
    w = new double[values[0].length+1][values[0].length];
    for(int i =0;i<values[0].length; ++i){
      w[i+1][i] = values[1][i];
      e[i+1][i] = values[1][i];
    }
    for(int i =1;i<values[0].length; ++i){
      w[i][i] = values[0][i] + w[i][i-1] +w[i+1][i] ;
      e[i][i] = w[i][i-1] + w[i+1][i] +  w[i][i];
      roots[i][i]=i;
    }

    for(int i =2;i<=values[0].length; ++i){
      for (int j = i; j < values[0].length; j++) {
        calculate(j-i+1, j);

      }
    }

  }
  public void calculate(int row, int col){
    double forW = w[row+1][col] + w[row][col-1] -w[row+1][col-1];
    w[row][col] = forW;
    double minE = Integer.MAX_VALUE;
    int root = 0;
    //
    for(int L=row; L<= col; ++L){
      double possible = e[row][L-1] + e[L+1][col] + forW;
      if(possible<minE){
        minE= possible;
        root = L;
      }
    }
    e[row][col] = minE;
    roots[row][col] = root;

  }


}
