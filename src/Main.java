public class Main {
    public static void main(String[] args) {
        SalesManager salesManager1 = new SalesManager(new long[]{100, 200, 252, 300, 420, 50});
        long maxSales1 = salesManager1.max();
        System.out.println(maxSales1);
        long statSales1 = salesManager1.stat();
        System.out.println(statSales1);

        SalesManager salesManager2 = new SalesManager(new long[]{1000, 20440, 2502, 45240, 120, 1110});
        long maxSales2 = salesManager2.max();
        System.out.println(maxSales2);
        long statSales2 = salesManager2.stat();
        System.out.println(statSales2);
    }
}
