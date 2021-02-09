package lang;
import lang.ast.LangParser;
import lang.ast.LangScanner;
import static lang.ast.LangParser.Terminals.*;
/**
* Abstract base class for recursive decent parsers.
* You should implement the parseProgram() method to parse a MiniS program.
*/
public class RDParser {
  private LangScanner scanner;
  private beaver.Symbol currentToken;
/** Initialize the parser and start parsing via the parseProgram() method. */
  public void parse(LangScanner scanner) {
    this.scanner = scanner;
    parseProgram();
    accept(EOF); // Ensure all input is processed.
  }

  protected void parseProgram() {

    int token = peek();

    switch(token){
      case FOR:
        checkFor();
        break;
      case IF:
        checkIf();
        break;
      case ID:
        checkAssgn();
        break;
      default: error("Fel vid " + token);
      }
}
protected void checkStmt(){
  parseProgram();
  System.out.println("Stmt ok!");
}
protected void checkFor(){
  accept(FOR);
  checkAssgn();
  accept(UNTIL);
  checkExpr();
  accept(DO);
  checkStmt();
  accept(OD);
  System.out.println("for ok!");
}
protected void checkIf(){
  accept(IF);
  checkExpr();
  accept(THEN);
  checkStmt();
  accept(FI);
  System.out.println("if ok!");
}

protected void checkAssgn(){
  accept(ID);
  accept(ASSIGN);
  checkExpr();
  System.out.println("Assign ok!");
}
protected void checkExpr(){
  int token = peek();
  switch(token){
    case ID:
      accept(ID);
      break;
    case NUMERAL:
      accept(NUMERAL);
      break;
    case NOT:
      accept(NOT);
      checkExpr();
      break;
    default: error("Fel vid expr " + token);
  }
}
/** Returns the current token without proceeding to the next. */
  protected int peek() {
    if (currentToken == null) accept();
    return currentToken.getId();
  }
/** Read the next token from the scanner. */
  protected void accept() {
    try {
      currentToken = scanner.nextToken();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
/** Ensure the current token is of a certain type; then read the next. */
  protected void accept(int expectedToken) {
    if (peek() != expectedToken) {
      error("expected token " +
        LangParser.Terminals.NAMES[expectedToken] +
        " got token " +
        LangParser.Terminals.NAMES[currentToken.getId()]);
    }
    accept();
  }
  protected static void error(String message) {
    throw new RuntimeException(message);
  }
}
