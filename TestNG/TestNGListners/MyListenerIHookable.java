package TestNGListners;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class MyListenerIHookable implements IHookable {

@Override
public void run(IHookCallBack callBack, ITestResult testResult) {

Object[] parameterValues = callBack.getParameters();
if (parameterValues[0].equals("parameter 3")) {
System.out.println("Skip the required parameter");
} else {
callBack.runTestMethod(testResult);
}

}

}