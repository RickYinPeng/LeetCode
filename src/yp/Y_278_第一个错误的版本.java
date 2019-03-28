package yp;

/**
 * @author RickYinPeng
 * @ClassName Y_278_第一个错误的版本
 * @Description
 * @date 2019/3/28/23:41
 */
public class Y_278_第一个错误的版本 {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low<=high){
            int mid = low+((high-low)>>1);

            if(!isBadVersion(mid)){
                low = mid+1;
            }else {
                if(isBadVersion(mid-1)){
                    high = mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }

}
