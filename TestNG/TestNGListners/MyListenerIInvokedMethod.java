package TestNGListners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
public class MyListenerIInvokedMethod implements IInvokedMethodListener {

@Override
public void afterInvocation(IInvokedMethod method, ITestResult result) {
System.out.println("This method is invoked after every config method - " + method.getTestMethod().getMethodName());

}

@Override
public void beforeInvocation(IInvokedMethod method, ITestResult result) {
System.out.println("This method is invoked before every config method - " + method.getTestMethod().getMethodName());

}

}