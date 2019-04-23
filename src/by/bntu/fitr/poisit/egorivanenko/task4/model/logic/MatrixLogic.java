package by.bntu.fitr.poisit.egorivanenko.task4.model.logic;

import by.bntu.fitr.poisit.egorivanenko.task4.model.entity.Matrix;

public class MatrixLogic {
    
    public static Matrix createRandomized(Matrix matrix){
        for (int i = 0; i < matrix.getVerticalSize(); i++){
            for (int j = 0; j < matrix.getHorizontalSize(); j++){
                matrix.setElement(i, j, (int)(Math.random() * matrix.getVerticalSize()) + 1);
            }
        }
        
        return matrix;
    }  
    
    public static int MultiplicationOfColumnElements(Matrix matrix, int j){     // j - is a number of column      
        int MultiplicationOfColumnElements = 1;
           
        for (int i = 0; i < matrix.getVerticalSize(); i++){
            MultiplicationOfColumnElements *= matrix.getElement(i, j);              
        }
        
       return MultiplicationOfColumnElements;
    }
    
    public static int isMinColumn(Matrix matrix){
        Matrix minColumn = new Matrix(matrix.getHorizontalSize(),1); //единичная матрица
        final int identityMatrixColumn = 0;  //столбец единичной матрицы
        int numberOfMinColumn = 1;

        // Нахождение произведение элементов каждого из столбцов
        for (int j = 0; j < matrix.getHorizontalSize(); j++){
            minColumn.setElement(j, identityMatrixColumn, MultiplicationOfColumnElements(matrix,j));
        }
        
        int min = minColumn.getElement(0, identityMatrixColumn);
        for (int i = 0; i < minColumn.getVerticalSize(); i++){
            
            if (min > minColumn.getElement(i, identityMatrixColumn) ){
                min = minColumn.getElement(i, identityMatrixColumn);
                numberOfMinColumn = i + 1;
            }
        }
      
      return numberOfMinColumn;
    }
}
