public class GitHubKrakenDemo implements Runnable
{
    long[] sums = new long[1000];
    int count = 0;
    public static void main (String[] args)
    {

        Thread[] t = new Thread[1000];
        for (int i = 0; i < t.length; i++)
        {
            t[i] = new Thread(new GitHubKrakenDemo());
            t[i].start();
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
 