package yp.剑指offer;

import java.util.HashMap;

/**
 * @author RickYinPeng
 * @ClassName Y_08_跳台阶
 * @Description
 * @date 2019/4/13/10:47
 */
public class Y_08_跳台阶 {
    public static void main(String[] args) {
    }
    static HashMap<Integer,Integer> map = new HashMap<>(50);
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        if(map.containsKey(target)){
            return map.get(target);
        }
        Integer result = JumpFloor(target-1)+ JumpFloor(target-2);
        map.put(target,result);
        return result;
    }
}
