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
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/lang.ast:33
 * @astdecl IdDecl : ASTNode ::= <ID:String>;
 * @production IdDecl : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class IdDecl extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Visitor.jrag:113
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/PrettyPrint.jrag:167
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("int ");
		out.print(getID());
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdDecl() {
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
  public IdDecl(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public IdDecl(beaver.Symbol p0) {
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
    isMultiDeclared_reset();
    isUnknown_reset();
    type_reset();
    uniqueName_reset();
    lookup_String_reset();
    isVariable_reset();
    isFunction_reset();
    function_reset();
    uniquePrefix_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public IdDecl clone() throws CloneNotSupportedException {
    IdDecl node = (IdDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public IdDecl copy() {
    try {
      IdDecl node = (IdDecl) clone();
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
   * @declaredat ASTNode:69
   */
  @Deprecated
  public IdDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public IdDecl treeCopyNoTransform() {
    IdDecl tree = (IdDecl) copy();
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
   * @declaredat ASTNode:99
   */
  public IdDecl treeCopy() {
    IdDecl tree = (IdDecl) copy();
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
   * @declaredat ASTNode:113
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((IdDecl) node).tokenString_ID);    
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
protected boolean isMultiDeclared_visited = false;
  /** @apilevel internal */
  private void isMultiDeclared_reset() {
    isMultiDeclared_computed = false;
    isMultiDeclared_visited = false;
  }
  /** @apilevel internal */
  protected boolean isMultiDeclared_computed = false;

  /** @apilevel internal */
  protected boolean isMultiDeclared_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/NameAnalysis.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/NameAnalysis.jrag:8")
  public boolean isMultiDeclared() {
    ASTState state = state();
    if (isMultiDeclared_computed) {
      return isMultiDeclared_value;
    }
    if (isMultiDeclared_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.isMultiDeclared().");
    }
    isMultiDeclared_visited = true;
    state().enterLazyAttribute();
    isMultiDeclared_value = lookup(getID()) != this;
    isMultiDeclared_computed = true;
    state().leaveLazyAttribute();
    isMultiDeclared_visited = false;
    return isMultiDeclared_value;
  }
/** @apilevel internal */
protected boolean isUnknown_visited = false;
  /** @apilevel internal */
  private void isUnknown_reset() {
    isUnknown_computed = false;
    isUnknown_visited = false;
  }
  /** @apilevel internal */
  protected boolean isUnknown_computed = false;

  /** @apilevel internal */
  protected boolean isUnknown_value;

  /**
   * @attribute syn
   * @aspect UnknownDecl
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/UnknownDecl.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="UnknownDecl", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/UnknownDecl.jrag:7")
  public boolean isUnknown() {
    ASTState state = state();
    if (isUnknown_computed) {
      return isUnknown_value;
    }
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.isUnknown().");
    }
    isUnknown_visited = true;
    state().enterLazyAttribute();
    isUnknown_value = false;
    isUnknown_computed = true;
    state().leaveLazyAttribute();
    isUnknown_visited = false;
    return isUnknown_value;
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:75
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:75")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = intType();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean uniqueName_visited = false;
  /** @apilevel internal */
  private void uniqueName_reset() {
    uniqueName_computed = false;
    
    uniqueName_value = null;
    uniqueName_visited = false;
  }
  /** @apilevel internal */
  protected boolean uniqueName_computed = false;

  /** @apilevel internal */
  protected String uniqueName_value;

  /**
   * @attribute syn
   * @aspect uniqueName
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:239
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="uniqueName", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:239")
  public String uniqueName() {
    ASTState state = state();
    if (uniqueName_computed) {
      return uniqueName_value;
    }
    if (uniqueName_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.uniqueName().");
    }
    uniqueName_visited = true;
    state().enterLazyAttribute();
    uniqueName_value = uniqueName_compute();
    uniqueName_computed = true;
    state().leaveLazyAttribute();
    uniqueName_visited = false;
    return uniqueName_value;
  }
  /** @apilevel internal */
  private String uniqueName_compute() {
      return uniquePrefix() + getID();
    }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/NameAnalysis.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/NameAnalysis.jrag:7")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute IdDecl.lookup(String).");
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
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:115")
  public boolean isVariable() {
    ASTState state = state();
    if (isVariable_computed) {
      return isVariable_value;
    }
    if (isVariable_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.isVariable().");
    }
    isVariable_visited = true;
    state().enterLazyAttribute();
    isVariable_value = getParent().Define_isVariable(this, null);
    isVariable_computed = true;
    state().leaveLazyAttribute();
    isVariable_visited = false;
    return isVariable_value;
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
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:116
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:116")
  public boolean isFunction() {
    ASTState state = state();
    if (isFunction_computed) {
      return isFunction_value;
    }
    if (isFunction_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.isFunction().");
    }
    isFunction_visited = true;
    state().enterLazyAttribute();
    isFunction_value = getParent().Define_isFunction(this, null);
    isFunction_computed = true;
    state().leaveLazyAttribute();
    isFunction_visited = false;
    return isFunction_value;
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
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:117
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/TypeAnalysis.jrag:117")
  public Function function() {
    ASTState state = state();
    if (function_computed) {
      return function_value;
    }
    if (function_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.function().");
    }
    function_visited = true;
    state().enterLazyAttribute();
    function_value = getParent().Define_function(this, null);
    function_computed = true;
    state().leaveLazyAttribute();
    function_visited = false;
    return function_value;
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
   * @attribute inh
   * @aspect uniqueName
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:243
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="uniqueName", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Interpreter.jrag:243")
  public String uniquePrefix() {
    ASTState state = state();
    if (uniquePrefix_computed) {
      return uniquePrefix_value;
    }
    if (uniquePrefix_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.uniquePrefix().");
    }
    uniquePrefix_visited = true;
    state().enterLazyAttribute();
    uniquePrefix_value = getParent().Define_uniquePrefix(this, null);
    uniquePrefix_computed = true;
    state().leaveLazyAttribute();
    uniquePrefix_visited = false;
    return uniquePrefix_value;
  }
/** @apilevel internal */
protected boolean uniquePrefix_visited = false;
  /** @apilevel internal */
  private void uniquePrefix_reset() {
    uniquePrefix_computed = false;
    
    uniquePrefix_value = null;
    uniquePrefix_visited = false;
  }
  /** @apilevel internal */
  protected boolean uniquePrefix_computed = false;

  /** @apilevel internal */
  protected String uniquePrefix_value;

  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A5/MinimalAST/src/jastadd/Errors.jrag:38
    if (isMultiDeclared()) {
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
    if (isMultiDeclared()) {
      collection.add(error("symbol '" + getID() + "' is already declared!"));
    }
  }
}
