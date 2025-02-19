class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        notificationService.notify("Order processed successfully.");
    }
}