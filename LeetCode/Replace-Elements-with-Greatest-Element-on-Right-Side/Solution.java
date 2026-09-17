1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int n=arr.length;
4        int max=arr[n-1];
5
6        for(int i=n-2;i>=0;i--){
7            int temp=arr[i];
8            arr[i]=max;
9            max=Math.max(max,temp);
10        }
11        arr[n-1]=-1;
12
13        return arr;
14    }
15}
16
17// 1. Start from RIGHT.
18
19// 2. Keep the greatest value in max.
20
21// 3. Replace current element with max.
22
23// 4. Update max using original current element.
24
25// 5. Move LEFT.
26
27// 6. Last element = -1.