# Prototypes

@startuml
skinparam backgroundColor black
skinparam handwritten false
skinparam rectangle {
    BackgroundColor #333333
    BorderColor #FFFFFF
}

title Горизонтальний прототип системи моніторингу

package "Збір даних" {
    rectangle "Система моніторингу" as Monitoring
    rectangle "Збір даних про швидкість вітру" as WindData
    rectangle "Дані оновлюються щосекунди" as DataUpdate
    rectangle "Оповіщення про перевищення порогу" as Alert

    Monitoring --> WindData
    WindData --> DataUpdate
    DataUpdate --> Alert
}

package "Аналіз ризиків" {
    rectangle "Аналіз ризиків" as RiskAnalysis
    rectangle "Визначення небезпеки" as RiskAssessment
    rectangle "Сповіщення користувачів" as UserNotification

    RiskAnalysis --> RiskAssessment
    RiskAssessment --> UserNotification
}

package "Історія подій" {
    rectangle "Історія подій" as EventHistory
    rectangle "Зберігання даних" as DataStorage

    EventHistory --> DataStorage
}

note right of WindData
    Система збирає дані в реальному часі
end note

note right of Alert
    Система сповіщає про небезпечні ситуації
end note

note right of RiskAnalysis
    Система аналізує ризики аварійних ситуацій
end note

note right of DataStorage
    Система зберігає всі події для подальшого аналізу
end note

@enduml