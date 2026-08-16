// Area = width × minimum height

// Area = (right-left) × min(height[left], height[right])

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxArea=0;

       while(left<right){
        int width=right-left;
        int h=Math.min(height[left],height[right]);
        int curr=width*h;

        maxArea=Math.max(maxArea,curr);
        if(height[left]<height[right])
            left++;
        else
            right--;
       }
       return maxArea;
    }
}

// class Solution {
//     public int maxArea(int[] height) {

//         int left = 0;
//         int right = height.length - 1;

//         int maxArea = 0;

//         while (left < right) {

//             int width = right - left;
//             int currArea = width * Math.min(height[left], height[right]);

//             maxArea = Math.max(maxArea, currArea);

//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return maxArea;
//     }
// }