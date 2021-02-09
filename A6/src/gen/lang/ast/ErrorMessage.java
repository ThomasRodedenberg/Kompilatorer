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
 * @aspect Errors
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Errors.jrag:5
 */
public class ErrorMessage extends java.lang.Object implements Comparable<ErrorMessage> {
  
		protected final String message;

  
		protected final int lineNumber;

  
		public ErrorMessage(String message, int lineNumber) {
			this.message = message;
			this.lineNumber = lineNumber;
		}

  
		public int compareTo(ErrorMessage other) {
			if (lineNumber == other.lineNumber) {
				return message.compareTo(other.message);
			}
			return Integer.compare(lineNumber, other.lineNumber);
		}

  
		public String toString() {
			return "Error at line " + lineNumber + ": " + message;
		}


}
