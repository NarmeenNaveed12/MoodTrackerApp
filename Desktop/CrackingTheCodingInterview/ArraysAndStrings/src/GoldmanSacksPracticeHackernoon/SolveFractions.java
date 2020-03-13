package GoldmanSacksPracticeHackernoon;

public class SolveFractions {

    public void solveFractions(int[] fraction1, int[] fraction2){
        int denom = 0;
        int num = 0;
        int divisor = 0;
        if(fraction1[1] == fraction2[1]){
            denom = fraction1[1];
            num = fraction1[0] * fraction2[0];
        }
        else{
            denom = fraction1[1] * fraction2[1];
            num = fraction1[0] * fraction2[0];
        }

        if(num > denom){
           divisor = num;
        }
        else{
            divisor = denom;
        }

        for(int i = 0; i<=divisor; i++){
            if(num%i == 0 && denom%i == 0){
                num = num/i;
                denom = denom/i;
            }
        }

        //logic for getting simplified fraction
        int n = 1;
        int p = num;
        int q = denom;
        if( num != denom)
        {
            while(n != 0)
            {
                //storing remainder
                n = num % denom;
                if(n != 0)
                {
                    num = denom;
                    denom = n;
                }
            }
        }
        System.out.println("("+p/denom+" / "+q/denom+")");
    }
}
