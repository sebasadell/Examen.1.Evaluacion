public class Exercise5 {
    private static int[] array = new int[0];
    public static int multiplyEvenIndex(int... nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        else {
            array = nums;
            int product = 1;

            for (int i = 0; i < array.length; i += 2) {
                product *= array[i];
            }
            return product;
        }
    }
}
