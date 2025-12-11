package singleton_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import java.util.HashMap;
import java.util.Map;

@Aspect
public class SingletonAspect {

    private Map<Class<?>, Object> instanceMap = new HashMap<>();

    @Pointcut("call(GestorConfiguracion.new(..))")
    public void callConstructor() {}

    @Around("callConstructor()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Class<?> clase = GestorConfiguracion.class;

        if (!instanceMap.containsKey(clase)) {
            Object nuevaInstancia = joinPoint.proceed();
            instanceMap.put(clase, nuevaInstancia);
        }

        return instanceMap.get(clase);
    }
}