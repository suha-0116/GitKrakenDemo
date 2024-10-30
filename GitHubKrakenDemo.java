public class GitHubKrakenDemo implements Runnable
{
    static long[] sums = new long[1000];
    int count = 0;
    public static void main (String[] args)
    {

        Thread[] t = new Thread[1000];
        for (int i = 0; i < t.length; i++)
        {
            t[i] = new Thread(new GitHubKrakenDemo());
            t[i].start();
            try {
                t[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long totalsum = 0;
        for (int i = 0; i < sums.length; i ++)
        {
            totalsum += sums[i];
        }
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = 1; i < 1000001; i++)
        {
            sum += i;
        }
        sums[count] = sum;
        count++;
    }
}
