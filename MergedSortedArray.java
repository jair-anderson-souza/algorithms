


public class MergedSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int sizeNums1 = m + n - 1;
        int indexM = m - 1;
        int indexN = n - 1;
        while (indexN >= 0) { //If n weren't higher than 0, it means nums2 is empty
            if (indexM >= 0 && nums1[indexM] > nums2[indexN]) {
                nums1[sizeNums1--] = nums1[indexM--];

            } else {
                nums1[sizeNums1--] = nums2[indexN--];
            }
        }
        System.out.println(nums1);
    }

    public static void main(String[] args) {
        MergedSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
