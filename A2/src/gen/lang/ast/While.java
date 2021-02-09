/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A2/A2-MinimalAST/src/jastadd/lang.ast:10
 * @astdecl While : Stmt ::= cond:Expr then:Block;
 * @production While : {@link Stmt} ::= <span class="component">cond:{@link Expr}</span> <span class="component">then:{@link Block}</span>;

 */
public class While extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public While() {
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
    name = {"cond", "then"},
    type = {"Expr", "Block"},
    kind = {"Child", "Child"}
  )
  public While(Expr p0, Block p1) {
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
  public While clone() throws CloneNotSupportedException {
    While node = (While) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public While copy() {
    try {
      While node = (While) clone();
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
  public While fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public While treeCopyNoTransform() {
    While tree = (While) copy();
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
  public While treeCopy() {
    While tree = (While) copy();
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
   * Replaces the cond child.
   * @param node The new node to replace the cond child.
   * @apilevel high-level
   */
  public void setcond(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the cond child.
   * @return The current node used as the cond child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="cond")
  public Expr getcond() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the cond child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the cond child.
   * @apilevel low-level
   */
  public Expr getcondNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the then child.
   * @param node The new node to replace the then child.
   * @apilevel high-level
   */
  public void setthen(Block node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the then child.
   * @return The current node used as the then child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="then")
  public Block getthen() {
    return (Block) getChild(1);
  }
  /**
   * Retrieves the then child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the then child.
   * @apilevel low-level
   */
  public Block getthenNoTransform() {
    return (Block) getChildNoTransform(1);
  }
}
