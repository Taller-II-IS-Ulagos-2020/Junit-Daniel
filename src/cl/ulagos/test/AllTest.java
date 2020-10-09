package cl.ulagos.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({
	HelloJUnitTest.class,
	IdentificadorTest.class,
	TimeOutTest.class,
	UsoBeforeCasoTest.class
})

public class AllTest {

}
