package com.rzit.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith on 7/19/2017.
 */
public class CGLibProxySample {
    public static void main(String[] args) {
        List<String> ary = new ArrayList<String>();
        ary.add("Hello");
        ary.add("Proxy");
        ary.add("World!!");

        System.out.println("create a interface proxy");
        List<String> proxyAry = (List<String>) Enhancer.create(List.class, new MyCGLibInvocationHandler(ary));
        for (int i = 0; i < 4; i++) {
            System.out.println(proxyAry.get(i));
        }

        System.out.println("create a class proxy");
        proxyAry = (List<String>) Enhancer.create(ArrayList.class, new MyCGLibInvocationHandler(ary));
        for (int i = 0; i < 4; i++) {
            System.out.println(proxyAry.get(i));
        }
    }


    static class MyCGLibInvocationHandler implements MethodInterceptor {

        private List<String> ary;

        public MyCGLibInvocationHandler(List<String> ary) {
            this.ary = ary;
        }

        /**
         * @param obj    "this", the enhanced object
         * @param method intercepted Method
         * @param args   argument array; primitive types are wrapped
         * @param proxy  used to invoke super (non-intercepted method); may be called
         *               as many times as needed
         */
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            if (isFouthGet(method, args)) {
                return "Bow!!";
            }
            return proxy.invoke(ary, args);
        }

        private boolean isFouthGet(Method method, Object[] args) {
            return "get".equals(method.getName()) && ((Integer) args[0]) == 3;
        }
    }
}
