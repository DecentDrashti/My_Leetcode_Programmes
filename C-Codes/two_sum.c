#include<stdio.h>
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
   int *result = malloc(numsSize * sizeof(int));
    int n=numsSize;
    *returnSize=2;
    //int i,j;
    // int *result i*j
    for (int i = 0; i < (n-1); i++) {
        for (int j = (i + 1); j <n; j++) {
            if (nums[i] + nums[j] == target){
                 result[0]=i;
                 result[1]=j;
                 return result;
            }
        }
    }return result;
}