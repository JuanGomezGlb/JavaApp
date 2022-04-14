package user;

 
import org.junit.Test;
import junit.framework.Assert;



public class ValidationTest  {
	@Test
    public void myTest1() {
		validator v3=new validator();
		boolean val=v3.Validate("Surabhi", "Infy123");
		Assert.assertEquals(true, val);
	}
	

}
