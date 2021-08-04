package com.violetkiss;

/**
 * 斐波那契数列
 * @author wrb
 * @date 2021/8/4 19:26
 */
public class Fibonacci {

    /**
     * 递归获取第n个斐波那契数 （性能差）
     *
     * 0 1 1 2 3 5 8 13 ... [n = (n-1) + (n-2)]
     * @param n
     * @return
     */
    public static int getFibonacci1(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci1(n - 1) + getFibonacci1(n - 2);
    }


    /**
     * 遍历获取第n个斐波那契数
     *
     * 0 1 1 2 3 5 8 13 ... [n = (n-1) + (n-2)]
     * @param n
     * @return
     */
    public static int getFibonacci2(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        int fib = 0;
        for (int i = 1; i < n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        final int n = 45;
        TimeTool.check("fib1", new TimeTool.Task() {
            public void execute() {
                System.out.println(getFibonacci1(n));
            }
        });
        TimeTool.check("fib2", new TimeTool.Task() {
            public void execute() {
                System.out.println(getFibonacci2(n));
            }
        });

    }
}
