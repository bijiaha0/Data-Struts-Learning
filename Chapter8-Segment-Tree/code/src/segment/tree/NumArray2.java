package segment.tree;

/**
 * @author suyu
 * @version 1.0.0
 * @ClassName NumArray2
 * @Description LeetCode303
 * ���� nums = [-2, 0, 3, -5, 2, -1]����ͺ���Ϊ sumRange()
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * @Date 2018��06��12��21:53:26
 */
public class NumArray2 {

    /**
     * sum[i] �洢ǰi��Ԫ�غ� sum[0]=0
     * sum[i] �洢nums[0...i-1]�ĺ�
     */
    private static int[] sum;

    public NumArray2(int nums[]) {

        sum = new int[nums.length - 1];
        sum[0] = 0;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

    }

    public static int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }

    public static void main(String[] args) {
        NumArray2 numArray2 = new NumArray2(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(sumRange(0, 2));
    }
}