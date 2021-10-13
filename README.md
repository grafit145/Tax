# Tax (Отчёт для налоговой)
## Описание:
Три магазина в городе продают товары. Каждый день при закрытии кассы подаётся общий отчет в налоговую службу по всем магазинам. Так как магазины закрываются одновременно - выручка тоже считается одновременно по всем магазинам.
## Работа программы
1. Генерация 3 массивов целых положительных чисел
2. Создание трех потоков, которые суммируют выручку (каждый по своему массиву) в общий отчёт
3. Главный поток ждет завершения всех рассчётов и печатает общий итог в консоль
