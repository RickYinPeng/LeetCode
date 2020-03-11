package yp;

/**
 * @author RickYinPeng
 * @ClassName Test
 * @Description
 * @date 2019/3/26/23:37
 */
public class Test {
    public volatile int inc = 0;
    public void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
         Test test = new Test();
        for(int i=0;i<10;i++){
            /*new Thread(){
                public void run() {
                    for(int j=0;j<1;j++)
                        //System.out.println(UUID.randomUUID());
                        test.increase();
                };
            }.start();*/
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<1;j++)
                        test.increase();
                }
            });
        }
        Thread.sleep(3000);
        System.out.println(test.inc);
    }
}
