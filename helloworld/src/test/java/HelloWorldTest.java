import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class HelloWorldTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	
	@Test
	public void printHello�̃e�X�g() {
		HelloWorld sut = new HelloWorld();
		boolean actual = sut.printHello();
		assertThat(actual, is(true));
	}

	@Test
	public void printHello�̑S�������e�X�g() {
		HelloWorld sut = new HelloWorld();
		boolean actual = sut.printHello();
		assertThat(actual, is(true));		
	}
}
