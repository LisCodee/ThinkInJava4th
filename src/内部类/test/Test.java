package 内部类.test;

public class Test {
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return nums.length;
        }
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }else{
                return 1;
            }
        }
        int i = 0,j = i+1,length = 0;
        while(i < nums.length && j < nums.length){
            if(nums[i]==val){   //如果当前第i个元素等于val，
                j = i + 1;          //则从他后面寻找第一个不等于val的元素
                while(j < nums.length&&nums[j]==val){
                    j++;
                }
                if(j < nums.length){       //判断数组越界
                    nums[i] = nums[j];      //如果没有越界，就让第i个元素等于第j个元素
                    nums[j] = val;          //让第j个元素等于val以免重复判断
                    length++;                //长度+1
                    i++;                    //i+1
                }
                else{           //越界则跳出循环
                    break;
                }
            }else if(nums[i]!=val){     //如果当前第i个元素不等于val，就直接往后走
                i++;
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(nums,val);
    }
}
