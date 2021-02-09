/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.util.Set;
import java.util.TreeSet;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/lang.ast:8
 * @astdecl Declaration : Stmt ::= Name:IdDecl [Expr:Expr];
 * @production Declaration : {@link Stmt} ::= <span class="component">Name:{@link IdDecl}</span> <span class="component">[Expr:{@link Expr}]</span>;

 */
public class Declaration extends Stmt implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/Visitor.jrag:56
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/PrettyPrint.jrag:51
   */
  public void prettyPrint(PrintStream out, String ind) {
		//out.print(ind);
		getName().prettyPrint(out,ind);
		if(hasExpr()){
			out.print(" = ");
			getExpr().prettyPrint(out,ind);
		}
		out.print(";");
	}
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
    name = {"Name", "Expr"},
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
    localLookup_String_reset();
    compatibleType_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public Declaration clone() throws CloneNotSupportedException {
    Declaration node = (Declaration) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
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
   * @declaredat ASTNode:62
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
   * @declaredat ASTNode:72
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
   * @declaredat ASTNode:92
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
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Name child.
   * @param node The new node to replace the Name child.
   * @apilevel high-level
   */
  public void setName(IdDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Name child.
   * @return The current node used as the Name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Name")
  public IdDecl getName() {
    return (IdDecl) getChild(0);
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public IdDecl getNameNoTransform() {
    return (IdDecl) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Expr child. This is the <code>Opt</code>
   * node containing the child Expr, not the actual child!
   * @param opt The new node to be used as the optional node for the Expr child.
   * @apilevel low-level
   */
  public void setExprOpt(Opt<Expr> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Expr child.
   * @param node The new node to be used as the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    getExprOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Expr child exists.
   * @return {@code true} if the optional Expr child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Expr child.
   * @return The Expr child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getExpr() {
    return (Expr) getExprOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Expr child. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * @return The optional node for child the Expr child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Expr")
  public Opt<Expr> getExprOpt() {
    return (Opt<Expr>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Expr. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Expr.
   * @apilevel low-level
   */
  public Opt<Expr> getExprOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(1);
  }
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:89
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:89")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Declaration.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_value = localLookup_compute(name);
    localLookup_String_values.put(_parameters, localLookup_String_value);
    state().leaveLazyAttribute();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /** @apilevel internal */
  private IdDecl localLookup_compute(String name) {
  		return getName().getID().equals(name) ? getName() : unknownDecl();
  	}
/** @apilevel internal */
protected boolean compatibleType_visited = false;
  /** @apilevel internal */
  private void compatibleType_reset() {
    compatibleType_computed = false;
    compatibleType_visited = false;
  }
  /** @apilevel internal */
  protected boolean compatibleType_computed = false;

  /** @apilevel internal */
  protected boolean compatibleType_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:91
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:91")
  public boolean compatibleType() {
    ASTState state = state();
    if (compatibleType_computed) {
      return compatibleType_value;
    }
    if (compatibleType_visited) {
      throw new RuntimeException("Circular definition of attribute Declaration.compatibleType().");
    }
    compatibleType_visited = true;
    state().enterLazyAttribute();
    compatibleType_value = compatibleType_compute();
    compatibleType_computed = true;
    state().leaveLazyAttribute();
    compatibleType_visited = false;
    return compatibleType_value;
  }
  /** @apilevel internal */
  private boolean compatibleType_compute() {
      if(hasExpr()){
        return getExpr().expectedType().compatibleType(getExpr().type());
      }
      return true;
    }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getExprOptNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:80
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
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:140
      return true;
    }
    else {
      return getParent().Define_isVariable(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isVariable
   */
  protected boolean canDefine_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:116
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:141
      return false;
    }
    else {
      return getParent().Define_isFunction(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:116
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isFunction
   */
  protected boolean canDefine_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/Errors.jrag:58
    if (!compatibleType()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (!compatibleType()) {
      collection.add(error("Declaration type mistmatch!"));
    }
  }
}
