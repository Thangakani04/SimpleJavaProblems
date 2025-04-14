package SimpleJavaproblems;

public class ContainsDuplicates {
	
	public static void main(String[] args) {
		int [] nums = {4,2,3,1};
		System.out.println(containsNearbyDuplicate(nums));
		
	}
    public static boolean containsNearbyDuplicate(int[] nums) {
       // boolean flag =false;
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}
