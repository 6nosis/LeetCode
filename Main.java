import java.util.*;

public class Main {
    public static String search(List<String> map, List<String> list, int n, int m) {
        List<String> li = new ArrayList<>(); // 依据横向表建立纵向表
        for (int i = 0; i < m; i++) {
            String fWord = "";
            for (int j = 0; j < map.size(); j++) {
                fWord += map.get(j).charAt(i);
            }
            li.add(fWord);
        }
        int q = list.size();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            String word = list.get(i);
            // 针对每个单词查询 先找到首字母对应单词位置（多个位置），然后（针对每个位置）向上下左右搜索
            // 找首字母位置并保存
            // y坐标
            for (int j = 0; j < map.size(); j++) {
                // x坐标
                for (int k = 0; k < m; k++) {
                    if (map.get(j).charAt(k) == word.charAt(0)) {
                        // 单字母
                        if (word.length() == 1) {
                            stb.append("Case ").append(i).append(": Has\n");
                        }
                        // 找到了就开始搜索
                        // 针对除首位搜索
                        for (int l = 1; l < word.length(); l++) {
                            if (j == 0) {
                                if (k == 0) {
                                    // 无上左，往右和下匹配
                                    // 往右
                                    for (int o = k + 1; o < m; o++) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            // 该方向没找到
                                            break;
                                        }
                                    }
                                    // 往下
                                    for (int o = j + 1; o < n; o++) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                } else if (k == m - 1) {
                                    // 无上右
                                    // 下
                                    for (int o = j + 1; o < n; o++) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 左
                                    for (int o = k - 1; o >= 0; o--) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            // 该方向没找到
                                            break;
                                        }
                                    }
                                } else {
                                    // 无上
                                    // 下
                                    for (int o = j + 1; o < n; o++) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 左
                                    for (int o = k - 1; o >= 0; o--) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 右
                                    for (int o = k + 1; o < m; o++) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                }

                            } else if (j == map.size() - 1) {
                                if (k == 0) {
                                    // 无下左
                                    // 右
                                    for (int o = k + 1; o < m; o++) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 上
                                    for (int o = j - 1; o >= 0; o--) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                } else if (k == m - 1) {
                                    // 无下右
                                    // 上
                                    for (int o = j - 1; o >= 0; o--) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 左
                                    for (int o = k - 1; o >= 0; o--) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                } else {
                                    // 无下
                                    // 上
                                    for (int o = j - 1; o >= 0; o--) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 左
                                    for (int o = k - 1; o >= 0; o--) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 右
                                    for (int o = k + 1; o < m; o++) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                }
                            } else {

                                if (k == 0) {
                                    // 无左
                                    // 右
                                    for (int o = k + 1; o < m; o++) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 下
                                    for (int o = j + 1; o < n; o++) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 上
                                    for (int o = j - 1; o >= 0; o--) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                } else if (k == m - 1) {
                                    // 无右
                                    // 下
                                    for (int o = j + 1; o < n; o++) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 上
                                    for (int o = j - 1; o >= 0; o--) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 左
                                    for (int o = k - 1; o >= 0; o--) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                } else {
                                    // 有上下左右
                                    // 下
                                    for (int o = j + 1; o < n; o++) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 上
                                    for (int o = j - 1; o >= 0; o--) {
                                        if (li.get(k).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 左
                                    for (int o = k - 1; o >= 0; o--) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                    // 右
                                    for (int o = k + 1; o < m; o++) {
                                        if (map.get(j).charAt(o) != word.charAt(l)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            // 找到了
                            stb.append("Case ").append(i).append(": Has\n");
                        }
                    }
                }
            }
            // 该次查询没找到
            stb.append("Case ").append(i).append(": Not Has\n");
        }
        return stb.toString();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // m n矩阵 q查询数量
        int n = 0, m = 0, q;
        List<String> map = new ArrayList<>();
        List<String> list = new LinkedList<>();
        String[] nums = in.nextLine().split(" ");
        n = Integer.parseInt(nums[0]);
        m = Integer.parseInt(nums[1]);
        q = Integer.parseInt(nums[2]);
        for (int i = 0; i < n; i++) {
            map.add(in.nextLine());
        }
        for (int i = 0; i < q; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(map, list, n, m));
    }
}