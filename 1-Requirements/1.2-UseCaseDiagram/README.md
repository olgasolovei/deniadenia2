## діаграма варіантів використання
@startuml
actor "Інспектор з охорони праці" as Inspector
actor "Менеджер з ризиків" as RiskManager
actor "Працівники будівництва" as Workers

usecase "Моніторинг поточних погодних умов" as UC1
usecase "Створення звіту про ризики" as UC2
usecase "Оцінка ризиків при плануванні робіт" as UC3
usecase "Оновлення протоколу безпеки" as UC4
usecase "Перевірка дозволу на проведення робіт" as UC5
usecase "Ознайомлення з інструкціями безпеки" as UC6

Inspector -- UC1
Inspector -- UC2
RiskManager -- UC3
RiskManager -- UC4
Workers -- UC5
Workers -- UC6
@enduml