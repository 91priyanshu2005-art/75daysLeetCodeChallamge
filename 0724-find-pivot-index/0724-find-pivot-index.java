class Solution {
public int pivotIndex(int[] arr) {
int n = arr.length;
int leftsum = 0;
    // Step 1: Calculate the total sum
    int total = 0;
    for (int i = 0; i < n; i++) {
        total = total + arr[i];
    }

    // Step 2: Find the pivot index
    for (int i = 0; i < n; i++) {
        int rightsum = total - leftsum - arr[i];

        if (leftsum == rightsum) {
            return i;
        } else {
            leftsum = leftsum + arr[i];
        }
    }

    return -1;
}

}
