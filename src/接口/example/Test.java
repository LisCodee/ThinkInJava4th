package 接口.example;

public class Test {

    public int removeDuplicates(int[] nums){
        int count = 0,now = 0;
        for(int i = 0; i< nums.length - 1;i++){
            if(nums[i+1] == nums[i]){
                count++;
            }else{
                nums[++now] = nums[i + 1];
            }
        }
        return now + 1;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
