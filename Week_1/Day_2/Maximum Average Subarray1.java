class Solution {
    public double findMaxAverage(int[] n, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=n[i];
        }
        int maxSum=s;
        for(int i=k;i<n.length;i++){
            s+=n[i]-n[i-k];
        
        maxSum=Math.max(maxSum,s);
    }
    return (double) maxSum / k;
}
}

        
