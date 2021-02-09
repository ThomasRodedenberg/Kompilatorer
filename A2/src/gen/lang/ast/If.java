/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A2/A2-MinimalAST/src/jastadd/lang.ast:11
 * @astdecl If : Stmt ::= cond:Expr then:Block [else:Block];
 * @production If : {@link Stmt} ::= <span class="component">cond:{@link Expr}</span> <span class="component">then:{@link Block}</span> <span class="component">[else:{@link Block}]</span>;

 */
public class If extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public If() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"cond", "then", "else"},
    type = {"Expr", "Block", "Opt<Block>"},
    kind = {"Child", "Child", "Opt"}
  )
  public If(Expr p0, Block p1, Opt<Block> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
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
  public If clone() throws CloneNotSupportedException {
    If node = (If) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public If copy() {
    try {
      If node = (If) clone();
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
  public If fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public If treeCopyNoTransform() {
    If tree = (If) copy();
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
  public If treeCopy() {
    If tree = (If) copy();
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
  /**
   * Replaces the optional node for the else child. This is the <code>Opt</code>
   * node containing the child else, not the actual child!
   * @param opt The new node to be used as the optional node for the else child.
   * @apilevel low-level
   */
  public void setelseOpt(Opt<Block> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) else child.
   * @param node The new node to be used as the else child.
   * @apilevel high-level
   */
  public void setelse(Block node) {
    getelseOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional else child exists.
   * @return {@code true} if the optional else child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean haselse() {
    return getelseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) else child.
   * @return The else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Block getelse() {
    return (Block) getelseOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the else child. This is the <code>Opt</code> node containing the child else, not the actual child!
   * @return The optional node for child the else child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="else")
  public Opt<Block> getelseOpt() {
    return (Opt<Block>) getChild(2);
  }
  /**
   * Retrieves the optional node for child else. This is the <code>Opt</code> node containing the child else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child else.
   * @apilevel low-level
   */
  public Opt<Block> getelseOptNoTransform() {
    return (Opt<Block>) getChildNoTransform(2);
  }
}
