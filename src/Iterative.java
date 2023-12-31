public class Iterative {

    public static int findNumber(int nNumberToSearch) {
        
        if (nNumberToSearch <= 1) {
            return nNumberToSearch;
        }

        int fibNumberMin2 = 0;
        int fibNumberMin1 = 1;
        int fibNumberToReturn = 0;
        
        for (int i = 2; i <= nNumberToSearch; i++) {
            fibNumberToReturn = fibNumberMin2 + fibNumberMin1;
            fibNumberMin2 = fibNumberMin1;
            fibNumberMin1 = fibNumberToReturn;
        }
        return fibNumberToReturn;
    }
}
