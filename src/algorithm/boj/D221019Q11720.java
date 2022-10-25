package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D221019Q11720 {

    // 2022-10-19
    // 백준온라인 알고리즘 풀이
    // 백준(BOJ) BRONZE2 숫자의 합
    // 문제 URL : https://www.acmicpc.net/problem/11720

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;                                    // 합을 담는 변수
        // INPUT DATA 정의
        int N = Integer.parseInt(st.nextToken());       // 숫자의 개수
        char[] numArr = br.readLine().toCharArray();    // N개의 숫자를 배열 형태로 저장
        for (char c : numArr) {
            sum += Character.getNumericValue(c);        // 1. char -> int Character 메서드 사용
//            sum += c - '0';                             // 2. Ascii code 를 활용하여 char -> int 로 변형
        }

        System.out.println(sum);
    }

}
