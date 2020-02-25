package Java8;

@FunctionalInterface
interface aman
{
    void printme();
}
class Random {
    public static void main(String[] args) {
        aman a= ()-> {
            System.out.println("Aman Sharma");
        };
        a.printme();
    }
}
