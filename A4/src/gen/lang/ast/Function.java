/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.util.Set;
import java.util.TreeSet;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/lang.ast:3
 * @astdecl Function : ASTNode ::= Name:IdDecl Parameter:IdDecl* Content:Block;
 * @production Function : {@link ASTNode} ::= <span class="component">Name:{@link IdDecl}</span> <span class="component">Parameter:{@link IdDecl}*</span> <span class="component">Content:{@link Block}</span>;

 */
public class Function extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/Visitor.jrag:47
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/PrettyPrint.jrag:19
   */
  public void prettyPrint(PrintStream out, String ind){
		out.print(ind);
		getName().prettyPrint(out,ind);
		out.print("(");
		//getParameterList().prettyPrint(out,ind);
		int k = getNumParameter();
		for(int i=0;i < k; i++){
			getParameter(i).prettyPrint(out,ind);
			if(i<k-1){
				out.print(", ");
			}
		}
		out.print(")");
		getContent().prettyPrint(out,ind);
		out.println();
  }
  /**
   * @declaredat ASTNode:1
   */
  public Function() {
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
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "Parameter", "Content"},
    type = {"IdDecl", "List<IdDecl>", "Block"},
    kind = {"Child", "List", "Child"}
  )
  public Function(IdDecl p0, List<IdDecl> p1, Block p2) {
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
    localLookup_String_reset();
    lookup_String_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Function clone() throws CloneNotSupportedException {
    Function node = (Function) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Function copy() {
    try {
      Function node = (Function) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public Function fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Function treeCopyNoTransform() {
    Function tree = (Function) copy();
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
   * @declaredat ASTNode:93
   */
  public Function treeCopy() {
    Function tree = (Function) copy();
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
   * @declaredat ASTNode:107
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
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   */
  public void setParameterList(List<IdDecl> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * @return Number of children in the Parameter list.
   * @apilevel high-level
   */
  public int getNumParameter() {
    return getParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Parameter list.
   * @apilevel low-level
   */
  public int getNumParameterNoTransform() {
    return getParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameter list.
   * @apilevel high-level
   */
  public IdDecl getParameter(int i) {
    return (IdDecl) getParameterList().getChild(i);
  }
  /**
   * Check whether the Parameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameter() {
    return getParameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the Parameter list.
   * @param node The element to append to the Parameter list.
   * @apilevel high-level
   */
  public void addParameter(IdDecl node) {
    List<IdDecl> list = (parent == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterNoTransform(IdDecl node) {
    List<IdDecl> list = getParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameter(IdDecl node, int i) {
    List<IdDecl> list = getParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Parameter")
  public List<IdDecl> getParameterList() {
    List<IdDecl> list = (List<IdDecl>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<IdDecl> getParameterListNoTransform() {
    return (List<IdDecl>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Parameter list without
   * triggering rewrites.
   */
  public IdDecl getParameterNoTransform(int i) {
    return (IdDecl) getParameterListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  public List<IdDecl> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public List<IdDecl> getParametersNoTransform() {
    return getParameterListNoTransform();
  }
  /**
   * Replaces the Content child.
   * @param node The new node to replace the Content child.
   * @apilevel high-level
   */
  public void setContent(Block node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Content child.
   * @return The current node used as the Content child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Content")
  public Block getContent() {
    return (Block) getChild(2);
  }
  /**
   * Retrieves the Content child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Content child.
   * @apilevel low-level
   */
  public Block getContentNoTransform() {
    return (Block) getChildNoTransform(2);
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:42
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:42")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Function.localLookup(String).");
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
  
  		for(int i = 0; i < getNumParameter();i++) {
  			IdDecl decl = getParameter(i);
  			if(decl.getID().equals(name)) {
  				return decl;
  			}
  		}
  		return unknownDecl();
  	}
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:33
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:33")
  public IdDecl lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdDecl) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Function.lookup(String).");
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:7
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:34
      {
      		return lookup(name);
      	}
    }
    else {
      int childIndex = this.getIndexOfChild(_callerNode);
      {
      		IdDecl decl = localLookup(name);
      		return !decl.isUnknown() ? decl : lookup(name);
      	}
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/NameAnalysis.jrag:7
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getParameterListNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:147
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return true;
    }
    else if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:143
      return false;
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
    if (_callerNode == getParameterListNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:148
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return false;
    }
    else if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:144
      return true;
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
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:117
   * @apilevel internal
   */
  public Function Define_function(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:145
      return this;
    }
    else {
      return getParent().Define_function(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A4/A4-MinimalAST/src/jastadd/TypeAnalysis.jrag:117
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute function
   */
  protected boolean canDefine_function(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
}
