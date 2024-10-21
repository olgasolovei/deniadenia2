// Інтерфейс для об'єкта, за яким спостерігають
public interface Subject {
    void addObserver(Observer observer); // Додати спостерігача
    void removeObserver(Observer observer); // Видалити спостерігача
    void notifyObservers(); // Сповістити всіх спостерігачів
}

// Клас монітора погоди, що виступає об'єктом для спостереження
public class WeatherMonitor implements Subject {
    private List<Observer> observers; // Список спостерігачів
    private WeatherData weatherData; // Погодні дані

    // Конструктор для створення монітора з початковими даними про погоду
    public WeatherMonitor(int windSpeed) {
        observers = new ArrayList<>();
        weatherData = new WeatherData(windSpeed);
    }

    // Додаємо нового спостерігача
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Видаляємо спостерігача
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Сповіщаємо всіх спостерігачів про зміну погоди
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    // Метод для оновлення даних про швидкість вітру та сповіщення спостерігачів
    public void setWindSpeed(int windSpeed) {
        weatherData.setWindSpeed(windSpeed);
        notifyObservers(); // Сповіщаємо про нову швидкість вітру
    }
}