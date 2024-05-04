#include<stdio.h>
int* findDuplicates(int* nums, int numsSize, int* returnSize) {
    int* A = (int*)malloc(numsSize * sizeof(int));
    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[abs(nums[i]) - 1] < 0) {
            A[count++] =abs (nums[i]);
        } else {
            nums[abs(nums[i]) - 1] *= -1;
        }
    }
    *returnSize = count;
    return A;
}