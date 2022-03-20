package algorithm.section8_dfs_bfs_활용;

import java.util.Scanner;

public final class 그래프상_연결되어있는가_find_union {

    static int[] friendRoot;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();
        int n = scanner.nextInt();
        friendRoot = new int[studentCount + 1];

        for (int i = 1; i <= studentCount; i++) {
            // 아무도 연결되어있지 않으므로, 자기자신이 Root이다.
            friendRoot[i] = i;
        }

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            connect(a, b);
        }

        int a = findRoot(scanner.nextInt());
        int b = findRoot(scanner.nextInt());
        if (a != b) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

    private static void connect(int a, int b) {
        int rootA = findRoot(a);
        int rootB = findRoot(b);
        if (rootA != rootB) { // 뿌리를 연결시킨다.
            friendRoot[rootA] = rootB;
        }
    }

    private static int findRoot(int x) {
        if (x != friendRoot[x]) { // 루트를 찾는다.
            friendRoot[x] = findRoot(friendRoot[x]);
        }
        return friendRoot[x];
    }
}
