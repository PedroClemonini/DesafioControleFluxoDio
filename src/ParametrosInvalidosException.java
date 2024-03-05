public class ParametrosInvalidosException extends Exception{
    private String detail;
    ParametrosInvalidosException(String s){
        detail = s;
    }
    ParametrosInvalidosException(){
        detail = "";
    }
    public String toString() {
        return "ParametrosInvalidosException: ["+detail+"]";
    }
}
