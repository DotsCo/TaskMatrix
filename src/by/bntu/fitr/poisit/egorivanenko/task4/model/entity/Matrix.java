package by.bntu.fitr.poisit.egorivanenko.task4.model.entity;

public class Matrix {
    public static final int DEFAULT_SIZE = 4;
    private int [][] matrix;
    
 
    public Matrix(int n, int m)
    {
        matrix = new int [n][m];
    }
   
     public Matrix()
    {
        matrix = new int [DEFAULT_SIZE][DEFAULT_SIZE];
    }
    
    public Matrix(int[][] matrix)
    {
        this.matrix = matrix;
    }
    
    public int getVerticalSize()
    {
        return matrix.length;
    }
    
    public int getHorizontalSize()
    {
        return matrix[0].length;
    }
    
    public int getElement(int i, int j)
    {
        return matrix[i][j];
    }
    
     public void setElement(int i, int j, int value)
    {
        matrix[i][j]= value;
    }
     
    @Override
     public String toString()
     {
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length;j++){
                builder.append(matrix[i][j]).append(" ");
            }
            builder.append("\n");
        }
            
     return builder.toString();
     }
}

