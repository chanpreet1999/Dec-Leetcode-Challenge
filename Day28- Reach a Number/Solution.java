class Solution {
    public int reachNumber(int tar) {
        tar = Math.abs(tar);
        int sum = 0, k = 0;
        while(sum < tar)
        {
            k++;
            sum += k;
        }
        return (sum - tar)%2 == 0 ? k : k%2 == 0 ? k+1 : k+2;
    }
}