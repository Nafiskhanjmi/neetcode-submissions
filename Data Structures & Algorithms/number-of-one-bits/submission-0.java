class Solution {
    public int hammingWeight(int n) {
        int bin1 = 0;
        while (n!=0){
            if(n%2==1){
                bin1++;
            }

            n/=2;
        }
        return bin1;
    }
}
