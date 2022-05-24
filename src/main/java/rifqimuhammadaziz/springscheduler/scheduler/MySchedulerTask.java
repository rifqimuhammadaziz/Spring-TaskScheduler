package rifqimuhammadaziz.springscheduler.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
@EnableAsync
public class MySchedulerTask {

    /*
     Scheduler : No return type & no params (void only)
     * fixedDelay = 1000 ~ every 1 second, the function will execute if previous schedule is done
     * fixedRate = 1000 ~ every 1 second, the function will execute but not waiting done previous schedule
     * initialDelay = 2000 ~ add 2 second at the first time then running task
     * cron = "0 * * ? * *" ~ task execute every minute (start at 00)
     */
    @Async
    @Scheduled(cron = "0 * * ? * *")
    public void myFirstTask() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Task executed at: " + simpleDateFormat.format(System.currentTimeMillis()));
    }
}
