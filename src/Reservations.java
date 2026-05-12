import javax.swing.*;
import java.awt.*;

public class Reservations {





    private String lesson;
    private String time;
    private String length;
    private String instructor;
    private int reservationss;
    private JFrame frame;

    public Reservations(String lesson, String time, String length, String instructor, int reservationss) {
        this.lesson = lesson;
        this.time = time;
        this.length = length;
        this.instructor = instructor;
        this.reservationss = reservationss;
        this.frame = new JFrame("Reservations");
    }


    private void init() {
        this.frame.setSize(600,600);
        this.frame.setLayout(null);
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.getContentPane().setBackground(new Color(204, 153, 255));
    }





    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getReservationss() {
        return reservationss;
    }

    public void setReservations(int reservations) {
        this.reservationss = reservationss;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "lesson='" + lesson + '\'' +
                ", time='" + time + '\'' +
                ", length='" + length + '\'' +
                ", instructor='" + instructor + '\'' +
                ", reservationss=" + reservationss +
                '}';
    }

}
