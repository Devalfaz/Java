class args{
    public static void main(String[] args){
        float a=Float.parseFloat((args[0]));
        float b=Float.parseFloat((args[1]));
        System.out.println("SUM= "+ (a+b) +"\nDifference="+(a-b)  +"\nProduct"+ (a*b) +"\nQuotient"+(a/b)  +"\nRemainder"+(a%b));
    }
}