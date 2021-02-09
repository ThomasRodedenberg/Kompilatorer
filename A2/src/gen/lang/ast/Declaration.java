/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A2/A2-MinimalAST/src/jastadd/lang.ast:8
 * @astdecl Declaration : Stmt ::= name:IdDecl [expr:Expr];
 * @production Declaration : {@link Stmt} ::= <span class="component">name:{@link IdDecl}</span> <span class="component">[expr:{@link Expr}]</span>;

 */
public class Declaration extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Declaration() {
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
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"name", "expr"},
    type = {"IdDecl", "Opt<Expr>"},
    kind = {"Child", "Opt"}
  )
  public Declaration(IdDecl p0, Opt<Expr> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public Declaration clone() throws CloneNotSupportedException {
    Declaration node = (Declaration) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public Declaration copy() {
    try {
      Declaration node = (Declaration) clone();
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
   * @declaredat ASTNode:60
   */
  @Deprecated
  public Declaration fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public Declaration treeCopyNoTransform() {
    Declaration tree = (Declaration) copy();
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
   * @declaredat ASTNode:90
   */
  public Declaration treeCopy() {
    Declaration tree = (Declaration) copy();
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
   * @declaredat ASTNode:104
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the name child.
   * @param node The new node to replace the name child.
   * @apilevel high-level
   */
  public void setname(IdDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the name child.
   * @return The current node used as the name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="name")
  public IdDecl getname() {
    return (IdDecl) getChild(0);
  }
  /**
   * Retrieves the name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the name child.
   * @apilevel low-level
   */
  public IdDecl getnameNoTransform() {
    return (IdDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the expr child. This is the <code>Opt</code>
   * node containing the child expr, not the actual child!
   * @param opt The new node to be used as the optional node for the expr child.
   * @apilevel low-level
   */
  public void setexprOpt(Opt<Expr> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) expr child.
   * @param node The new node to be used as the expr child.
   * @apilevel high-level
   */
  public void setexpr(Expr node) {
    getexprOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional expr child exists.
   * @return {@code true} if the optional expr child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasexpr() {
    return getexprOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) expr child.
   * @return The expr child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getexpr() {
    return (Expr) getexprOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the expr child. This is the <code>Opt</code> node containing the child expr, not the actual child!
   * @return The optional node for child the expr child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="expr")
  public Opt<Expr> getexprOpt() {
    return (Opt<Expr>) getChild(1);
  }
  /**
   * Retrieves the optional node for child expr. This is the <code>Opt</code> node containing the child expr, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child expr.
   * @apilevel low-level
   */
  public Opt<Expr> getexprOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(1);
  }
}
