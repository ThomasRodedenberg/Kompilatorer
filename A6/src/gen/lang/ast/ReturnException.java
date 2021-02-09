package lang.ast;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:201
 */
public class ReturnException extends RuntimeException {
  
    private int returnVal;

  

    public ReturnException(int v){
      returnVal = v;
    }

  
    public int getReturnValue(){
      return returnVal;
    }


}
