package yp.剑指offer;

/**
 * @author RickYinPeng
 * @ClassName Y_10_矩形覆盖
 * @Description
 * @date 2019/4/16/19:12
 */
public class Y_10_矩形覆盖 {
    public int RectCover(int target) {
        if(target<1){
            return 0;
        }
        if(target*2==2){
            return 1;
        }else if(target*2==4){
            return 2;
        }else {
            return RectCover(target-1)+RectCover(target-2);
        }
    }
}
