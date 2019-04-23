package by.bntu.fitr.poisit.egorivanenko.task4.controller;

import org.apache.log4j.Logger;
import by.bntu.fitr.poisit.egorivanenko.task4.model.entity.Matrix;
import by.bntu.fitr.poisit.egorivanenko.task4.model.logic.MatrixLogic;


public class Runner {
    
    private static final Logger LOG;
    
    static {
        LOG = Logger.getRootLogger();
    }
    
    public static void main(String[] args) {
      Matrix matrix = new Matrix(4,4);
      MatrixLogic.createRandomized(matrix);
      
      LOG.info(matrix);
      LOG.info("Столбец №" + MatrixLogic.isMinColumn(matrix) + 
              " имеет наименьшее произведение элементов");
      
    }
    
}
