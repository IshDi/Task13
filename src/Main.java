public class Main {
    public static void main(String[] args) {
        SalesManager salesManager1 = new SalesManager(new int[]{100, 200, 252, 300, 420, 50});
        int maxSales1 = salesManager1.max();
        System.out.println(maxSales1);

        SalesManager salesManager2 = new SalesManager(new int[]{1000, 20440, 2502, 45240, 120, 1110});
        int maxSales2 = salesManager2.max();
        System.out.println(maxSales2);
    }
}
