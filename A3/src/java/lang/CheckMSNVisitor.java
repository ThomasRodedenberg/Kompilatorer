package lang;

import lang.ast.*;

/**
 * Checks
 */
public class CheckMSNVisitor extends TraversingVisitor {
	public static int result(ASTNode n) {
		CheckMSNVisitor v = new CheckMSNVisitor();
		n.accept(v, null);
		return v.max;
	}

	private int count = 0;
	private int max = 0;

	public Object visit(Block node, Object data) {
		count ++;
		if (count > max){
			max = count;
		}
		visitChildren(node, data);
		count--;
		return data;
	}

}
