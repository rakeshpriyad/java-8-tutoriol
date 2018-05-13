package comt.test.lambda;
public class WithoutLambdaExpressionThreadExample {
    public static void main(String[] args) {
 
           System.out.println("1 - Create thread, Implement Runnable interface using > Anonymous inner class");
           // Create thread, Implement Runnable interface using Anonymous inner class
 
           new Thread(new Runnable() {
                  @Override
                  public void run() {
                        System.out.println("Thread-1");
                  }
           }).start();
 
    }
 
}
 
/*OUTPUT
 
1 - Create thread, Implement Runnable interface using > Anonymous inner class
Thread-1
 
*/