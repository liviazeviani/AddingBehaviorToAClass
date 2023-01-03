public class Meeting {

    public static void main(String[] args) {
        Date meetingDate = new Date(29, 2, 2023);
// this is not necessary anymore
//        meetingDate.month = 2;
//        meetingDate.day = 29;
//        meetingDate.year = 2023;

        System.out.println("The meeting will be on " + meetingDate.month + "/" + meetingDate.day + "/" + meetingDate.year);
    }
}
