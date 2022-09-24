package algorithm.boj;

import java.util.Scanner;

public class D220924Q2750 {

    // 2022-09-24
    // 백준온라인 알고리즘 풀이
    // 백준(BOJ) BRONZE2 수 정렬하기
    // 문제 URL : https://www.acmicpc.net/problem/2750

    static int N;       // 수의 개수
    static int[] arr;   // 수를 담아두는 배열
    static int[] temp;  // 수를 잠시 담아두는 배열

    public static void main(String[] args) {
        // INPUT DATA 정의
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr  = new int[N];
        temp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 병합정렬 수행
        mergeSort(0, N-1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString());
    }

    // 병합정렬 수행 메서드
    private static void mergeSort(int start, int end) {
        // 병합정렬 수행 조건
        if (start < end) {
            // 1. 분할처리
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            // 2. 병합처리
            mergeNum(start, end, mid);
        }
    }

    private static void mergeNum(int start, int end, int mid) {
        // 왼쪽부분 시작 변수
        int i = start;
        // 오른쪽부분 시작변수
        int j = mid +1;
        // 임시 배열 시작변수
        int k = start;
        // 오름차순으로 정렬
        while (i <= mid && j <= end) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        // 남은 값 일괄 복사
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // 정렬한 값 원래 배열에 옮기는 작업
        for (int n = start; n <= end; n++) {
            arr[n] = temp[n];
        }
    }
}
