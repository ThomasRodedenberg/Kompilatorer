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
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/lang.ast:16
 * @astdecl IdUse : Expr ::= <ID:String>;
 * @production IdUse : {@link Expr} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class IdUse extends Expr implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Visitor.jrag:74
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/PrettyPrint.jrag:163
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getID());
	}
  /**
   * @aspect CodeGen
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:220
   */
  public void genCode(PrintStream out) {
    out.println("        movq " + decl().address() + ", %rax");
  }
  /**
   * @aspect Interpreter
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:132
   */
  @Override
  public int eval(ActivationRecord actrec){
    int value = actrec.get(decl().uniqueName());
    return value;
  }
  /**
   * @declaredat ASTNode:1
   */
  public IdUse() {
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
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ID"},
    type = {"String"},
    kind = {"Token"}
  )
  public IdUse(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public IdUse(beaver.Symbol p0) {
    setID(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    decl_reset();
    isCircular_reset();
    type_reset();
    isUsedCorrectly_reset();
    isFunction_reset();
    isVariable_reset();
    function_reset();
    lookup_String_reset();
    inExpr_IdDecl_reset();
    functionExpected_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public IdUse clone() throws CloneNotSupportedException {
    IdUse node = (IdUse) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public IdUse copy() {
    try {
      IdUse node = (IdUse) clone();
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
   * @declaredat ASTNode:70
   */
  @Deprecated
  public IdUse fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public IdUse treeCopyNoTransform() {
    IdUse tree = (IdUse) copy();
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
   * @declaredat ASTNode:100
   */
  public IdUse treeCopy() {
    IdUse tree = (IdUse) copy();
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
   * @declaredat ASTNode:114
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((IdUse) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
/** @apilevel internal */
protected boolean decl_visited = false;
  /** @apilevel internal */
  private void decl_reset() {
    decl_computed = false;
    
    decl_value = null;
    decl_visited = false;
  }
  /** @apilevel internal */
  protected boolean decl_computed = false;

  /** @apilevel internal */
  protected IdDecl decl_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:4")
  public IdDecl decl() {
    ASTState state = state();
    if (decl_computed) {
      return decl_value;
    }
    if (decl_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.decl().");
    }
    decl_visited = true;
    state().enterLazyAttribute();
    decl_value = lookup(getID());
    decl_computed = true;
    state().leaveLazyAttribute();
    decl_visited = false;
    return decl_value;
  }
/** @apilevel internal */
protected boolean isCircular_visited = false;
  /** @apilevel internal */
  private void isCircular_reset() {
    isCircular_computed = false;
    isCircular_visited = false;
  }
  /** @apilevel internal */
  protected boolean isCircular_computed = false;

  /** @apilevel internal */
  protected boolean isCircular_value;

  /**
   * @attribute syn
   * @aspect CircularDefinitions
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:116
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CircularDefinitions", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:116")
  public boolean isCircular() {
    ASTState state = state();
    if (isCircular_computed) {
      return isCircular_value;
    }
    if (isCircular_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.isCircular().");
    }
    isCircular_visited = true;
    state().enterLazyAttribute();
    isCircular_value = inExpr(decl());
    isCircular_computed = true;
    state().leaveLazyAttribute();
    isCircular_visited = false;
    return isCircular_value;
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:72
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:4")
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
    type_value = decl().type();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean isUsedCorrectly_visited = false;
  /** @apilevel internal */
  private void isUsedCorrectly_reset() {
    isUsedCorrectly_computed = false;
    isUsedCorrectly_visited = false;
  }
  /** @apilevel internal */
  protected boolean isUsedCorrectly_computed = false;

  /** @apilevel internal */
  protected boolean isUsedCorrectly_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:131
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:131")
  public boolean isUsedCorrectly() {
    ASTState state = state();
    if (isUsedCorrectly_computed) {
      return isUsedCorrectly_value;
    }
    if (isUsedCorrectly_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.isUsedCorrectly().");
    }
    isUsedCorrectly_visited = true;
    state().enterLazyAttribute();
    isUsedCorrectly_value = functionExpected() == isFunction();
    isUsedCorrectly_computed = true;
    state().leaveLazyAttribute();
    isUsedCorrectly_visited = false;
    return isUsedCorrectly_value;
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:133
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:133")
  public boolean isFunction() {
    ASTState state = state();
    if (isFunction_computed) {
      return isFunction_value;
    }
    if (isFunction_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.isFunction().");
    }
    isFunction_visited = true;
    state().enterLazyAttribute();
    isFunction_value = decl().isFunction();
    isFunction_computed = true;
    state().leaveLazyAttribute();
    isFunction_visited = false;
    return isFunction_value;
  }
/** @apilevel internal */
protected boolean isVariable_visited = false;
  /** @apilevel internal */
  private void isVariable_reset() {
    isVariable_computed = false;
    isVariable_visited = false;
  }
  /** @apilevel internal */
  protected boolean isVariable_computed = false;

  /** @apilevel internal */
  protected boolean isVariable_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:134
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:134")
  public boolean isVariable() {
    ASTState state = state();
    if (isVariable_computed) {
      return isVariable_value;
    }
    if (isVariable_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.isVariable().");
    }
    isVariable_visited = true;
    state().enterLazyAttribute();
    isVariable_value = decl().isFunction();
    isVariable_computed = true;
    state().leaveLazyAttribute();
    isVariable_visited = false;
    return isVariable_value;
  }
/** @apilevel internal */
protected boolean function_visited = false;
  /** @apilevel internal */
  private void function_reset() {
    function_computed = false;
    
    function_value = null;
    function_visited = false;
  }
  /** @apilevel internal */
  protected boolean function_computed = false;

  /** @apilevel internal */
  protected Function function_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:135
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:135")
  public Function function() {
    ASTState state = state();
    if (function_computed) {
      return function_value;
    }
    if (function_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.function().");
    }
    function_visited = true;
    state().enterLazyAttribute();
    function_value = decl().function();
    function_computed = true;
    state().leaveLazyAttribute();
    function_visited = false;
    return function_value;
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:5")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute IdUse.lookup(String).");
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:117
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CircularDefinitions", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:117")
  public boolean inExpr(IdDecl decl) {
    Object _parameters = decl;
    if (inExpr_IdDecl_visited == null) inExpr_IdDecl_visited = new java.util.HashSet(4);
    if (inExpr_IdDecl_values == null) inExpr_IdDecl_values = new java.util.HashMap(4);
    ASTState state = state();
    if (inExpr_IdDecl_values.containsKey(_parameters)) {
      return (Boolean) inExpr_IdDecl_values.get(_parameters);
    }
    if (inExpr_IdDecl_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute IdUse.inExpr(IdDecl).");
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

  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:129
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:129")
  public boolean functionExpected() {
    ASTState state = state();
    if (functionExpected_computed) {
      return functionExpected_value;
    }
    if (functionExpected_visited) {
      throw new RuntimeException("Circular definition of attribute IdUse.functionExpected().");
    }
    functionExpected_visited = true;
    state().enterLazyAttribute();
    functionExpected_value = getParent().Define_functionExpected(this, null);
    functionExpected_computed = true;
    state().leaveLazyAttribute();
    functionExpected_visited = false;
    return functionExpected_value;
  }
/** @apilevel internal */
protected boolean functionExpected_visited = false;
  /** @apilevel internal */
  private void functionExpected_reset() {
    functionExpected_computed = false;
    functionExpected_visited = false;
  }
  /** @apilevel internal */
  protected boolean functionExpected_computed = false;

  /** @apilevel internal */
  protected boolean functionExpected_value;

  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Errors.jrag:34
    if (decl().isUnknown()) {
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
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Errors.jrag:42
    if (isCircular()) {
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
    if (decl().isUnknown()) {
      collection.add(error("symbol '" + getID() + "' is not declared"));
    }
    if (isCircular()) {
      collection.add(error("the definition of symbol '" + getID() + "' is circular"));
    }
  }
}
