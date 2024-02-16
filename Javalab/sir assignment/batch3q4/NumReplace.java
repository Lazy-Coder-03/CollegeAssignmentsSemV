public class NumReplace {
    public static void main(String[] args) {
        int nums[] = { 0, 2, 4, 8, 2, 9, 2, 0 };
        int target = 2;
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        int c = countOccurrences(nums, 2);

        System.out.printf("Number of occurance of %d: %d", target, c);
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    public static int countOccurrences(int[] nums, int target) {
        int count = 0;
        int i=0;
        for (int num : nums) {
            if (num == target) {
                count++;
                nums[i] = i + target;
            }
            i++;
        }
        return count;
    }
}
