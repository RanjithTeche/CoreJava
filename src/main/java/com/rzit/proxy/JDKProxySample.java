package com.rzit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith on 7/19/2017.
 */
public class JDKProxySample {
    public static void main(String[] args) {
        List<String> ary = new ArrayList<String>();
        ary.add("Hello");
        ary.add("Proxy");
        ary.add("World!!");

        ClassLoader loader = JDKProxySample.class.getClassLoader();
        @SuppressWarnings("unchecked")
        List<String> proxyAry = (List<String>) Proxy.newProxyInstance(loader, new Class<?>[]{List.class}, new MyJDKInvocationHandler(ary));
        for (int i = 0; i < 4; i++) {
            System.out.println(proxyAry.get(i));
        }
    }

    static class MyJDKInvocationHandler implements InvocationHandler {

        private List<String> ary;

        public MyJDKInvocationHandler(List<String> ary) {
            this.ary = ary;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (isFouthGet(method, args)) {
                return "Bow!!";
            }
            return method.invoke(ary, args);
        }

        private boolean isFouthGet(Method method, Object[] args) {
            return "get".equals(method.getName()) && ((Integer) args[0]) == 3;
        }
    }
}
