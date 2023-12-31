// – Создать окно клиента чата.
// Окно должно содержать JtextField для ввода логина,
// пароля, IP-адреса сервера, порта подключения к серверу,
// область ввода сообщений,
// JTextArea область просмотра сообщений чата и
// JButton подключения к серверу и отправки сообщения в чат.
// Желательно сразу сгруппировать
// компоненты, относящиеся к серверу сгруппировать
// на JPanel сверху экрана, а
// компоненты, относящиеся к отправке сообщения –
// на JPanel снизу.

//ДЗ 1. Графические интерфейсы
//Выполнить все задания семинара, если они не были решены, без ограничений по времени;
//Отправлять сообщения из текстового поля сообщения в лог по нажатию кнопки или по нажатию клавиши Enter на поле ввода сообщения;
//Продублировать импровизированный лог (историю) чата в файле;
//При запуске клиента чата заполнять поле истории из файла, если он существует.
// Обратите внимание, что чаще всего история сообщений хранится на сервере и заполнение истории чата лучше делать при соединении с сервером,
// а не при открытии окна клиента.

package org.example.S1;
public class Program {
    public static void main(String[] args) {
        new ConnectWindow();
    }
}
