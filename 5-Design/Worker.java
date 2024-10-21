// Спостерігач: працівник будівельного майданчика
public class ConstructionWorker implements Observer {
    private String workerName; // Ім'я працівника

    // Конструктор для створення працівника
    public ConstructionWorker(String workerName) {
        this.workerName = workerName;
    }

    // Метод для отримання оновлених погодних даних та перевірки ризиків
    @Override
    public void update(WeatherData data) {
        System.out.println("Сповіщення для працівника " + workerName);
        System.out.println("Швидкість вітру: " + data.getWindSpeed() + " м/с");
        if (data.getWindSpeed() > 20) {
            System.out.println("Увага! Сильний вітер. Існує ризик поломки крана.");
        } else {
            System.out.println("Поточні погодні умови безпечні для роботи.");
        }
    }
}
