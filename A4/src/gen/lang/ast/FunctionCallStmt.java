/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.util.Set;
import java.util.TreeSet;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/lang.ast:7
 * @astdecl FunctionCallStmt : Stmt ::= Fc:FunctionCall;
 * @production FunctionCallStmt : {@link Stmt} ::= <span class="component">Fc:{@link FunctionCall}</span>;

 */
public class FunctionCallStmt extends Stmt implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/Visitor.jrag:53
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/PrettyPrint.jrag:101
   */
  public void prettyPrint(PrintStream out, String ind) {
		getFc().prettyPrint(out,ind);
		out.print(";");
	}
  /**
   * @declaredat ASTNode:1
   */
  public FunctionCallStmt() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Fc"},
    type = {"FunctionCall"},
    kind = {"Child"}
  )
  public FunctionCallStmt(FunctionCall p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public FunctionCallStmt clone() throws CloneNotSupportedException {
    FunctionCallStmt node = (FunctionCallStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public FunctionCallStmt copy() {
    try {
      FunctionCallStmt node = (FunctionCallStmt) clone();
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
   * @declaredat ASTNode:58
   */
  @Deprecated
  public FunctionCallStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:68
   */
  public FunctionCallStmt treeCopyNoTransform() {
    FunctionCallStmt tree = (FunctionCallStmt) copy();
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
   * @declaredat ASTNode:88
   */
  public FunctionCallStmt treeCopy() {
    FunctionCallStmt tree = (FunctionCallStmt) copy();
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
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Fc child.
   * @param node The new node to replace the Fc child.
   * @apilevel high-level
   */
  public void setFc(FunctionCall node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Fc child.
   * @return The current node used as the Fc child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Fc")
  public FunctionCall getFc() {
    return (FunctionCall) getChild(0);
  }
  /**
   * Retrieves the Fc child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Fc child.
   * @apilevel low-level
   */
  public FunctionCall getFcNoTransform() {
    return (FunctionCall) getChildNoTransform(0);
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getFcNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:79
      return intType();
    }
    else {
      return getParent().Define_expectedType(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute expectedType
   */
  protected boolean canDefine_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
}
