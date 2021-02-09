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
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/lang.ast:3
 * @astdecl Function : ASTNode ::= Name:IdDecl Parameter:IdDecl* Content:Block;
 * @production Function : {@link ASTNode} ::= <span class="component">Name:{@link IdDecl}</span> <span class="component">Parameter:{@link IdDecl}*</span> <span class="component">Content:{@link Block}</span>;

 */
public class Function extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Visitor.jrag:47
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/PrettyPrint.jrag:19
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
   * @aspect CodeGen
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:135
   */
  public void genCode(PrintStream out){
    out.println(getName().getID() +":");
    out.println("        pushq %rbp");
    out.println("        movq %rsp, %rbp");
    out.println("        subq $"+(numLocals() * 8)+", %rsp");
    for (int i = 0; i < getNumParameter(); i++) {
      out.println("        movq " + (8)*(i+2) + "(%rbp), %rax");
      out.println("        movq %rax, " + getParameter(i).address());
    }
    getContent().genCode(out);
  }
  /**
   * @aspect Interpreter
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:16
   */
  public int eval(ActivationRecord actrec){
    //parameters?
    try{
      getContent().eval(actrec);
    } catch (ReturnException e){
     return e.getReturnValue();
    }
    return 0;
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
    reachable_reset();
    localLookup_String_reset();
    localIndex_reset();
    lookup_String_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Function_functionCalls_visited = false;
    Function_functionCalls_computed = false;
    
    Function_functionCalls_value = null;
    contributorMap_Function_functionCalls = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public Function clone() throws CloneNotSupportedException {
    Function node = (Function) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
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
   * @declaredat ASTNode:70
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
   * @declaredat ASTNode:80
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
   * @declaredat ASTNode:100
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
   * @declaredat ASTNode:114
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
  /**
   * @aspect <NoAspect>
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:7
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_Function_functionCalls = null;

  /** @apilevel internal */
  protected void survey_Function_functionCalls() {
    if (contributorMap_Function_functionCalls == null) {
      contributorMap_Function_functionCalls = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_Function_functionCalls(this, contributorMap_Function_functionCalls);
    }
  }

/** @apilevel internal */
protected ASTState.Cycle reachable_cycle = null;
  /** @apilevel internal */
  private void reachable_reset() {
    reachable_computed = false;
    reachable_initialized = false;
    reachable_value = null;
    reachable_cycle = null;
  }
  /** @apilevel internal */
  protected boolean reachable_computed = false;

  /** @apilevel internal */
  protected TreeSet<Function> reachable_value;
  /** @apilevel internal */
  protected boolean reachable_initialized = false;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="Reachability", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:31")
  public TreeSet<Function> reachable() {
    if (reachable_computed) {
      return reachable_value;
    }
    ASTState state = state();
    if (!reachable_initialized) {
      reachable_initialized = true;
      reachable_value = new TreeSet<Function>(new Comp());
    }
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      do {
        reachable_cycle = state.nextCycle();
        TreeSet<Function> new_reachable_value = reachable_compute();
        if (!AttributeValue.equals(reachable_value, new_reachable_value)) {
          state.setChangeInCycle();
        }
        reachable_value = new_reachable_value;
      } while (state.testAndClearChangeInCycle());
      reachable_computed = true;
      state.startLastCycle();
      TreeSet<Function> $tmp = reachable_compute();

      state.leaveCircle();
    } else if (reachable_cycle != state.cycle()) {
      reachable_cycle = state.cycle();
      if (state.lastCycle()) {
        reachable_computed = true;
        TreeSet<Function> new_reachable_value = reachable_compute();
        return new_reachable_value;
      }
      TreeSet<Function> new_reachable_value = reachable_compute();
      if (!AttributeValue.equals(reachable_value, new_reachable_value)) {
        state.setChangeInCycle();
      }
      reachable_value = new_reachable_value;
    } else {
    }
    return reachable_value;
  }
  /** @apilevel internal */
  private TreeSet<Function> reachable_compute() {
  		TreeSet<Function> r = new TreeSet<Function>(new Comp());
    		for (Function f : functionCalls()) {
      			r.add(f);
      			r.addAll(f.reachable());
    		}
    		return r;
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:43
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:43")
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
/** @apilevel internal */
protected boolean localIndex_visited = false;
  /** @apilevel internal */
  private void localIndex_reset() {
    localIndex_computed = false;
    localIndex_visited = false;
  }
  /** @apilevel internal */
  protected boolean localIndex_computed = false;

  /** @apilevel internal */
  protected int localIndex_value;

  /**
   * @attribute syn
   * @aspect CodeGen
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:329
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:327")
  public int localIndex() {
    ASTState state = state();
    if (localIndex_computed) {
      return localIndex_value;
    }
    if (localIndex_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.localIndex().");
    }
    localIndex_visited = true;
    state().enterLazyAttribute();
    localIndex_value = 0;
    localIndex_computed = true;
    state().leaveLazyAttribute();
    localIndex_visited = false;
    return localIndex_value;
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:34
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:34")
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:13
   * @apilevel internal
   */
  public Function Define_enclosingFunction(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getContentNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:16
      {
          return this;
        }
    }
    else {
      return getParent().Define_enclosingFunction(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:13
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute enclosingFunction
   */
  protected boolean canDefine_enclosingFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:7
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:35
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
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/NameAnalysis.jrag:7
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:337
   * @apilevel internal
   */
  public Function Define_enclosedFunction(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return this;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/CodeGen.jrag:337
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute enclosedFunction
   */
  protected boolean canDefine_enclosedFunction(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:115
   * @apilevel internal
   */
  public boolean Define_isVariable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getParameterListNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:147
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return true;
    }
    else if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:143
      return false;
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
    if (_callerNode == getParameterListNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:148
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return false;
    }
    else if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:144
      return true;
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
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:117
   * @apilevel internal
   */
  public Function Define_function(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getNameNoTransform()) {
      // @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:145
      return this;
    }
    else {
      return getParent().Define_function(this, _callerNode);
    }
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/TypeAnalysis.jrag:117
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute function
   */
  protected boolean canDefine_function(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:243
   * @apilevel internal
   */
  public String Define_uniquePrefix(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    {
    		return "";
    	}
  }
  /**
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/Interpreter.jrag:243
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute uniquePrefix
   */
  protected boolean canDefine_uniquePrefix(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
/** @apilevel internal */
protected boolean Function_functionCalls_visited = false;
  /**
   * @attribute coll
   * @aspect FunctionCalls
   * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="FunctionCalls", declaredAt="/h/d2/c/fte13tro/Documents/EDAN65/A6/MinimalAST/src/jastadd/FunctionCalls.jrag:7")
  public Set<Function> functionCalls() {
    ASTState state = state();
    if (Function_functionCalls_computed) {
      return Function_functionCalls_value;
    }
    if (Function_functionCalls_visited) {
      throw new RuntimeException("Circular definition of attribute Function.functionCalls().");
    }
    Function_functionCalls_visited = true;
    state().enterLazyAttribute();
    Function_functionCalls_value = functionCalls_compute();
    Function_functionCalls_computed = true;
    state().leaveLazyAttribute();
    Function_functionCalls_visited = false;
    return Function_functionCalls_value;
  }
  /** @apilevel internal */
  private Set<Function> functionCalls_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof Function)) {
      node = node.getParent();
    }
    Function root = (Function) node;
    root.survey_Function_functionCalls();
    Set<Function> _computedValue = new TreeSet<Function>(new Comp());
    if (root.contributorMap_Function_functionCalls.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_Function_functionCalls.get(this)) {
        contributor.contributeTo_Function_functionCalls(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected boolean Function_functionCalls_computed = false;

  /** @apilevel internal */
  protected Set<Function> Function_functionCalls_value;

}
