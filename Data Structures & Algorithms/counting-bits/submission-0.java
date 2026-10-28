class Solution {
    public static int countBit(int a){
        int countOnes = 0;
        while(a!=0){
            if(a%2==1)
            countOnes++;

            a /= 2;
        }
        return countOnes;

    }
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i=0; i<=n; i++){
            ans[i] = countBit(i);
        }
        return ans;
    }
}
