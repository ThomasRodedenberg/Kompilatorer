/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.util.Set;
import java.util.TreeSet;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/lang.ast:6
 * @astdecl Stmt : ASTNode;
 * @production Stmt : {@link ASTNode};

 */
public abstract class Stmt extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Stmt() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:17
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    localLookup_String_reset();
    lookup_String_reset();
    inExpr_IdDecl_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:24
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public Stmt clone() throws CloneNotSupportedException {
    Stmt node = (Stmt) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:39
   */
  @Deprecated
  public abstract Stmt fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:47
   */
  public abstract Stmt treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:55
   */
  public abstract Stmt treeCopy();
/** @apilevel internal */
protected java.util.Set localLookup_String_visited;
  /** @apilevel internal */
  private void localLookup_String_reset() {
    localLookup_String_values = null;
    localLookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:87
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:87")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Stmt.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_value = unknownDecl();
    localLookup_String_values.put(_parameters, localLookup_String_value);
    state().leaveLazyAttribute();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:86
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:86")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Stmt.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_values.put(_parameters, lookup_String_value);
    state().leaveLazyAttribute();
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /** @apilevel internal */
  private void lookup_String_reset() {
    lookup_String_values = null;
    lookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookup_String_values;

  /**
   * @attribute inh
   * @aspect CircularDefinitions
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:118
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CircularDefinitions", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:118")
  public boolean inExpr(IdDecl decl) {
    Object _parameters = decl;
    if (inExpr_IdDecl_visited == null) inExpr_IdDecl_visited = new java.util.HashSet(4);
    if (inExpr_IdDecl_values == null) inExpr_IdDecl_values = new java.util.HashMap(4);
    ASTState state = state();
    if (inExpr_IdDecl_values.containsKey(_parameters)) {
      return (Boolean) inExpr_IdDecl_values.get(_parameters);
    }
    if (inExpr_IdDecl_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Stmt.inExpr(IdDecl).");
    }
    inExpr_IdDecl_visited.add(_parameters);
    state().enterLazyAttribute();
    boolean inExpr_IdDecl_value = getParent().Define_inExpr(this, null, decl);
    inExpr_IdDecl_values.put(_parameters, inExpr_IdDecl_value);
    state().leaveLazyAttribute();
    inExpr_IdDecl_visited.remove(_parameters);
    return inExpr_IdDecl_value;
  }
/** @apilevel internal */
protected java.util.Set inExpr_IdDecl_visited;
  /** @apilevel internal */
  private void inExpr_IdDecl_reset() {
    inExpr_IdDecl_values = null;
    inExpr_IdDecl_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map inExpr_IdDecl_values;

}
