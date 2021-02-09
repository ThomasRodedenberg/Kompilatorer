/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d2/c/fte13tro/Documents/EDAN65/A2/A2-MinimalAST/src/jastadd/lang.ast:3
 * @astdecl Function : ASTNode ::= name:IdDecl parameter:IdDecl* content:Block;
 * @production Function : {@link ASTNode} ::= <span class="component">name:{@link IdDecl}</span> <span class="component">parameter:{@link IdDecl}*</span> <span class="component">content:{@link Block}</span>;

 */
public class Function extends ASTNode<ASTNode> implements Cloneable {
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
    name = {"name", "parameter", "content"},
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
  public Function clone() throws CloneNotSupportedException {
    Function node = (Function) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
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
   * @declaredat ASTNode:61
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
   * @declaredat ASTNode:71
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
   * @declaredat ASTNode:91
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
   * @declaredat ASTNode:105
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
   * Replaces the parameter list.
   * @param list The new list node to be used as the parameter list.
   * @apilevel high-level
   */
  public void setparameterList(List<IdDecl> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the parameter list.
   * @return Number of children in the parameter list.
   * @apilevel high-level
   */
  public int getNumparameter() {
    return getparameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the parameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the parameter list.
   * @apilevel low-level
   */
  public int getNumparameterNoTransform() {
    return getparameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the parameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the parameter list.
   * @apilevel high-level
   */
  public IdDecl getparameter(int i) {
    return (IdDecl) getparameterList().getChild(i);
  }
  /**
   * Check whether the parameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasparameter() {
    return getparameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the parameter list.
   * @param node The element to append to the parameter list.
   * @apilevel high-level
   */
  public void addparameter(IdDecl node) {
    List<IdDecl> list = (parent == null) ? getparameterListNoTransform() : getparameterList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addparameterNoTransform(IdDecl node) {
    List<IdDecl> list = getparameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setparameter(IdDecl node, int i) {
    List<IdDecl> list = getparameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the parameter list.
   * @return The node representing the parameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="parameter")
  public List<IdDecl> getparameterList() {
    List<IdDecl> list = (List<IdDecl>) getChild(1);
    return list;
  }
  /**
   * Retrieves the parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the parameter list.
   * @apilevel low-level
   */
  public List<IdDecl> getparameterListNoTransform() {
    return (List<IdDecl>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the parameter list without
   * triggering rewrites.
   */
  public IdDecl getparameterNoTransform(int i) {
    return (IdDecl) getparameterListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the parameter list.
   * @return The node representing the parameter list.
   * @apilevel high-level
   */
  public List<IdDecl> getparameters() {
    return getparameterList();
  }
  /**
   * Retrieves the parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the parameter list.
   * @apilevel low-level
   */
  public List<IdDecl> getparametersNoTransform() {
    return getparameterListNoTransform();
  }
  /**
   * Replaces the content child.
   * @param node The new node to replace the content child.
   * @apilevel high-level
   */
  public void setcontent(Block node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the content child.
   * @return The current node used as the content child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="content")
  public Block getcontent() {
    return (Block) getChild(2);
  }
  /**
   * Retrieves the content child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the content child.
   * @apilevel low-level
   */
  public Block getcontentNoTransform() {
    return (Block) getChildNoTransform(2);
  }
}
