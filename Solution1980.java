class Solution1980 {
    
    public String findDifferentBinaryString(String[] nums) {
        String binary = "";
        for(int i=0;i<nums.length;i++){
           binary+=(nums[i].charAt(i)=='0' ? '1':'0');   
        }
        return binary;

    

  

}
}
