package bank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.util.StopWatch;

@Aspect
public class Advice {

	@Before("execution(* bank.dao.AccountDAO.*(..))")
	public void tracebeforemethod(JoinPoint joinpoint) {
	System.out.println("Method = "+joinpoint.getSignature().getName());
	}
	
	@Around("execution(* bank.service.AccountService.*(..))")
	public Object invoke(ProceedingJoinPoint call) throws Throwable {
		StopWatch sw = new StopWatch();
		sw.start(call.getSignature().getName());
		Object retVal = call.proceed();
		sw.stop();
		long totaltime = sw.getLastTaskTimeMillis();
		System.out.println("Time to execute "+call.getSignature().getName()+" = "+totaltime+" ms");
		return retVal;
	}
}
