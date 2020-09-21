package BT;

public class NextDayCalculator {

    public static String result(int day, int month, int year){
        boolean checkDay = day <= 31 && day >= 1;
        boolean checkMonth = month <= 12 && month >= 1;
        if (checkDay && checkMonth){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                  if (day < 31){
                      day += 1;
                  } else{
                      day = 1;
                      month += 1;
                  }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:

                    if (day < 30){
                        day += 1;
                    } else{
                        day = 1;
                        month += 1;
                    }
                    break;
                case 2:

                    if (year % 4 == 0){
                        if (day < 29){
                            day += 1;

                        } else{
                            day = 1;
                            month += 1;
                        }
                    } else {
                        if (day < 28){
                            day += 1;
                        } else{
                            day = 1;
                            month += 1;
                        }
                    }
                    break;
                case 12:

                    if (day < 31){
                        day += 1;
                    } else{
                        day = 1;
                        month = 1;
                        year += 1;
                    }
                    break;
            }
        } else System.out.println("Thời gian không hợp lệ.");
        return day+"-"+month+"-"+year;
    }
}
