/**
 * @author suolong
 * @date 2020/12/9
 */
public class FindRepeatNums {
    public static int findRepeatNumber(int[] nums) {
        Integer pout=null;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            for(int j=0;j<nums.length;j++){
                if((i!=j)&(temp==nums[j])){
                    pout=temp;
                    flag=1;
                    break;
                }

            }
            if (flag==1){
                break;
            }
        }
        return pout;
    }
    public static void main(String[] args) {
        int nums[]={2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }
}
