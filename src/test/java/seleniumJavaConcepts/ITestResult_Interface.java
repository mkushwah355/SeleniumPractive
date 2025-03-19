package seleniumJavaConcepts;
import java.util.Set;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

//ITestResult interface abstract methods
public class ITestResult_Interface implements ITestResult {
	
	public boolean       isSuccess() {return false;}	
	public String        getName() {return null;}
	public int           getStatus() {return 0;}
	public void          setStatus(int status) {}
	public String        getHost() {return null;}
	public ITestNGMethod getMethod() {return null;}
	public Object        getInstance() {return null;}
	public String        getInstanceName() {return null;}	
	public String        getTestName() {return null;}
	public IClass        getTestClass() {return null;}
	public ITestContext  getTestContext() {return null;}
	
	public Object[]      getParameters() {return null;}
	public void          setParameters(Object[] parameters) {}	
	public Object        getAttribute(String name) {return null;}
	public void          setAttribute(String name, Object value) {}
	public Set<String>   getAttributeNames() {return null;}
	public Object        removeAttribute(String name) {return null;}
	
	public Throwable     getThrowable() {return null;}
	public void          setThrowable(Throwable throwable) {}
	public long          getStartMillis() {return 0;}
	public long          getEndMillis() {return 0;}
	public void          setEndMillis(long millis) {}
	public int compareTo(ITestResult o) {return 0;}		
}
