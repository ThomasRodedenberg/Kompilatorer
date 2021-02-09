package lang;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.fail;

public class mytest{
  private static final File TEST_DIRECTORY = new File("testfiles");

  @Test public void exMiniS(){
    	Util.testValidSyntax(TEST_DIRECTORY, "exMiniS.in");
  }

  @Test public void assgnOk() {
    Util.testSyntaxError(TEST_DIRECTORY, "assgnOk.in");
  }
  @Test public void kortOk() {
    Util.testValidSyntax(TEST_DIRECTORY, "kortOk.in");
  }
  @Test public void error() {
		Util.testSyntaxError(TEST_DIRECTORY, "error.in");
	}

}
