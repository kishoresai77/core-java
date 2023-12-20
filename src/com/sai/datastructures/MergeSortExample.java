package com.sai.datastructures;

public class MergeSortExample {
    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {

            int mid = left + (right - left)/  2;
            //Recursively sort the first and second halves
            mergeSort(array,left,mid);
            mergeSort(array,mid + 1,right);
            // merge the sorted halves
            merge(array, left, mid, right);

    }
    }

    public  void merge(int[] array, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        // Create temporary arrays to hold the data
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temporary arrays
        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indices for the left, right, and merged arrays
        int i = 0, j = 0, k = left;

        // Merge the two subarrays back into the original array
        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < sizeLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < sizeRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }



    public static void main(String[] args) {
        MergeSortExample ar=new MergeSortExample();
        int array[]={80,43,45,90,32,1,10};
        int n=array.length-1;
        ar.mergeSort(array,0,n);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
    }
    }



