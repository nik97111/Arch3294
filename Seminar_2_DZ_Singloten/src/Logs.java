public class Logs {

  //  Создаем экземпляр
  private static Logs logs;

//  Создаем файл для записи действий
  private static String logfile = "Log files. \n";

//  Объявляем метод, возвращащий экземпляр logs
  public static synchronized Logs getLogs() {
     if(logs == null) {
       logs = new Logs();
     }
     return logs;
  }

//  Создаем конструктор
  private Logs() {

  }

//  Объявляем метод, принимающий информацию для logfile
  public void addLogInfo(String logInfo) {
    logfile += logInfo + "\n";
  }

  //  Объявляем метод для вывода logfile
  public void showLogFile() {
    System.out.println(logfile);
  }
}
