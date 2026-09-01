import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ret.add(firstRow);

        for(int i = 1;i < numRows;i++) {
            //第一个
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow = ret.get(i - 1);
            //中间部分
            for(int j = 1;j < i;j++) {
                Integer val = prevRow.get(j) + prevRow.get(j - 1);
                curRow.add(val);
            }
            //最后一个
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
}