/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
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
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/lang.ast:17
 * @astdecl IntegerValue : Expr ::= <INTEGER:String>;
 * @production IntegerValue : {@link Expr} ::= <span class="component">&lt;INTEGER:String&gt;</span>;

 */
public class IntegerValue extends Expr implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Visitor.jrag:77
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/PrettyPrint.jrag:160
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getINTEGER());
	}
  /**
   * @aspect CodeGen
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:224
   */
  public void genCode(PrintStream out) {
    out.println("        movq $" + getINTEGER() + ", %rax");
  }
  /**
   * @aspect Interpreter
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:103
   */
  @Override
  public int eval(ActivationRecord actrec) {
    return Integer.parseInt(getINTEGER());
  }
  /**
   * @declaredat ASTNode:1
   */
  public IntegerValue() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"INTEGER"},
    type = {"String"},
    kind = {"Token"}
  )
  public IntegerValue(String p0) {
    setINTEGER(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public IntegerValue(beaver.Symbol p0) {
    setINTEGER(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    type_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public IntegerValue clone() throws CloneNotSupportedException {
    IntegerValue node = (IntegerValue) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public IntegerValue copy() {
    try {
      IntegerValue node = (IntegerValue) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:61
   */
  @Deprecated
  public IntegerValue fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public IntegerValue treeCopyNoTransform() {
    IntegerValue tree = (IntegerValue) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:91
   */
  public IntegerValue treeCopy() {
    IntegerValue tree = (IntegerValue) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_INTEGER == ((IntegerValue) node).tokenString_INTEGER);    
  }
  /**
   * Replaces the lexeme INTEGER.
   * @param value The new value for the lexeme INTEGER.
   * @apilevel high-level
   */
  public void setINTEGER(String value) {
    tokenString_INTEGER = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_INTEGER;
  /**
   */
  public int INTEGERstart;
  /**
   */
  public int INTEGERend;
  /**
   * JastAdd-internal setter for lexeme INTEGER using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme INTEGER
   * @apilevel internal
   */
  public void setINTEGER(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setINTEGER is only valid for String lexemes");
    tokenString_INTEGER = (String)symbol.value;
    INTEGERstart = symbol.getStart();
    INTEGERend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme INTEGER.
   * @return The value for the lexeme INTEGER.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="INTEGER")
  public String getINTEGER() {
    return tokenString_INTEGER != null ? tokenString_INTEGER : "";
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /** @apilevel internal */
  private void type_reset() {
    type_computed = false;
    
    type_value = null;
    type_visited = false;
  }
  /** @apilevel internal */
  protected boolean type_computed = false;

  /** @apilevel internal */
  protected Type type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:71
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:4")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Expr.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = intType();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
}
