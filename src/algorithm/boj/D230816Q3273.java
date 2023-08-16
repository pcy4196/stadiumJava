package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D230816Q3273 {

    // 2023-08-16
    // 백준온라인 알고리즘 풀이
    // 백준(BOJ) SILVER3 두 수의 합
    // 문제 URL : https://www.acmicpc.net/problem/3273

    private static Integer N;
    private static Integer X;
    private static Integer[] arr;

    private static int solution() {
        int answer = 0;
        // n개의 서로 다른 양의 정수를 담기 위해 사용하는 hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.getOrDefault(X - arr[i], 0) == 1) {
                // 저장했던 수와 현재 수의 합이 target 일 경우 answer값 증가
                answer++;
            } else {
                // 타켓 수가 안될경우 해당 숫자 map에 저장
                map.put(arr[i], 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. 수열의 크기 정의
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        // 2. 수열에 포함되어 있는 수 설정
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 3. 합을 구해야 하는 타켓 숫자
        X = Integer.parseInt(br.readLine());

        System.out.println(solution());
    }


}
