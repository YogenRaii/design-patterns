package customers;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class EmailAdvice {
	@After("execution(* customers.EmailSender.sendEmail(..)) && args(email,message)")
	public void traceMethod(JoinPoint joinPoint, String email, String message) {
		EmailSender emailSender = (EmailSender) joinPoint.getTarget();
		System.out.println(new Date() + " method = " + joinPoint.getSignature().getName() + " address = " + email
				+ " message = " + message);
		System.out.println("outgoing mail server = " + emailSender.getOutgoingMailServer());
	}

	@Around("execution(* customers.CustomerDAO.*(..))")
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
