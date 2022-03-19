package algorithm.section6_sort_and_search;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * LinkedList를 사용하면 정말 쉽게 구현할 수 있다.
 */
public final class LRU_캐시_구현하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cache_size = scanner.nextInt(); // 캐시의 크기 3~10
        int n = scanner.nextInt(); // 작업의 개수 5~1000

        int[] tags = new int[n];
        for (int i = 0; i < n; i++) {
            tags[i] = scanner.nextInt();
        }

        // 마지막 작업 후, 캐시메모리의 상태를 가장 최근 사용 작업부터 출력
        List<Integer> cache = new LinkedList<>();

        int cacheHit = 0;
        for (Integer tag : tags) {
            cache.remove(tag);
            cache.add(0, tag);
            if (cache.size() > cache_size) {
                cache.remove(cache.size() - 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cache) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
