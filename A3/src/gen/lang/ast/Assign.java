/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A3/A3-MinimalAST/src/jastadd/lang.ast:9
 * @astdecl Assign : Stmt ::= Name:IdUse Value:Expr;
 * @production Assign : {@link Stmt} ::= <span class="component">Name:{@link IdUse}</span> <span class="component">Value:{@link Expr}</span>;

 */
public class Assign extends Stmt implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A3/A3-MinimalAST/src/jastadd/Visitor.jrag:59
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A3/A3-MinimalAST/src/jastadd/PrettyPrint.jrag:60
   */
  public void prettyPrint(PrintStream out, String ind) {
		//out.print(ind);
		getName().prettyPrint(out,ind);
		out.print(" = ");
		getValue().prettyPrint(out,ind);
		out.print(";");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Assign() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "Value"},
    type = {"IdUse", "Expr"},
    kind = {"Child", "Child"}
  )
  public Assign(IdUse p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Assign clone() throws CloneNotSupportedException {
    Assign node = (Assign) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Assign copy() {
    try {
      Assign node = (Assign) clone();
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
   * @declaredat ASTNode:59
   */
  @Deprecated
  public Assign fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public Assign treeCopyNoTransform() {
    Assign tree = (Assign) copy();
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
   * @declaredat ASTNode:89
   */
  public Assign treeCopy() {
    Assign tree = (Assign) copy();
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
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Name child.
   * @param node The new node to replace the Name child.
   * @apilevel high-level
   */
  public void setName(IdUse node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Name child.
   * @return The current node used as the Name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Name")
  public IdUse getName() {
    return (IdUse) getChild(0);
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public IdUse getNameNoTransform() {
    return (IdUse) getChildNoTransform(0);
  }
  /**
   * Replaces the Value child.
   * @param node The new node to replace the Value child.
   * @apilevel high-level
   */
  public void setValue(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Value child.
   * @return The current node used as the Value child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Value")
  public Expr getValue() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Value child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Value child.
   * @apilevel low-level
   */
  public Expr getValueNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
}
