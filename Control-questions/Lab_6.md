# Лабораторна робота №6

1. **Опишіть структуру шаблону проєктування «ланцюжок обов'язків»**  
   Шаблон «ланцюжок обов'язків» дозволяє обробляти запит об'єктом із ланцюжка об'єктів. Кожен об'єкт у ланцюжку перевіряє, чи може він обробити запит, інакше передає його наступному об'єкту.  
   **Структура**:
   - **Клієнт**: ініціює запит.
   - **Інтерфейс обробника**: визначає метод для обробки запиту.
   - **Конкретні обробники**: реалізують обробку запиту або передають його далі.

2. **Опишіть структуру шаблону проєктування «команда»**  
   Шаблон «команда» перетворює запити в окремі об'єкти, дозволяючи зберігати їх для подальшого виконання чи відміни.  
   **Структура**:
   - **Інтерфейс команди**: визначає метод виконання.
   - **Конкретні команди**: реалізують специфічні дії.
   - **Ініціатор**: зберігає та виконує команди.
   - **Клієнт**: створює команди та призначає ініціатору.

3. **Опишіть структуру шаблону проєктування «посередник»**  
   Шаблон «посередник» дозволяє об'єктам взаємодіяти через посередника, щоб зменшити зв’язність між об'єктами.  
   **Структура**:
   - **Посередник**: визначає інтерфейс для координації взаємодій.
   - **Конкретний посередник**: реалізує координацію між об'єктами.
   - **Колеги**: об'єкти, які взаємодіють через посередника.

4. **Опишіть структуру шаблону проєктування «знімок»**  
   Шаблон «знімок» дозволяє зберігати та відновлювати стан об'єкта без порушення його інкапсуляції.  
   **Структура**:
   - **Зберігач**: зберігає копію стану об'єкта.
   - **Творець**: створює знімок свого стану та може відновити його пізніше.
   - **Клієнт**: зберігає та використовує знімки.

5. **Опишіть структуру шаблону проєктування «спостерігач»**  
   Шаблон «спостерігач» дозволяє об'єктам спостерігати за змінами в стані іншого об'єкта та автоматично отримувати сповіщення про ці зміни.  
   **Структура**:
   - **Суб’єкт**: зберігає список спостерігачів і повідомляє їх про зміни.
   - **Інтерфейс спостерігача**: визначає метод оновлення.
   - **Конкретні спостерігачі**: отримують сповіщення та реагують на зміни.

6. **Опишіть структуру шаблону проєктування «стан»**  
   Шаблон «стан» дозволяє об'єкту змінювати свою поведінку залежно від стану.  
   **Структура**:
   - **Контекст**: утримує посилання на поточний об'єкт стану.
   - **Інтерфейс стану**: визначає методи, що відповідають різним станам.
   - **Конкретні стани**: реалізують поведінку для відповідних станів.

7. **Опишіть структуру шаблону проєктування «стратегія»**  
   Шаблон «стратегія» дозволяє змінювати поведінку об'єкта шляхом вибору різних алгоритмів.  
   **Структура**:
   - **Контекст**: використовує обрану стратегію.
   - **Інтерфейс стратегії**: визначає метод для алгоритму.
   - **Конкретні стратегії**: реалізують різні алгоритми для конкретного застосування.

8. **Опишіть структуру шаблону проєктування «шаблонний метод»**  
   Шаблон «шаблонний метод» визначає скелет алгоритму в базовому класі та дозволяє підкласам змінювати певні кроки алгоритму.  
   **Структура**:
   - **Абстрактний клас**: визначає шаблонний метод і незмінні кроки алгоритму.
   - **Конкретні класи**: реалізують змінювані кроки алгоритму.

9. **Опишіть структуру шаблону проєктування «відвідувач»**  
   Шаблон «відвідувач» дозволяє додавати нові операції до об'єктів без зміни їх класів, визначаючи операції в окремому класі відвідувача.  
   **Структура**:
   - **Інтерфейс відвідувача**: визначає метод для кожного класу елементів.
   - **Конкретні відвідувачі**: реалізують різні операції для елементів.
   - **Інтерфейс елемента**: приймає відвідувача.
   - **Конкретні елементи**: реалізують метод прийняття для відвідувача.
