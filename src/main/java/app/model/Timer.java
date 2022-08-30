package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class Timer {
    public Timer(){
        System.out.println("Timer bean is created");
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
