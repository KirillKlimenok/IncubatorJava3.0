package dercochenko.com.Modules.Task7;

/*
* Задача 7. Привет Аноним
Представьте, что у нас есть основная программа, которая постоянно работает и что-то делает. Создайте
систему мониторинга из нескольких модулей для этой программы.
Один модуль будет отслеживать общую производительность и вести журнал, второй - записывать и регистрировать ошибки в журнале
ошибок, третий - отслеживать подозрительные действия: например, попытки несанкционированного доступа и другие
вещи, связанные с безопасностью.
Поскольку все три модуля должны, по сути, просто запускаться в начале программы и работать в
фоновом режиме, было бы неплохо создать для них общий интерфейс:
public interface MonitoringSystem {
public void startMonitoring();
}
Он будет реализован 3 конкретными классами: GenerallndicatorsMonitoringModule,
ErrorMonitoringModule, SecurityModule. Пусть они отображают только ту строку, с которой начался их мониторинг.
Напишите приложение, в котором выходные данные этой строки заключены в анонимные классы.
* */

public class Task7 {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalIndicatorsMonitoringModule = new GeneralIndicatorsMonitoringModule() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of general indicators has started!");
            }
        };

        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule(){
            @Override
            public void startMonitoring() {
                System.out.println("Bug tracking monitoring has started!");
            }
        };

        SecurityModule securityModule = new SecurityModule(){
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring has started!");
            }
        };

        generalIndicatorsMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();
    }
}

interface MonitoringSystem {
    void startMonitoring();
}
