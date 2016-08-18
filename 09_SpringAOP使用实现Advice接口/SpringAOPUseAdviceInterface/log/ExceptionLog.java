package SpringAOPUseAdviceInterface.log;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

//只是一个标志接口带抛出异常返回
public class ExceptionLog implements ThrowsAdvice {
 
	
 public void afterThrowing(Method m, Object args, Object target, Throwable subclass) {  
        System.out.println("[ExceptionLog]: 发生一个错误: "  + subclass.getClass().getSimpleName());  
        System.exit(0);  
    }  
 

}
