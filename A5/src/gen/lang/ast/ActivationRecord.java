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
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:212
 */
public class ActivationRecord extends java.lang.Object {
  

		private final HashMap<String, Integer> hmap;

  

		public ActivationRecord() {
			hmap = new HashMap<String, Integer>();
		}

  

    public void put(String s, int val){
//      if(hmap.containsKey(s)){
//       hmap.remove(s);
//      }
      hmap.put(s,val);
    }

  

    public int get(String s){
      return hmap.get(s);
    }

  

    public void remove(String s){
      hmap.remove(s);
    }


}
