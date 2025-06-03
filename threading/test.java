// class Threads extends Thread {
//   public void run() {
//     System.out.println("This code is running in a thread");
//   }
// }
class Threads implements Runnable 
{    
  	// Method to start Thread
    public void run()
    {
      	String str = "Thread is Running Successfully";
        System.out.println(str);
    }

}

class test
{
    public static void main(String[] args) {
        Threads t = new Threads();
        t.run();
        
    }
}