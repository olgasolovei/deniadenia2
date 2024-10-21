// Клас, що представляє дані про погодні умови
public class WeatherData {
    private int windSpeed; // Швидкість вітру

    // Конструктор для створення об'єкта з початковою швидкістю вітру
    public WeatherData(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    // Метод для отримання поточної швидкості вітру
    public int getWindSpeed() {
        return windSpeed;
    }

    // Метод для оновлення швидкості вітру
    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}