
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.ImageIcon;

public class Game extends JFrame {

    public String name = "Unknown";
    public List<Cards> cards;
    public Cards selectedCard;
    public Cards c1;
    public Cards c2;
    public Timer timer;
    public int clickCnt = 1;
    public int cntMillis;

    public Game(int n) {

        name = JOptionPane.showInputDialog(this, "Adınızı Giriniz:", "Yeni Oyuncu", JOptionPane.INFORMATION_MESSAGE);

        int numberOfCards = ((n / 2) * (n / 2) * 2);
        ArrayList<Cards> cardsList = new ArrayList<Cards>();
        ArrayList<Integer> cardVals = new ArrayList<Integer>();

        for (int i = 1; i <= numberOfCards; i++) {
            cardVals.add(i);
            cardVals.add(i);
        }
        Collections.shuffle(cardVals);

        for (int val : cardVals) {
            Cards c = new Cards();
            c.id = val;
            c.name = val + ".png";
            c.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    selectedCard = c;
                    doTurn();
                }
            });
            cardsList.add(c);
        }
        this.cards = cardsList;
       
        timer = new Timer(750, new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                checkCards();
            }
        });

        timer.setRepeats(false);

         
        Container board = getContentPane();
        
        board.setLayout(new GridLayout(n, n));
        for (Cards c : cards) {
            board.add(c);
            c.setIcon(new ImageIcon("icons/0.png"));

        }

        if (n == 4) {
            setSize(400, 400);
            Dimension d = new Dimension(300, 300);
            setMinimumSize(d);
        }
        if (n == 6) {
            setSize(600, 600);
            Dimension d = new Dimension(400, 400);
            setMinimumSize(d);
        }
        if (n == 8) {
            setSize(800, 800);
            Dimension d = new Dimension(600, 600);
            setMinimumSize(d);
        }
        setTitle("EŞ BULMA OYUNU");

        Thread t = new Thread() {
            public void run() {
                try {
                    while (!isGameWon()) {
                        Thread.sleep(1000);
                        cntMillis++;
                        TimeZone tz = TimeZone.getTimeZone("UTC");
                        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
                        df.setTimeZone(tz);
                        String time = df.format(new Date(cntMillis*1000));
                        System.out.println(time);
                        //System.out.println(cntMillis);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

    }

    public void doTurn() {
        if (c1 == null && c2 == null) {
            c1 = selectedCard;
            c1.setIcon(new ImageIcon("icons/" + c1.name));
        }

        if (c1 != null && c1 != selectedCard && c2 == null) {
            c2 = selectedCard;
            c2.setIcon(new ImageIcon("icons/" + c2.name));
            timer.start();

        }

    }

    public void checkCards() {
        if (c1.id == c2.id) { 
            c1.setEnabled(false); 
            c2.setEnabled(false);
            c1.isMatched = true;  
            c2.isMatched = true;
            if (this.isGameWon()) {
                JOptionPane.showMessageDialog(this, "Tebrikler " + name +"! Tahmin Sayınız: " + clickCnt, "KAZANDINIZ!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            ImageIcon image = new ImageIcon("icons/0.png");
            c1.setIcon(image);
            c2.setIcon(image);
        }
        clickCnt++;
        c1 = null;  
        c2 = null;
    }

    public boolean isGameWon() {
        for (Cards c : this.cards) {
            if (c.isMatched == false) {
                return false;
            }
        }
        return true;
    }

}
