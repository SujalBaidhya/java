class Agevalidation extends Exception{
    Agevalidation(String msg){
            super(msg);
    }
}
class excpt2
{
    public static void main(String[] args) {
        int age=20;
        try {
            if(age<18)
            {
                throw new Agevalidation("Illegal age");
            }
            else{
                throw new Agevalidation("Valid age");
            }
        } catch (Agevalidation e) {
            System.out.println(e.getMessage());
        }
    }
}