package session_4.bai_tap;

public class StopWatch {
    long startTime, endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("star: "+stopWatch.getStartTime());
        for (int i=0;i<=10000;i++){
            for (int j=0;j<=10000;j++){

            }
        }
        stopWatch.stop();
        System.out.println("stop: "+stopWatch.getEndTime());
        System.out.println("khoang: "+ stopWatch.getElapsedTime());
    }
}
