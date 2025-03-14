package com.multi.a_array;

import java.util.Arrays;
import java.util.List;

public class Exec04 {
    public static void main(String[] args) {
//Arrays 에서 제공되는 메소드

// 6.1. Arrays.toString()
// 배열을 문자열로 변환하여 출력
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("6.1. Arrays.toString() -> " + Arrays.toString(numbers));

// 6.2. Arrays.sort()
// 배열을 오름차순으로 정렬
        int[] unsortedNumbers = {5, 3, 1, 4, 2};
        Arrays.sort(unsortedNumbers);
        System.out.println("6.2. Arrays.sort() -> " + Arrays.toString(unsortedNumbers));

// 6.3. Arrays.equals()
// 두 배열의 요소가 동일한지 비교하여 결과를 반환
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};
        System.out.println("6.3. Arrays.equals(arr1, arr2) -> " + Arrays.equals(arr1, arr2)); // true
        System.out.println("6.3. Arrays.equals(arr1, arr3) -> " + Arrays.equals(arr1, arr3)); // false

// 6.4. Arrays.fill()
// 배열의 모든 요소를 지정한 값으로 채움
        int[] filledNumbers = new int[5];
        Arrays.fill(filledNumbers, 9);//채울 값
        System.out.println("6.4. Arrays.fill() -> " + Arrays.toString(filledNumbers));

// 6.5. Arrays.copyOf()
// 배열의 요소를 복사하여 새 배열을 생성, 지정한 길이만큼 복사
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5); //앞에는 저장된 배열, 뒤에는 초기값 0이 저장된 길이 5의 배열 생성
        System.out.println("6.5. Arrays.copyOf() -> " + Arrays.toString(copy));

// 6.6. Arrays.asList()
// 배열을 리스트로 변환
// 컬렉션
        String[] fruits = {"apple", "banana", "cherry"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println("6.6. Arrays.asList() -> " + fruitList);
        System.out.println(fruitList);                              // 리스트 컬렉션은 toString이 구현되어 있어서 그냥 출력 할 수 있음

// 6.7. Arrays.deepToString()
// 다차원 배열을 문자열로 변환하여 출력
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("6.7. Arrays.deepToString() -> " + Arrays.deepToString(matrix));

// 6.8. Arrays.copyOfRange()
// 배열의 특정 범위를 복사하여 새 배열 생성 (끝 인덱스는 포함하지 않음) 새 해시태그 부여?
//      int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);
        int[] rangeCopy = Arrays.copyOfRange(numbers, 2, 8);  // from번째 index부터 (to-from) 크기의 배열을 생성. rangeCopy 배열은 내부적으로 new를 사용해 생성됨
        System.out.println("6.8. Arrays.copyOfRange() -> " + Arrays.toString(rangeCopy));
    }

}
