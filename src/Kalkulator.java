import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class GUI extends JFrame implements ActionListener{
    JTextField disp = new JTextField();

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton btnTitik = new JButton(".");

    JButton btnTambah = new JButton("+");
    JButton btnKurang = new JButton("-");
    JButton btnKali = new JButton("x");
    JButton btnBagi = new JButton("/");

    JButton btnSamadengan = new JButton("=");
    JButton btnClear = new JButton("C");


    public GUI(){
        setTitle("Kalkulator");
        setDefaultCloseOperation(3);
        setSize(300,400);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnTitik.addActionListener(this);
        btnTambah.addActionListener(this);
        btnKurang.addActionListener(this);
        btnKali.addActionListener(this);
        btnBagi.addActionListener(this);
        btnSamadengan.addActionListener(this);
        btnClear.addActionListener(this);

        setLayout(null);
        add(disp);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(btnTitik);
        add(btnTambah);
        add(btnKurang);
        add(btnKali);
        add(btnBagi);
        add(btnSamadengan);
        add(btnClear);

        Font f = new Font("Tahoma", Font.BOLD, 18);
        disp.setFont(f);
        disp.setHorizontalAlignment(JTextField.RIGHT);

        //setBounds(m,n,o,p)
        //m = posisi x; n = posisi y
        // o = panjang komponen; p = tinggi komponen
        disp.setBounds(20,10,250, 40);
        btn1.setBounds(30, 120, 50,50);
        btn2.setBounds(90, 120, 50,50);
        btn3.setBounds(150, 120, 50,50);
        btn4.setBounds(30, 180, 50,50);
        btn5.setBounds(90, 180, 50,50);
        btn6.setBounds(150, 180, 50,50);
        btn7.setBounds(30, 240, 50,50);
        btn8.setBounds(90, 240, 50,50);
        btn9.setBounds(150, 240, 50,50);
        btn0.setBounds(30, 300, 110,50);
        btnTitik.setBounds(150, 300, 50,50);
        btnTambah.setBounds(210, 60, 50,50);
        btnKurang.setBounds(210, 120, 50,50);
        btnKali.setBounds(210, 180, 50,50);
        btnBagi.setBounds(210, 240, 50,50);
        btnSamadengan.setBounds(210, 300, 50,50);
        btnClear.setBounds(30, 60, 170,50);

        setVisible(true);
    }

    String bilangan="";
    double bil1, bil2, jumlah;
    int pilih;

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            bilangan+="1";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn2){
            bilangan+="2";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn3){
            bilangan+="3";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn4){
            bilangan+="4";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn5){
            bilangan+="5";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn6){
            bilangan+="6";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn7){
            bilangan+="7";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn8){
            bilangan+="8";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn9){
            bilangan+="9";
            disp.setText(bilangan);
        }
        if(e.getSource()==btn0){
            bilangan+="0";
            disp.setText(bilangan);
        }
        if(e.getSource()==btnTitik){
            bilangan+=".";
            disp.setText(bilangan);
        }
        if(e.getSource()==btnTambah){
            bil1 = Double.parseDouble(bilangan);
            bilangan="";
            pilih=1;
        }
        if(e.getSource()==btnKurang){
            bil1 = Double.parseDouble(bilangan);
            bilangan="";
            pilih=2;
        }
        if(e.getSource()==btnKali){
            bil1 = Double.parseDouble(bilangan);
            bilangan="";
            pilih=3;
        }
        if(e.getSource()==btnBagi){
            bil1 = Double.parseDouble(bilangan);
            bilangan="";
            pilih=4;
        }
        if(e.getSource()==btnClear){
            disp.setText(null);
            bil1=0.0;
            bil2=0.0;
            jumlah=0.0;
            bilangan="";
        }
        if(e.getSource()==btnSamadengan){
            switch (pilih){
                case 1 :
                    bil2 = Double.parseDouble(String.valueOf(disp.getText()));
                    jumlah = bil1+bil2;
                    bilangan = Double.toString(jumlah);
                    break;
                case 2 :
                    bil2 = Double.parseDouble(String.valueOf(disp.getText()));
                    jumlah = bil1-bil2;
                    bilangan = Double.toString(jumlah);
                    break;
                case 3 :
                    bil2 = Double.parseDouble(String.valueOf(disp.getText()));
                    jumlah = bil1*bil2;
                    bilangan = Double.toString(jumlah);
                    break;
                case 4 :
                    bil2 = Double.parseDouble(String.valueOf(disp.getText()));
                    jumlah = bil1/bil2;
                    bilangan = Double.toString(jumlah);
                    break;
            }
            disp.setText(bilangan);
        }

    }
}


public class Kalkulator {
    public static void main (String[] args){
        new GUI();
    }
}
