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
 * @aspect FunctionCalls
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/FunctionCalls.jrag:20
 */
public class Comp extends java.lang.Object implements Comparator<Function> {
  

    public int compare(Function f1, Function f2){
      return f1.getName().getID().compareTo(f2.getName().getID());
    }


}
