public class SumWithoutSmalllest {

    public int l;
    public int[] a;
    public int sm,sum;

    public SumWithoutSmalllest(int[] a,int l) {
        this.a = a;
        this.l=l;
        sm=a[0];
        sum=0;
        for(int i=0;i<l;i++)
        {
            if(sm>a[i])
            {
                sum = sum + sm;
                sm=a[i];
            }
            else if(a[i]>sm) {
                sum = sum + a[i];
            }
        }

    }
    public void getDifference()
    {
        System.out.println(sum-sm);
    }


}