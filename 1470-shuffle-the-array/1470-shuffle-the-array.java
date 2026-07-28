class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];

        int counter=0;
        for(int i=0;i<n;i++){
            arr[counter]=nums[i];
            arr[counter+1]=nums[i+n];
            counter=counter+2;
        }
        return  arr;
    }
}