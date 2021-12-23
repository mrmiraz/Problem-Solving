
import java.util.Scanner;
public class SingleBitError {
    int[] hammingCodeArray;
    int tHammingBits;
    int tParityBits;
    public void codeGenerator(int[] senderBitArray, int tSenderBits){
        tParityBits=0;
        int i = 0;
        // Calculating total number of parity bits
        while(tSenderBits > (int)Math.pow(2, i)-i-1){
            tParityBits++;
            i++;
        }
        
        tHammingBits = tSenderBits + tParityBits;
        hammingCodeArray = new int[tHammingBits];
        int j = 0, k = 0;
        for(i = 0; i < tHammingBits; i++){
            if(i == (int)Math.pow(2, j)-1){
                hammingCodeArray[i] = -1;
                j++;
            }
            else{
                hammingCodeArray[i] = senderBitArray[k];
                k++;
            }
        }
        
        for(i = 0; i < tParityBits; i++){
            int position = (int)Math.pow(2, i);
            int parityValue = hammingCalc(position);
            hammingCodeArray[position-1] = parityValue;
        }
        for( i = 0; i < tHammingBits; i++){
            System.out.print(hammingCodeArray[i]);
        }
        System.out.println("\n");
    }
    
    public int hammingCalc(int position){
        int i = position-1;
        int oneCount = 0;
       
        while(i < tHammingBits){
            
            for(int j = i; j < i+position; j++){
               
                
            if(j < tHammingBits && hammingCodeArray[j] == 1){
                oneCount++;
                
                
            }
            
        }
        i = i + 2*position;
        }
        if(oneCount%2 == 0){
            return 0;
        }
        else{
            return 1;
        }
        
    }
    
    public void  checkCode(int[] receiverBitArray){
        for(int i = 0; i < tHammingBits; i++){
            System.out.print(hammingCodeArray[i]);
        }
        System.out.println("\n");
        int[] checkArray = new int[tParityBits];
        int errorPosition = 0, j = 0;
        for(int i = 0; i < tParityBits; i++){
            int position = (int)Math.pow(2,i);
            checkArray[i] = hammingCalc(position);
            errorPosition += checkArray[i]*(int)Math.pow(2, j++);
        }
        if(errorPosition != 0){
            if(hammingCodeArray[errorPosition-1] == 0){
                hammingCodeArray[errorPosition-1] = 1;
            }else{
                hammingCodeArray[errorPosition-1] = 0;
            }
        }
        for(int i = 0; i < tHammingBits; i++){
            System.out.print(hammingCodeArray[i]);
        }
        System.out.println("\n");
        correctionBits();
    }
    public void correctionBits(){
        int j = 0;
        for(int i = 0; i < tHammingBits; i++){
            if(j < tParityBits && i == (int)Math.pow(2, j)-1)j++;
            else{
                System.out.print(hammingCodeArray[i]);
            }
        }
    }
    public static void main(String[] args) {
        SingleBitError sbr = new SingleBitError();
        System.out.println("Hey Sender!\nEnter number of bits you want to send:");
        Scanner sc = new Scanner(System.in);
        int tSenderBits = sc.nextInt();
        int[] senderBitArray = new int[tSenderBits];
        for(int i = 0; i < tSenderBits; i++){
            senderBitArray[i] = sc.nextInt();
        }
        sbr.codeGenerator(senderBitArray, tSenderBits);
        
        System.out.println("Enter receiver code: ");
        int[] receiverBitsArray = new int[sbr.tHammingBits];
        for(int i = 0; i < sbr.tHammingBits; i++){
            receiverBitsArray[i] = sc.nextInt();
        }
        sbr.hammingCodeArray = receiverBitsArray;
        sbr.checkCode(receiverBitsArray);
        
    }
}
