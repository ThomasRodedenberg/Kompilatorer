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
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/lang.ast:9
 * @astdecl Assign : Stmt ::= Name:IdUse Value:Expr;
 * @production Assign : {@link Stmt} ::= <span class="component">Name:{@link IdUse}</span> <span class="component">Value:{@link Expr}</span>;

 */
public class Assign extends Stmt implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Visitor.jrag:59
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/PrettyPrint.jrag:60
   */
  public void prettyPrint(PrintStream out, String ind) {
		//out.print(ind);
		getName().prettyPrint(out,ind);
		out.print(" = ");
		getValue().prettyPrint(out,ind);
		out.print(";");
	}
  /**
   * @aspect CodeGen
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:169
   */
  public void genCode(PrintStream out){
    getValue().genCode(out);
    out.println("        movq %rax, "+ getName().decl().address());
  }
  /**
   * @aspect Interpreter
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:42
   */
  @Override
  public void eval(ActivationRecord actrec){
    int value = getValue().eval(actrec);
    //actrec.remove(getName().decl().uniqueName());
    actrec.put(getName().decl().uniqueName(), value);
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
    compatibleType_reset();
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
  public Assign clone() throws CloneNotSupportedException {
    Assign node = (Assign) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
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
   * @declaredat ASTNode:60
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
   * @declaredat ASTNode:70
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
   * @declaredat ASTNode:90
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
   * @declaredat ASTNode:104
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:98
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:98")
  public boolean compatibleType() {
    ASTState state = state();
    if (compatibleType_computed) {
      return compatibleType_value;
    }
    if (compatibleType_visited) {
      throw new RuntimeException("Circular definition of attribute Assign.compatibleType().");
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
      return getValue().expectedType().compatibleType(getValue().type());
    }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:117
   * @apilevel internal
   */
  public boolean Define_inExpr(ASTNode _callerNode, ASTNode _childNode, IdDecl decl) {
    if (_callerNode == getValueNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:120
      return getName().getID() == decl.getID() || inExpr(decl);
    }
    else {
      return getParent().Define_inExpr(this, _callerNode, decl);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:117
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute inExpr
   */
  protected boolean canDefine_inExpr(ASTNode _callerNode, ASTNode _childNode, IdDecl decl) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   */
  public Type Define_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getValueNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:81
      return intType();
    }
    else {
      return getParent().Define_expectedType(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:78
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute expectedType
   */
  protected boolean canDefine_expectedType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:137
      return true;
    }
    else {
      return getParent().Define_isVariable(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isVariable
   */
  protected boolean canDefine_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:116
   * @apilevel internal
   */
  public boolean Define_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:138
      return false;
    }
    else {
      return getParent().Define_isFunction(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:116
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isFunction
   */
  protected boolean canDefine_isFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Errors.jrag:50
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
      collection.add(error("Assign type mistmatch!"));
    }
  }
}
