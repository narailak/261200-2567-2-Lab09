public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        Ellipse ellipse = new Ellipse(8, 5);

        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse Area: " + calculator.calculateArea(ellipse));

        //LSP
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        penguin.move();
        ostrich.move();
        sparrow.move();
        sparrow.fly();
        eagle.move();
        eagle.fly();

        //DIP
        OrderProcessor emailProcessor = new OrderProcessor(new EmailNotifier());
        OrderProcessor smsProcessor = new OrderProcessor(new SMSNotifier());

        emailProcessor.processOrder();
        smsProcessor.processOrder();
    }
}