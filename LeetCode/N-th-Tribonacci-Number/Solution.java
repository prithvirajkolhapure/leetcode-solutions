1class Solution {
2    public int tribonacci(int n) {
3        if(n==0)
4            return 0;
5        
6        if(n<=2)
7            return 1;
8
9        int a=0,b=1,c=1;
10        for(int i=3;i<=n;i++){
11            int sum=a+b+c;
12
13            a=b;
14            b=c;
15            c=sum;
16        }
17        return c;
18    }
19}
20
21// Tribonacci = previous 3 numbers → add → shift → repeat.