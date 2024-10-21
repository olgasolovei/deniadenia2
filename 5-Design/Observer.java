// Інтерфейс для спостерігачів (тих, хто отримує повідомлення про зміни)
public interface Observer {
    void update(WeatherData data); // Метод для отримання оновлених даних
}