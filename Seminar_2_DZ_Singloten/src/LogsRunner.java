// Создаем класс для записи данных в лог
public class LogsRunner {
  public static void main(String[] args) {
    Logs.getLogs().addLogInfo("First log info");

//    Выводим на консоль logfile
    Logs.getLogs().showLogFile();
  }

}
