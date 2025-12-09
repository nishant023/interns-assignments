package com.code.IgnitorsHubAssignment.service.impl;


import com.code.IgnitorsHubAssignment.service.BinarySearchService;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchServiceImpl implements BinarySearchService {

    @Override
    public String binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return "Element " + target + " is found at index " + mid + ".";
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return "Element " + target + " is not found in the array.";
    }
}

