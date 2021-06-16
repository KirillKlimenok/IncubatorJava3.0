package dercochenko.com.Modules.Task7;

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
