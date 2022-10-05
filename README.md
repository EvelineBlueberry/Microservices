# Microservices
запускаем по порядку реест, конфиг сервер, гейтвей, нейм-сервисы || 
все реквестики проходят через порт 9191 || 
эндпоинты:
post localhost:9191/books/ (жсончик с полями bookTitle и bookGenre),
get localhost:9191/books/{id книжечки},
post localhost:9191/users/ (жсончик с полями firstName, lastName, email и bookId),
get localhost:9191/users/{id юзера} || 
проблемы:
не работает хистрикс дэшбоард
не работают фолбек методы
