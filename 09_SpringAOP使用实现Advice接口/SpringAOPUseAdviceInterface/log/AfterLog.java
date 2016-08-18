package SpringAOPUseAdviceInterface.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{
	
	/**
	 * 目标方法执行后执行的通知
	 * returnValue--返回值
	 * method 被调用的方法对象
	 * args 被调用的方法对象的参数
	 * target 被调用的方法对象的目标对象
	 * */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getName()+"的"+method.getName()+"被成功执行，返回值是："+returnValue);
	}
}
