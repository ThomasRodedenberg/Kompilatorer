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
 * Visitor interface for Calc language. Each concrete node type must
 * have a visit method.
 * @ast interface
 * @aspect Visitor
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Visitor.jrag:6
 */
public interface Visitor {

		 
		public Object visit(List node, Object data);

		 
		public Object visit(Opt node, Object data);

		 
		public Object visit(Program node, Object data);

       
      public Object visit(Function node, Object data);

       
      public Object visit(Block node, Object data);

       
      public Object visit(FunctionCallStmt node, Object data);

       
      public Object visit(Declaration node, Object data);

       
      public Object visit(Assign node, Object data);

       
      public Object visit(While node, Object data);

       
      public Object visit(If node, Object data);

       
      public Object visit(ReturnStmt node, Object data);

       
      public Object visit(FunctionCall node, Object data);

       
      public Object visit(IdUse node, Object data);

       
      public Object visit(IntegerValue node, Object data);

       
      public Object visit(Add node, Object data);

       
      public Object visit(Sub node, Object data);

		 
		public Object visit(Mul node, Object data);

		 
		public Object visit(Div node, Object data);

       
      public Object visit(Mod node, Object data);

       
      public Object visit(NotEqual node, Object data);

       
      public Object visit(Lesser node, Object data);

       
      public Object visit(Greater node, Object data);

       
      public Object visit(LesserEqual node, Object data);

       
      public Object visit(GreaterEqual node, Object data);

       
      public Object visit(Equal node, Object data);

		 
		public Object visit(IdDecl node, Object data);
}
