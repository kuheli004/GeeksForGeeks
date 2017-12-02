package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {
private static Map<Integer,Integer> sumEndIndexHash = new HashMap<>();

public static void findZeroSumSubArray(int[] arr) {
int currentSum = 0;
int count = 0;

for (int i = 0; i < arr.length; i++) {
currentSum += arr[i];
if (currentSum == 0) {
print(0, i);
count++;
}

for (Integer sumKey : sumEndIndexHash.keySet()) {
if (sumKey == currentSum) {
// if (sumEndIndexHash.containsKey(currentSum)) {
print((sumEndIndexHash.get(sumKey) + 1), i);
count++;
}

}
sumEndIndexHash.put(currentSum, i);
}

if (count == 0) {
System.out.println("No such subarray found");
}
}

public static void main(String[] args) {
int[] arr = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
ZeroSumSubArray.findZeroSumSubArray(arr);
}

public static void print(int start, int end) {
System.out.println(start + " to " + end);
}

}