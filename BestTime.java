public class BestTime {
    public static void main(String[] args) {
        //int[]stocks={7,1,45,3,6,4};
        int[]stocks={90,40,20,10,4};
        if(stocks.length<2)
            return;
        int cBuy =stocks[0],cSell=stocks[1];
        int mPro = cSell - cBuy;
        for(int curr=1;curr<stocks.length;curr++)
        {
            int cProc=stocks[curr]-cBuy;
        if(cProc>mPro)
        {
            mPro=cProc;
            cSell=stocks[curr];
        }
        if(stocks[curr]<cBuy) cBuy=stocks[curr];
        }
        System.out.println((cSell-mPro)+" "+cSell);

    }
    
}
