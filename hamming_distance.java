class Solution {
    public int hammingDistance(int x, int y) {
       int res = x ^ y;
        int count = 0;
        while(res>0){
            res = res & (res-1);
            count = count + 1;
        }
        return count;
    }
}
