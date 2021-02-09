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
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/lang.ast:15
 * @astdecl FunctionCall : Expr ::= Name:IdUse Expr:Expr*;
 * @production FunctionCall : {@link Expr} ::= <span class="component">Name:{@link IdUse}</span> <span class="component">Expr:{@link Expr}*</span>;

 */
public class FunctionCall extends Expr implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Visitor.jrag:71
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/PrettyPrint.jrag:88
   */
  public void prettyPrint(PrintStream out, String ind) {
		//out.print(ind);
		getName().prettyPrint(out,ind);
		out.print("(");
		int k = getNumExpr();
		for(int i=0;i < k; i++){
			getExpr(i).prettyPrint(out,ind);
			if(i<k-1){
				out.print(", ");
			}
		}
		out.print(")");
	}
  /**
   * @aspect Interpreter
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:88
   */
  @Override
  public int eval(ActivationRecord actrec){
    if(getName().decl().getID().equals("read")){
      int input = scan.nextInt();
      return input;
    }
    ActivationRecord newActrec = new ActivationRecord();
    Function f = getName().decl().function();
    for(int i=0;i<getNumExpr(); i++){
      newActrec.put(f.getParameter(i).getID(),getExpr(i).eval(actrec));
    }
    return f.eval(newActrec);

  }
  /**
   * @aspect Interpreter
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:199
   */
  private static final Scanner scan = new Scanner(System.in);
  /**
   * @declaredat ASTNode:1
   */
  public FunctionCall() {
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
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "Expr"},
    type = {"IdUse", "List<Expr>"},
    kind = {"Child", "List"}
  )
  public FunctionCall(IdUse p0, List<Expr> p1) {
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
    type_reset();
    isFunction_reset();
    correctNumParameter_reset();
    correctTypeParameter_reset();
    enclosingFunction_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public FunctionCall clone() throws CloneNotSupportedException {
    FunctionCall node = (FunctionCall) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public FunctionCall copy() {
    try {
      FunctionCall node = (FunctionCall) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public FunctionCall fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public FunctionCall treeCopyNoTransform() {
    FunctionCall tree = (FunctionCall) copy();
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
   * @declaredat ASTNode:95
   */
  public FunctionCall treeCopy() {
    FunctionCall tree = (FunctionCall) copy();
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
   * @declaredat ASTNode:109
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
   * Replaces the Expr list.
   * @param list The new list node to be used as the Expr list.
   * @apilevel high-level
   */
  public void setExprList(List<Expr> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Expr list.
   * @return Number of children in the Expr list.
   * @apilevel high-level
   */
  public int getNumExpr() {
    return getExprList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Expr list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Expr list.
   * @apilevel low-level
   */
  public int getNumExprNoTransform() {
    return getExprListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Expr list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Expr list.
   * @apilevel high-level
   */
  public Expr getExpr(int i) {
    return (Expr) getExprList().getChild(i);
  }
  /**
   * Check whether the Expr list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprList().getNumChild() != 0;
  }
  /**
   * Append an element to the Expr list.
   * @param node The element to append to the Expr list.
   * @apilevel high-level
   */
  public void addExpr(Expr node) {
    List<Expr> list = (parent == null) ? getExprListNoTransform() : getExprList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExprNoTransform(Expr node) {
    List<Expr> list = getExprListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Expr list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExpr(Expr node, int i) {
    List<Expr> list = getExprList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Expr")
  public List<Expr> getExprList() {
    List<Expr> list = (List<Expr>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprListNoTransform() {
    return (List<Expr>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Expr list without
   * triggering rewrites.
   */
  public Expr getExprNoTransform(int i) {
    return (Expr) getExprListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  public List<Expr> getExprs() {
    return getExprList();
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprsNoTransform() {
    return getExprListNoTransform();
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:73
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:4")
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
    type_value = getName().type();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean isFunction_visited = false;
  /** @apilevel internal */
  private void isFunction_reset() {
    isFunction_computed = false;
    isFunction_visited = false;
  }
  /** @apilevel internal */
  protected boolean isFunction_computed = false;

  /** @apilevel internal */
  protected boolean isFunction_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:119
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:119")
  public boolean isFunction() {
    ASTState state = state();
    if (isFunction_computed) {
      return isFunction_value;
    }
    if (isFunction_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionCall.isFunction().");
    }
    isFunction_visited = true;
    state().enterLazyAttribute();
    isFunction_value = isFunction_compute();
    isFunction_computed = true;
    state().leaveLazyAttribute();
    isFunction_visited = false;
    return isFunction_value;
  }
  /** @apilevel internal */
  private boolean isFunction_compute() {
    IdDecl dec = getName().decl();
      if(!dec.isUnknown()){
        return dec.isFunction();
      }
      return true;
    }
/** @apilevel internal */
protected boolean correctNumParameter_visited = false;
  /** @apilevel internal */
  private void correctNumParameter_reset() {
    correctNumParameter_computed = false;
    correctNumParameter_visited = false;
  }
  /** @apilevel internal */
  protected boolean correctNumParameter_computed = false;

  /** @apilevel internal */
  protected boolean correctNumParameter_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:152
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:152")
  public boolean correctNumParameter() {
    ASTState state = state();
    if (correctNumParameter_computed) {
      return correctNumParameter_value;
    }
    if (correctNumParameter_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionCall.correctNumParameter().");
    }
    correctNumParameter_visited = true;
    state().enterLazyAttribute();
    correctNumParameter_value = getNumExpr() == getName().decl().function().getNumParameter();
    correctNumParameter_computed = true;
    state().leaveLazyAttribute();
    correctNumParameter_visited = false;
    return correctNumParameter_value;
  }
/** @apilevel internal */
protected boolean correctTypeParameter_visited = false;
  /** @apilevel internal */
  private void correctTypeParameter_reset() {
    correctTypeParameter_computed = false;
    correctTypeParameter_visited = false;
  }
  /** @apilevel internal */
  protected boolean correctTypeParameter_computed = false;

  /** @apilevel internal */
  protected boolean correctTypeParameter_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:155
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:155")
  public boolean correctTypeParameter() {
    ASTState state = state();
    if (correctTypeParameter_computed) {
      return correctTypeParameter_value;
    }
    if (correctTypeParameter_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionCall.correctTypeParameter().");
    }
    correctTypeParameter_visited = true;
    state().enterLazyAttribute();
    correctTypeParameter_value = correctTypeParameter_compute();
    correctTypeParameter_computed = true;
    state().leaveLazyAttribute();
    correctTypeParameter_visited = false;
    return correctTypeParameter_value;
  }
  /** @apilevel internal */
  private boolean correctTypeParameter_compute() {
      if(hasExpr()){
        for(int i = 0; i < getNumExpr(); i++){
         if(!getExpr(i).type().compatibleType(intType())){
          return false;
         }
        }
      }
      return true;
    }
  /**
   * @attribute inh
   * @aspect FunctionCalls
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/FunctionCalls.jrag:13
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="FunctionCalls", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/FunctionCalls.jrag:13")
  public Function enclosingFunction() {
    ASTState state = state();
    if (enclosingFunction_computed) {
      return enclosingFunction_value;
    }
    if (enclosingFunction_visited) {
      throw new RuntimeException("Circular definition of attribute FunctionCall.enclosingFunction().");
    }
    enclosingFunction_visited = true;
    state().enterLazyAttribute();
    enclosingFunction_value = getParent().Define_enclosingFunction(this, null);
    enclosingFunction_computed = true;
    state().leaveLazyAttribute();
    enclosingFunction_visited = false;
    return enclosingFunction_value;
  }
/** @apilevel internal */
protected boolean enclosingFunction_visited = false;
  /** @apilevel internal */
  private void enclosingFunction_reset() {
    enclosingFunction_computed = false;
    
    enclosingFunction_value = null;
    enclosingFunction_visited = false;
  }
  /** @apilevel internal */
  protected boolean enclosingFunction_computed = false;

  /** @apilevel internal */
  protected Function enclosingFunction_value;

  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:129
   * @apilevel internal
   */
  public boolean Define_functionExpected(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:127
      return true;
    }
    else {
      return getParent().Define_functionExpected(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:129
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute functionExpected
   */
  protected boolean canDefine_functionExpected(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Errors.jrag:46
    if (!correctNumParameter()) {
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
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Errors.jrag:74
    if (!correctTypeParameter()) {
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
  protected void collect_contributors_Function_functionCalls(Function _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/FunctionCalls.jrag:9
    {
      Function target = (Function) (enclosingFunction());
      java.util.Set<ASTNode> contributors = _map.get(target);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) target, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_Function_functionCalls(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (!correctNumParameter()) {
      collection.add(error("Parameter mistmatch!"));
    }
    if (!correctTypeParameter()) {
      collection.add(error("Parameter type mistmatch!"));
    }
  }
  /** @apilevel internal */
  protected void contributeTo_Function_functionCalls(Set<Function> collection) {
    super.contributeTo_Function_functionCalls(collection);
    collection.add(getName().decl().function());
  }
}
