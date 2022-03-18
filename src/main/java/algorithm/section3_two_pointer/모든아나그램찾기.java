package algorithm.section3_two_pointer;

import java.util.HashMap;
import java.util.Scanner;

class 모든아나그램찾기 {

    public static void main(String[] args) {
        모든아나그램찾기 T = new 모든아나그램찾기();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }

    public int solution(String s, String target) {
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : target.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int left = target.length() - 1;
        for (int i = 0; i < left; i++) {
            am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        int answer = 0;
        for (int rt = left; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);

            if (am.equals(bm)) {
                answer++;
            }

            am.put(s.charAt(lt), am.get(s.charAt(lt)) - 1);
            if (am.get(s.charAt(lt)) == 0) {
                am.remove(s.charAt(lt));
            }
            lt++;
        }
        return answer;
    }
}
