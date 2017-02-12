package com.brainacad.lab2_13.test_enum3;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SHARK on 10.02.2017.
 */
public class TrainSchedule {
    public enum MyDayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;}
    class Train{
        int number;
        String stationDispatch;
        String stationArrival;
        String timeDispatch;
        String timeArrival;
        DayOfWeek[] days; //String day

        public Train(int number){
            this.number = number;
        }

        public int getNumber() {           return number;        }

        public void setNumber(int number) {            this.number = number;        }

        public String getStationDispatch() {            return stationDispatch;        }

        public void setStationDispatch(String stationDispatch) {            this.stationDispatch = stationDispatch;        }

        public String getStationArrival() {            return stationArrival;        }

        public void setStationArrival(String stationArrival) {            this.stationArrival = stationArrival;        }

        public String getTimeDispatch() {            return timeDispatch;        }

        public void setTimeDispatch(String timeDispatch) {            this.timeDispatch = timeDispatch;        }

        public String getTimeArrival() {            return timeArrival;        }

        public void setTimeArrival(String timeArrival) {            this.timeArrival = timeArrival;        }

        public DayOfWeek[] getDays() {            return days;        }

        public void setDays(DayOfWeek[] days) {            this.days = days;        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }
    Train [] trains;
    public TrainSchedule (int countTrain){
    this.trains = new Train[countTrain];
    }
    public void addTrain(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Add train schedule on new line(q - to exit) - ");
        int count = 0;
        while (scanner. hasNext()){
            String inputString = scanner.next();
            if (!inputString.equals("q")){
                if (trains[count]==null){
                    String[] strs = inputString.split(",");
                    Train train = new Train(Integer.parseInt(strs[0]));
                    DayOfWeek[] days = new DayOfWeek[1];
                    days[0] = DayOfWeek.valueOf(strs[1]);
                    train.setDays(days);
                    train.setStationDispatch(strs[2]);
                    train.setStationArrival(strs[3]);
                    train.setTimeDispatch(strs[4]);
                    train.setTimeArrival(strs[5]);
                    trains[count]=train;
                    count++;
                }
            }else {
                break;
            }
        }
    }



}
