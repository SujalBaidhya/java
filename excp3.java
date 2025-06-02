class excp3{
    void calculate() throws ArithmeticException,NumberFormatException{

    }
    public static void main(String[] args) {
        excp3 t = new excp3();
        try{
            t.calculate();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}