package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D221106Q11659 {

    // 2022-11-06
    // 백준온라인 알고리즘 풀이
    // 백준(BOJ) SILVER3 구간 합 구하기 4
    // 문제 URL : https://www.acmicpc.net/problem/11659

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());       // 수의개수
        int M = Integer.parseInt(st.nextToken());       // 합을 구해야하는 횟수
        int[] arr = new int[N+1];                       // N번째 까지의 합을 가지고 있는 배열
        int sum = 0;                                    // 합을 가지고 있는 임시변수
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sum += Integer.parseInt(st.nextToken());
            arr[i] = sum;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ans = arr[end] - arr[start - 1];
            sb.append(ans).append("\n");
        }
        // 결과 출력
        System.out.println(sb.toString());
    }

}
