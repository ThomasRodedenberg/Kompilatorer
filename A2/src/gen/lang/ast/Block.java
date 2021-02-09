/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A2/A2-MinimalAST/src/jastadd/lang.ast:4
 * @astdecl Block : ASTNode ::= [Stmt];
 * @production Block : {@link ASTNode} ::= <span class="component">[{@link Stmt}]</span>;

 */
public class Block extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Block() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Stmt"},
    type = {"Opt<Stmt>"},
    kind = {"Opt"}
  )
  public Block(Opt<Stmt> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
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
  public Block clone() throws CloneNotSupportedException {
    Block node = (Block) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Block copy() {
    try {
      Block node = (Block) clone();
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
  public Block fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public Block treeCopyNoTransform() {
    Block tree = (Block) copy();
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
  public Block treeCopy() {
    Block tree = (Block) copy();
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
   * Replaces the optional node for the Stmt child. This is the <code>Opt</code>
   * node containing the child Stmt, not the actual child!
   * @param opt The new node to be used as the optional node for the Stmt child.
   * @apilevel low-level
   */
  public void setStmtOpt(Opt<Stmt> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Stmt child.
   * @param node The new node to be used as the Stmt child.
   * @apilevel high-level
   */
  public void setStmt(Stmt node) {
    getStmtOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Stmt child exists.
   * @return {@code true} if the optional Stmt child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasStmt() {
    return getStmtOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Stmt child.
   * @return The Stmt child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Stmt getStmt() {
    return (Stmt) getStmtOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Stmt child. This is the <code>Opt</code> node containing the child Stmt, not the actual child!
   * @return The optional node for child the Stmt child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Stmt")
  public Opt<Stmt> getStmtOpt() {
    return (Opt<Stmt>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Stmt. This is the <code>Opt</code> node containing the child Stmt, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Stmt.
   * @apilevel low-level
   */
  public Opt<Stmt> getStmtOptNoTransform() {
    return (Opt<Stmt>) getChildNoTransform(0);
  }
}
