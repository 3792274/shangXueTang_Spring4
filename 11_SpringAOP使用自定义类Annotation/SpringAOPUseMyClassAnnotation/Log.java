package SpringAOPUseMyClassAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
	
	@Before("execution(* SpringAOPUseMyClassAnnotation.*.*(..))")
	public void before() {
		System.out.println("-----方法执行前-----");
	}

	@After("execution(* SpringAOPUseMyClassAnnotation.*.*(..))")
	public void after() {
		System.out.println("-----方法执行后-----");
	}

	@Around("execution(* SpringAOPUseMyClassAnnotation.*.*(..))")
	public Object aroud(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("环绕前");
		System.out.println("签名：" + jp.getSignature());
		// 执行目标方法
		Object result = jp.proceed();
		System.out.println("环绕后");
		return result;
	}
}
