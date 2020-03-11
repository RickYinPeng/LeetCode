package yp.华为;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Huawei02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line =sc.nextLine();
        String[] split = line.split(" ");
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < split.length; i=i+2) {
            Point p = new Point(Integer.valueOf( split[i]),Integer.valueOf(split[i+1]));
            list.add(p);
        }
        Point r = new Point(0,0);
        double minDistance = Double.MAX_VALUE;
        //求出离原点最近的点
        Point minPoint = getMinPoint(r, list);
        list.remove(minPoint);
        minDistance = r.distance(minPoint);
        //递归求出距离
        while (!list.isEmpty()){
            Point minPoint1 = getMinPoint(minPoint, list);
            minDistance += minPoint1.distance(minPoint);
            list.remove(minPoint1);
            minPoint = minPoint1;
        }
        System.out.println((int) (minDistance+r.distance(minPoint)));
    }
    public static Point getMinPoint(Point r,List<Point> list){
        double minDistance = Double.MAX_VALUE;
        Point minPoint = null;
        for (Point point : list) {
            if(r.distance(point)<minDistance){
                minDistance = r.distance(point);
                minPoint = point;
            }
        }
        return minPoint;
    }
}
