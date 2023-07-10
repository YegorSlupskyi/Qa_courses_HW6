package src;

public class Main {
    public static void main(String[] args) {
        Product iPhone = new Product(
                "iPhone 14 pro Max",
                14,
                72000,
                "256 gb, deep purple",
                true);
        System.out.println(iPhone.toString());

        Employee YegorSlupskyi = new Employee(
                "Yegor",
                "Slupskyi",
                "Quality Assurance",
                10.0);
        System.out.println(YegorSlupskyi.getFullName());
        System.out.println(YegorSlupskyi.toString());

        Triangle theFirstTriangle = new Triangle(
                3,
                4,
                5);
        System.out.println(theFirstTriangle.toString());
        System.out.println(theFirstTriangle.area());

        Loan theFirstLoan = new Loan(100000, 2, 10);
        System.out.println (theFirstLoan.toString());
        System.out.println (theFirstLoan.getInstallmentSize());


    }

}